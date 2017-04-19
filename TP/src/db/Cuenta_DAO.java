package db;

import java.util.ArrayList;

public interface Cuenta_DAO {
	public ArrayList <Cuenta_DTO> obtenerCuentas();
	public int guardarCuentas(ArrayList <Cuenta_DTO> cuentas);
}
