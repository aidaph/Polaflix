package com.example;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @(#) Usuario.java
 */
@Entity
public class Usuario implements Comparable<Usuario>
{
	@Id 
	@GeneratedValue
	private int id;
	private char username;
	private char password;
	private long ISBAN;
	@OneToMany
	private Set<Serie> seriesEmpezadas;
	@OneToMany
	private Set<Serie> seriesTerminadas;
	@OneToMany
	private Set<Serie> seriesPendientes;
	@OneToOne
	private CursorSerie ultimoCapitulo;
	
	/*
	 * Constructor de la clase Usuario
	 * @param id id del usuario 
	 * @param username nombre de usuario del Usuario
	 * @param password constraseña del usuario en Polaflix
	 * @param ISBAN cuenta bancaria del usuario
	 * @param seriesEmpezadas series ya empezadas por el usuario
	 * @param seriesTerminadas series terminadas por el usuario
	 * @param seriesPendientes series pendientes que tiene el usuario
	 * @param ultimoCapitulo ultimpo capítulo visto por el usuario
	 * 
	 */
	public Usuario (int id, char username, char password, long ISBAN, Set<Serie> seriesEmpezadas, Set<Serie> seriesTerminadas,
			Set<Serie> seriesPendientes, CursorSerie ultimoCapitulo){
		
	}
	//Getters and setters
	public void setId( int id ) {
	      this.id = id;
	}
		
	public int getId(){
		return this.id;
	}
	public void setUsername(char username){
		this.username=username;
	}
	public char getUsername(){
		return username;
	}
	public void setPassword(char password){
		this.password=password;
	}
	public char getPassword(){
		return password;
	}
	public void setIsban(long isban){
		this.ISBAN=isban;
	}
	public long getIsban(){
		return ISBAN;
	}
	
	public void setSeriesEmpezadas(Set<Serie> seriesEmpezadas){
		this.seriesEmpezadas=seriesEmpezadas;
	}
	public Set<Serie> getSeriesEmpezadas(){
		return seriesEmpezadas;
	}
	public void setSeriesTerminadas(Set<Serie> seriesTerminadas){
		this.seriesTerminadas=seriesTerminadas;
	}
	public Set<Serie> getSeriesTerminadas(){
		return seriesTerminadas;
	}
	public void setSeriesPendientes(Set<Serie> seriesPendientess){
		this.seriesPendientes=seriesPendientes;
	}
	public Set<Serie> getSeriesPendientes(){
		return seriesPendientes;
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
	     Usuario user = (Usuario) other;

      if (this.getId() == user.getId()) return true;
      else return false;
	}

	@Override
	public int compareTo(Usuario o) {
		return Integer.compare(this.getId(),o.getId());
	}
	
	
	public void verPerfil( )
	{
		
	}
	
	public void buscarSerie( )
	{
		
	}
	
	public Cargos verCargos( )
	{
		return null;
	}
	
	public void verSerie( )
	{
		
	}

	
}
