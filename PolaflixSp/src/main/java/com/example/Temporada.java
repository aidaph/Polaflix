package com.example;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @(#) Temporada.java
 */
@Entity
public class Temporada implements Comparable<Temporada>
{
	@Id
	@GeneratedValue
	@Column( name = "idTemporada")
	private int id;
	private int num;
	@OneToMany 
	private Set<Capitulo> listaCapitulos;
	@ManyToOne
	private Serie serie;
	
	/*
	 * Constructor de la clase Temporada
	 * 
	 *  @param id id de la temporada 
	 *  @param num numero de la temporada dentro de la serie
	 *  @param listaCapitulos lista de capitulos de la temporada
	 *  @param serie serie a la que pertenece la temporada
	 */
	public Temporada(int id, int num, Set<Capitulo> listaCapitulos,Serie serie ){
		this.id=id;
		this.num=num;
		this.listaCapitulos=listaCapitulos;
		this.serie=serie;
	}
	
	// Getters and Setters
	public void setId( int id ) {
	      this.id = id;
	}
		
	public int getId(){
		return this.id;
	}
	
	public void setNum( int num) {
	      this.num = num;
	}
		
	public int getNum(){
		return this.num;
	}
	public void setListaCapitulos(Set<Capitulo> listaCapitulos){
		this.listaCapitulos=listaCapitulos;
	}
	public Set<Capitulo> getListaCapitulos(){
		return listaCapitulos;
	}
	public void setSerie(Serie serie){
		this.serie=serie;
	}
	public Serie getSerie(){
		return this.serie;
	}
	
	@Override public int hashCode() {
	     return this.hashCode();
	 }
	
	@Override
	public boolean equals(Object other){
		boolean e = false;
		 if (other == this) 
			e = true;
	     if (!(other instanceof Temporada)) {
	        e= false;
	     }
	     if(((Temporada) other).getId() == this.getId()){
	    	 e = true;
	     }
	     if (((Temporada) other).getNum() == this.num && ((Temporada) other).getSerie() == this.getSerie()){
	    	 e = true;
	     }
	     return e;
	}
	
	@Override
	public int compareTo(Temporada tempo){
		return Integer.compare(this.getId(),tempo.getId());
	}
	
	/**
	 * Creates and returns a string representation of this Actor.
	 * 
	 * @return a string representation of the course
	 */
	public String toString()
	{
	    String result = "El número de temporada es " + this.getNum();
	    return result;
	    
	}
}
