package db;

public class Cuenta_DTO {
	private long id;
	private String name;
	private double valor;
	private int year;
	
	public Cuenta_DTO(long id, String name, double valor, int year) {
		super();
		this.id = id;
		this.name = name;
		this.valor = valor;
		this.year = year;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getValor() {
		return valor;
	}
	public int getYear() {
		return year;
	}
	
	
}
