package com.example;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

/**
 * @(#) Factura.java
 */
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * Clase Factura para devolver el importe Total del mes 
 * 
 * @author Aida
 */
@Entity
public class Factura implements Comparable<Factura>
{
	@Id
	@GeneratedValue
	private int id;
	private Date fecha;
	private double importeTotal;
	
	@OneToMany
	private Set<CapituloVisualizado> listaCapitulosVistos;
	
	/*
	 * Constructor para Factura
	 * 
	 * @param id id de la factura
	 * @param fecha fecha en la que se vio el capitulo
	 * @param importeTotal importe total del mes 
	 */
	public Factura(int id, Date fecha, double importeTotal,Set<CapituloVisualizado> listaCapitulosVistos){
		this.id=id;
		this.fecha=fecha;
		this.importeTotal=importeTotal;
		this.listaCapitulosVistos=listaCapitulosVistos;
	}
	//Getters and Setters
	public void setId( int id ) {
	     this.id = id;
	}		
	public int getId(){
		return this.id;
	}
	public void setFecha(Date fecha){
		this.fecha=fecha;
	}
	public Date getFecha(){
		return this.fecha;
	}
	public void setImporteTotal(double importe){
		this.importeTotal=importe;
	}
	public double getImporteTotal(){
		return this.importeTotal;
	}
	public void setCapitulosVisualizados(Set<CapituloVisualizado> listaCapitulosVistos){
		this.listaCapitulosVistos=listaCapitulosVistos;
	}
	public Set<CapituloVisualizado> getCapitulosVisualizados(){
		return this.listaCapitulosVistos;
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
	     Factura factura = (Factura) other;

       if (this.getId() == factura.getId()) return true;
       else return false;
	}
	@Override
	public int compareTo(Factura o) {
		return Integer.compare(this.getId(),o.getId());
	}	
	
}
