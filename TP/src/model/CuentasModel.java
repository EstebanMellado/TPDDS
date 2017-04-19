package model;

import java.util.ArrayList;

import db.Cuenta_DAO;
import db.Cuenta_DAO_impl;
import db.Cuenta_DTO;

public class CuentasModel {
	
	private Cuenta_DAO accountEntity;
	
	public CuentasModel() {
		this.accountEntity = new Cuenta_DAO_impl();
	}

	public ArrayList<Cuenta_DTO> getCuentas(){
		return accountEntity.obtenerCuentas();
	}
	
	public int saveCuentas(ArrayList<Cuenta_DTO> cuentas){
		return accountEntity.guardarCuentas(cuentas);
	}
	
	public int getIdMax(){
		return this.getCuentas().size();
	}
}
