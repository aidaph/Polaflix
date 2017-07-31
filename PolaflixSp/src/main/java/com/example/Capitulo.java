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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @(#) Capítulo.java
 */
@Entity
public class Capitulo implements Comparable<Capitulo>
{
	@Id
	@GeneratedValue
	private int id;
	private String nombre; 
    private int num;
	private String descripcion;
	private double precio;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "tempo_id")
	private Temporada tempo;

	/**
	   * Constructor for Capitulo class
	   *
	   * @param id id del objeto Capitulo
	   * @param nombre nombre del Actor
	   * @param num numero de capitulo dentro de la temporada 
	   * @param descripcion descripción del capítulo
	   * @param  precio por capítulo dependiendo de la serie 
	   * @param tempo Temporada del capítulo
	   * 
	   */
	public Capitulo(String nombre, int num, String descripcion, double precio){
		this.nombre=nombre;
		this.num=num;
		this.descripcion=descripcion;
		this.precio=precio;	
		//this.tempo=tempo;
	}
	public Capitulo(){
		
	}
	// Getters and Setters
	public void setId( int id ) {
	     this.id = id;
	}		
	public int getId(){
		return this.id;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNum(int num){
		this.num=num;
	}
	public int getNum(){
		return this.num;
	}
	public void setDes(String descripcion){
		this.descripcion = descripcion;
	}
	public String getDes(){
		return this.descripcion;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}
	public double getPrecio(){
		return this.precio;
	}
	public void setTempo(Temporada tempo){
		this.tempo=tempo;
	}
	@JsonIgnore
	public Temporada getTemporada(){
		return this.tempo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + num;
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tempo == null) ? 0 : tempo.hashCode());
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
		Capitulo other = (Capitulo) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (num != other.num)
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (tempo == null) {
			if (other.tempo != null)
				return false;
		} else if (!tempo.equals(other.tempo))
			return false;
		return true;
	}
	
	//@Override
	/*public int compareTo(Object other){
		Temporada t= (Temporada) other;
		return this.getId().compareTo(t.getId());
	}*/
	/**
	  * @param actor is a non-null Actor.
	  *
	  * @throws NullPointerException if actor is null.
	  */
	@Override
	public int compareTo(Capitulo capi){
		return this.getNombre().compareTo(capi.getNombre());
	}
	/**
	 * Creates and returns a string representation of this Actor.
	 * 
	 * @return a string representation of the course
	 */
	@Override
	public String toString() {
		return "Capitulo num=" + num + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio ;
	}
	
}
