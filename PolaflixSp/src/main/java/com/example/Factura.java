package com.example;


/**
 * @(#) Factura.java
 */
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

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
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "factura_id")
	@OrderBy("id")
	private Set<CapituloVisualizado> listaCapitulosVistos;
	@OneToOne
	private Usuario user;
	
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
	public Factura(){
		
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(importeTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		//result = prime * result + ((listaCapitulosVistos == null) ? 0 : listaCapitulosVistos.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(importeTotal) != Double.doubleToLongBits(other.importeTotal))
			return false;
		if (listaCapitulosVistos == null) {
			if (other.listaCapitulosVistos != null)
				return false;
		} else if (!listaCapitulosVistos.equals(other.listaCapitulosVistos))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public int compareTo(Factura o) {
		return Integer.compare(this.getId(),o.getId());
	}
	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", importeTotal=" + importeTotal + ", listaCapitulosVistos="
				+ listaCapitulosVistos + ", user=" + user + "]";
	}	
	
}
