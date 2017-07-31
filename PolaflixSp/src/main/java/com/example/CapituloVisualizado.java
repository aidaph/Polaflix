package com.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "factura_id")
	private Factura factura;
	
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
	public CapituloVisualizado(){
		
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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitulo == null) ? 0 : capitulo.hashCode());
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
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
		CapituloVisualizado other = (CapituloVisualizado) obj;
		if (capitulo == null) {
			if (other.capitulo != null)
				return false;
		} else if (!capitulo.equals(other.capitulo))
			return false;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int compareTo(CapituloVisualizado capi){
		return Integer.compare(this.getId(),capi.getId());
	}
	@Override
	public String toString() {
		return "CapituloVisualizado [id=" + id + ", fecha=" + fecha + ", capitulo=" + capitulo + ", factura=" + factura
				+ "]";
	}	
	
		
}
