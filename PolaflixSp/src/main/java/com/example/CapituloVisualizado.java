package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @(#) CapituloVisualizado.java
 */
import java.util.Date;

@Entity
public class CapituloVisualizado implements Comparable< CapituloVisualizado>
{
	@Id
	@GeneratedValue
	private int id;
	private Date fecha;
	
	// Capitulo visualizado
	@OneToOne
	private Capitulo capitulo;
	
	/*
	 * Constructor para CapituloVisualizado
	 * 
	 * @param id id del capitulo visualizado
	 * @param fecha fecha en la que se vio el capitulo
	 * @param capitulo capitulo visualizado
	 */
	public CapituloVisualizado(int id, Date fecha, Capitulo capitulo){
		this.id=id;
		this.fecha=fecha;
	}
	
	//Getters and setters
	public void setId( int id ) {
	     this.id = id;
	}		
	public int getId(){
		return this.id;
	}
	public void SetFecha(Date fecha){
		this.fecha=fecha;
	}
	public Date getFecha(){
		return this.fecha;
	}
	public void setCapitulo(Capitulo capitulo){
		this.capitulo=capitulo;	
	}
	public Capitulo getCapitulo(){
		return this.capitulo;
	}
	
	@Override public int hashCode() {
	     return this.hashCode();
	 }
	
	@Override
	public boolean equals(Object other){
		 if (other == this) return true;
	     if (!(other instanceof CapituloVisualizado)) {
	        return false;
	     }
	     CapituloVisualizado cp = (CapituloVisualizado) other;

         if (this.getId() == cp.getId()) return true;
         else return false;
	}
	@Override
	public int compareTo(CapituloVisualizado capi){
		return Integer.compare(this.getId(),capi.getId());
	}	
	
		
}
