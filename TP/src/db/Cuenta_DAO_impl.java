package db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cuenta_DAO_impl implements Cuenta_DAO {
	private final String SEPARATOR = ",";
	private String csvFile = "C:/Users/Martin/workspace/TP/WebContent/cuentas.csv";
	private String line = "";

	@Override
	public ArrayList<Cuenta_DTO> obtenerCuentas() {
		ArrayList<Cuenta_DTO> cuentas = new ArrayList<Cuenta_DTO>();
		Cuenta_DTO c;

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				String[] cuenta = line.split(SEPARATOR);
				c = new Cuenta_DTO(Long.parseLong(cuenta[0]), cuenta[1], Double.parseDouble(cuenta[2]),
						Integer.parseInt(cuenta[3]));
				cuentas.add(c);
			}

			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return cuentas;
	}

	@Override
	public int guardarCuentas(ArrayList<Cuenta_DTO> cuentas) {
		int idOp = 0;
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter(csvFile, true);
			pw = new PrintWriter(fichero);

			for (Cuenta_DTO c : cuentas) {
				pw.print("\n" + Long.toString(c.getId()) + SEPARATOR + c.getName() + SEPARATOR
						+ Double.toString(c.getValor()) + SEPARATOR + Integer.toString(c.getYear()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			idOp = 1;
		} finally {

			if (null != fichero)
				try {
					fichero.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					idOp = 2;
				}
			try {
			} catch (Exception e2) {
				e2.printStackTrace();
				idOp = 2;
			}
		}

		return idOp;
	}

}
