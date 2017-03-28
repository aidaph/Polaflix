package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Clase Actor que trabaja en una serie
 * 
 * @author Aida
 */

@Entity
public class Actor implements Comparable<Actor>
{
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	@ManyToOne
	private Serie serie;

	/**
	   * This constructor for Actor class
	   *
	   * @param id id del objeto Actor
	   * @param nombre nombre del Actor
	   * @param serie Serie a la que pertenece el actor
	   */
	public Actor(int id,String nombre, Serie serie){
		this.id=id;
		this.nombre = nombre;
		this.serie=serie;
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
		return nombre;
	}
	public void setSerie(Serie serie){
		this.serie=serie;
	}
	public Serie getSerie(){
		return serie;
	}
	
	/*@Override
	public int hashCode() {
        int hash = 1;
        hash = hash * 17 + id;
        hash = hash * 31 + nombre.hashCode();
        return hash;
    }*/
	@Override public int hashCode() {
	     return this.hashCode();
	 }
	
	@Override
	public boolean equals(Object other){
		 if (other == this) return true;
	     if (!(other instanceof Actor)) {
	        return false;
	     }
         Actor actor = (Actor) other;

         return actor.getNombre().equals(nombre);
	}
	
	/**
	  * @param actor is a non-null Actor.
	  *
	  * @throws NullPointerException if actor is null.
	  */
	@Override
	public int compareTo(Actor actor){
		return Integer.compare(this.getId(),actor.getId());
	}
	
	/**
	 * Creates and returns a string representation of this Actor.
	 * 
	 * @return a string representation of the course
	 */
	public String toString()
	{
	    String result = nombre;
	    return result; 
	}
	
}
