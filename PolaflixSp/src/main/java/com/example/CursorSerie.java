package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @(#) CursorSerie.java
 */
@Entity
public class CursorSerie implements Comparable<CursorSerie>
{
	@Id
	@GeneratedValue
	private int id;
	@OneToOne
	private Temporada ultimaTemporada;
	@OneToOne
	private Capitulo ultimoCapitulo;
	@OneToOne 
	@JoinColumn(name = "user_id")
	private Usuario user;
	@OneToOne
	@JoinColumn(name = "serie_id")
	private Serie serie;
	
	@JsonIgnore
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	@JsonIgnore
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	/*
	 * Constructor para CursorSerie
	 * 
	 * @param id id del cursor de la serie
	 * @param ultimaTemporada cursor te devuelve a la ultima temporada vista
	 */
	public CursorSerie(int id, Temporada ultimaTemporada){
		this.id=id;
		this.ultimaTemporada=ultimaTemporada;
	}
	public CursorSerie(){
		
	}
	
	//Getters y setters
	public void setId(int id){
	    this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setUltimaTempo(Temporada ultimaTemporada){
		this.ultimaTemporada=ultimaTemporada;
	}
	public Temporada getUltimaTemporada(){
		return ultimaTemporada;
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
	     CursorSerie cursor = (CursorSerie) other;

        if (this.getId() == cursor.getId()) return true;
        else return false;
	}

	@Override
	public int compareTo(CursorSerie o) {
		return Integer.compare(this.getId(),o.getId());
	}	
}