package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @(#) Actor.java
 */

@Entity
public class Actor
{
	@Id
	@GeneratedValue
	private int id;
	private String nombre;

	public void setNombre(String nombre2){
		this.nombre=nombre2;
	}
	public String getNombre(){
		return nombre;
	}
	
	@Override
	public int hashCode() {
        int hash = 1;
        hash = hash * 17 + id;
        hash = hash * 31 + nombre.hashCode();
        return hash;
    }
	
	public boolean equals(String nombre2){
		return this.getNombre().equals(nombre2);	
	}
	
	public int compareTo(String nombre2){
		return this.getNombre().compareTo(nombre2);
	}
	
	
	
}
