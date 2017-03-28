package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
	private float precio;
	
	@ManyToOne
	private Temporada tempo;
	
	/**
	   * Constructor for Capitulo class
	   *
	   * @param id id del objeto Capitulo
	   * @param nombre nombre del Actor
	   * @param num numero de capitulo dentro de la temporada 
	   * @param descripcion descripción del capítulo
	   * @param precio precio por capítulo dependiendo de la serie 
	   * @param tempo Temporada del capítulo
	   * 
	   */
	public Capitulo(String nombre, int num, String descripcion, float precio, Temporada tempo){
		this.nombre=nombre;
		this.num=num;
		this.descripcion=descripcion;
		this.precio=precio;	
		this.tempo=tempo;
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
	public void setPrecio(float precio){
		this.precio = precio;
	}
	public float getPrecio(){
		return this.precio;
	}
	public void setTempo(Temporada tempo){
		this.tempo=tempo;
	}
	public Temporada getTemporada(){
		return this.tempo;
	}
	
	@Override
	public int hashCode() {
        int hash = 17;
        hash = hash * 31 + id;
        hash = hash * 31 + num;
        hash = hash * 31 + descripcion.hashCode();
        hash = hash * 31 + (int) precio;
        return hash;
    }
	
	@Override
	public boolean equals(Object other){
		boolean e = false;
		 if (other == this) 
			e = true;
	     if (!(other instanceof Capitulo)) {
	        e= false;
	     }
	     if(((Capitulo) other).getId() == this.getId()){
	    	 e = true;
	     }
	     if (((Capitulo) other).getNum() == this.num && ((Capitulo) other).getTemporada() == this.getTemporada()){
	    	 e = true;
	     }
	     return e;
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
	public String toString()
	{
	    String result = "Capitulo número "+this.getNum()+" de la temporada " + 
	                     this.getTemporada()+ " de la serie "+this.getTemporada().getSerie()+
	                     " se titula"+this.getNombre()+" y tiene un precio de "+this.getPrecio();
	    return result;    
	}	
}
