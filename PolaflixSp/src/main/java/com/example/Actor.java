package com.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



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
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "serie_id")
	@JsonIgnore
	private Serie serie;

	/**
	   * This constructor for Actor class
	   *
	   * @param id id del objeto Actor
	   * @param nombre nombre del Actor
	   * @param serie Serie a la que pertenece el actor
	   */
	public Actor(int id, String nombre){
		this.id=id;
		this.nombre = nombre;
		//this.serie=serie;
	}
	public Actor(){
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Actor other = (Actor) obj;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		return true;
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
	@Override
	public String toString() {
		return nombre;
	}

	
	
	
}
