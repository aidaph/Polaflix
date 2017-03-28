package com.example;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Clase serie que agrupa la lista de temporadas y de actores que participan en la serie
 * 
 * @author Aida
 */
@Entity
public class Serie implements Comparable<Serie>
{
	@Id
	@GeneratedValue	
	private int id;
	private String titulo;
	@Enumerated
	private TipoSerie tipoSerie;
	private char descripcion;
	private char creador;
	@OneToMany(mappedBy = "serie") 
	private Set<Actor> listaActores;
	@OneToMany(mappedBy = "serie")
	private Set<Temporada> listaTemporadas;
	
	/*
	 * Constructor para Serie
	 * 
	 * @param id id de la serie
	 * @param titulo titulo de la serie
	 * @param tipoSerie tipo de serie 
	 * @param descripcion descripcion de la serie
	 * @param creador creador de la serie
	 * @param lisaActores lista de actores de la serie
	 * @param listaTemporadas lista de temporadas de la serie
	 */
	public Serie(int id, String titulo, TipoSerie tipoSerie, char descripcion, char creador,Set<Actor> listaActores,Set<Temporada> listaTemporadas){
		this.id=id;
		this.titulo=titulo;
		this.tipoSerie=tipoSerie;
		this.descripcion=descripcion;
		this.creador=creador;
	}
	// Getters and Setters
	public void setId( int id ) {
	     this.id = id;
	}		
	public int getId(){
		return this.id;
	}
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public void setTipoSerie(TipoSerie tipo){
		this.tipoSerie=tipo;
	}
	public TipoSerie getTipoSerie(){
		return this.tipoSerie;
	}
	public void setDescripcion(char des){
		this.descripcion=des;
	}
	public char getDescripcion(){
		return this.descripcion;
	}
	public void setCreador(char creador){
		this.creador=creador;
	}
	public char getCreador(){
		return this.creador;
	}
	public void setListaActores(Set<Actor> listaActores){
		this.listaActores=listaActores;
	}
	public Set<Actor> getListaActores(){
		return this.listaActores;
	}
	public void setlistaTemporadas(Set<Temporada> listaTemporadas){
		this.listaTemporadas=listaTemporadas;
	}
	public Set<Temporada> getListaTemporadas(){
		return this.listaTemporadas;
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
	     Serie serie = (Serie) other;

      if (this.getId() == serie.getId()) return true;
      else return false;
	}
	@Override
	public int compareTo(Serie o) {
		return Integer.compare(this.getId(),o.getId());
	}
	
	/*public double calcularPrecioCapitulo(){
		double precio=0.0;
		switch(tipoSerie){
		    case ESTANDAR: 
		    	precio=0.50;
		    	break;
		    case SILVER:
		    	precio=0.75;
		    	break;
		    case GOLD:
		    	precio=1.50;
		    	break;
		}
		return precio;
	}*/
	
	
	
}
