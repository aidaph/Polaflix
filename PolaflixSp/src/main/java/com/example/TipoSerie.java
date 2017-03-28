package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public enum TipoSerie {
	ESTANDAR(0.5),SILVER(0.75), GOLD(1.5);
	
	@Id
	@GeneratedValue
	private int id;
	private double precio;
	
	TipoSerie(double precio){
		this.precio=precio;
	}
}

