package com.example;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * Clase Cargos que muestra el historial de facturas y así poder 
 * ir navegando por las facturas dependiendo del mes en el que 
 * nos encontremos 
 * 
 *  @author Aida 
 */
@Entity
public class Cargos implements Comparable<Cargos>
{
	@Id
	@GeneratedValue
	private int id;
	@OneToMany
	private Set<Factura> listaFacturas;
	
	/*
	 * Constructor para Cargos
	 * 
	 * @param id id del historial de Cargos
	 * @param listaFacturas lista de las facturas
	 */
	public Cargos(int id, Set<Factura> listaFacturas){
		this.id=id;
		this.listaFacturas=listaFacturas;
	}
	public Cargos(){
	}
	
	//Getters and Setters
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setFacturas(Set<Factura> listaFacturas){
		this.listaFacturas=listaFacturas;
	}
	public Set<Factura> getListaFacturas(){
		return listaFacturas;
	}
	
	public Factura getUltimaFactura( )
	{
		return null;
	}	
	
	public void addFactura(Factura factura){
		listaFacturas.add(factura);
	}

	@Override public int hashCode() {
	     return this.hashCode();
	 }
	
	@Override
	public boolean equals(Object other){
		 if (other == this) return true;
	     if (!(other instanceof Actor)) {
	        return false;
	     }
        Cargos cargos = (Cargos) other;

        if (this.getId() == cargos.getId()) return true;
        else return false;
	}
	
	@Override
	public int compareTo(Cargos cargos) {
		return Integer.compare(this.getId(),cargos.getId());
	}
	
	
}
