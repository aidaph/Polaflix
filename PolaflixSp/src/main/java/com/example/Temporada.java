package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.OrderBy;
import org.springframework.core.annotation.Order;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @(#) Temporada.java
 */
@Entity
public class Temporada implements Comparable<Temporada>
{
	@Id
	@GeneratedValue
	private int id;
	private int num;
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
	@JoinColumn(name = "tempo_id")
	@OrderBy("num")
	private Set<Capitulo> listaCapitulos = new HashSet<Capitulo>();
	//@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "serie_id")
	@JsonIgnore
	private Serie serie;
	
	/*
	 * Constructor de la clase Temporada
	 * 
	 *  @param id id de la temporada 
	 *  @param num numero de la temporada dentro de la serie
	 *  @param listaCapitulos lista de capitulos de la temporada
	 *  @param serie serie a la que pertenece la temporada
	 */
	public Temporada(int num, Set<Capitulo> listaCapitulos ){
		this.id=id;
		this.num=num;
		this.listaCapitulos=listaCapitulos;
		//this.serie=serie;
	}
	public Temporada(){
		
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		//result = prime * result + ((listaCapitulos == null) ? 0 : listaCapitulos.hashCode());
		result = prime * result + num;
		//result = prime * result + ((serie == null) ? 0 : serie.hashCode());
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
		Temporada other = (Temporada) obj;
		if (id != other.id)
			return false;
		if (listaCapitulos == null) {
			if (other.listaCapitulos != null)
				return false;
		} else if (!listaCapitulos.equals(other.listaCapitulos))
			return false;
		if (num != other.num)
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Temporada tempo){
		return Integer.compare(this.getId(),tempo.getId());
	}
	public String toString(Set<Capitulo> listaCapitulos) {
		return "Temporada num=" + num + ", Capitulos=" + listaCapitulos+ "\n";
	}

}
