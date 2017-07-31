package com.example;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	private String name;
	@Enumerated
	private TipoSerie tipoSerie;
	private String descripcion;
	private String creador;
	private String imageUrl;
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL) 
	@JoinColumn(name = "serie_id")
	private Set<Actor> listaActores= new HashSet<Actor>();
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "serie_id")
	private Set<Temporada> listaTemporadas =new HashSet<Temporada>();
	
	public Serie(){
		
	}
	/*
	 * Constructor para Serie
	 * 
	 * @param id id de la serie
	 * @param titulo titulo de la serie
	 * @param tipoSerie tipo de serie 
	 * @param descripcion descripcion de la serie
	 * @param creador creador de la serie
	 * @param listaActores lista de actores de la serie
	 * @param listaTemporadas lista de temporadas de la serie
	 */
	public Serie(int id, String name, TipoSerie tipoSerie, String descripcion, String creador,Set<Actor> listaActores,Set<Temporada> listaTemporadas){
		this.id=id;
		this.name=name;
		this.tipoSerie=tipoSerie;
		this.descripcion=descripcion;
		this.creador=creador;
		this.listaActores=listaActores;
		this.listaTemporadas=listaTemporadas;
	}
	// Getters and Setters
	public void setId( int id ) {
	     this.id = id;
	}		
	public void setListaTemporadas(Set<Temporada> listaTemporadas) {
		this.listaTemporadas = listaTemporadas;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setTipoSerie(TipoSerie tipo){
		this.tipoSerie=tipo;
	}
	public TipoSerie getTipoSerie(){
		return this.tipoSerie;
	}
	public void setDescripcion(String des){
		this.descripcion=des;
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	public void setCreador(String creador){
		this.creador=creador;
	}
	public String getCreador(){
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creador == null) ? 0 : creador.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + ((listaActores == null) ? 0 : listaActores.hashCode());
		result = prime * result + ((listaTemporadas == null) ? 0 : listaTemporadas.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tipoSerie == null) ? 0 : tipoSerie.hashCode());
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
		Serie other = (Serie) obj;
		if (creador == null) {
			if (other.creador != null)
				return false;
		} else if (!creador.equals(other.creador))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (listaActores == null) {
			if (other.listaActores != null)
				return false;
		} else if (!listaActores.equals(other.listaActores))
			return false;
		if (listaTemporadas == null) {
			if (other.listaTemporadas != null)
				return false;
		} else if (!listaTemporadas.equals(other.listaTemporadas))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tipoSerie != other.tipoSerie)
			return false;
		return true;
	}
	@Override
	public int compareTo(Serie o) {
		return Integer.compare(this.getId(),o.getId());
	}
	
	@Override
	public String toString() {
		return "Serie [id=" + id + ", name=" + name + ", tipoSerie=" + tipoSerie + ", descripcion=" + descripcion
				+ ", creador=" + creador+ ", Temporadas = "+ listaTemporadas +", Actores="+listaActores;
	}
	
	
	
}
