package com.example;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private String username;
	private String password;
	private String ISBAN;
	private boolean cuotaFija;
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private Set<Serie> seriesEmpezadas;
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private Set<Serie> seriesTerminadas;
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
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
	public Usuario(int id, String username, String password, String iSBAN, boolean cuotaFija,
			Set<Serie> seriesEmpezadas, Set<Serie> seriesTerminadas, Set<Serie> seriesPendientes,
			CursorSerie ultimoCapitulo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		ISBAN = iSBAN;
		this.cuotaFija = cuotaFija;
		this.seriesEmpezadas = seriesEmpezadas;
		this.seriesTerminadas = seriesTerminadas;
		this.seriesPendientes = seriesPendientes;
		this.ultimoCapitulo = ultimoCapitulo;
	}

	public Usuario() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getISBAN() {
		return ISBAN;
	}

	public void setISBAN(String iSBAN) {
		ISBAN = iSBAN;
	}

	public boolean isCuotaFija() {
		return cuotaFija;
	}

	public void setCuotaFija(boolean cuotaFija) {
		this.cuotaFija = cuotaFija;
	}

	public Set<Serie> getSeriesEmpezadas() {
		return seriesEmpezadas;
	}

	public void setSeriesEmpezadas(Set<Serie> seriesEmpezadas) {
		this.seriesEmpezadas = seriesEmpezadas;
	}

	public Set<Serie> getSeriesTerminadas() {
		return seriesTerminadas;
	}

	public void setSeriesTerminadas(Set<Serie> seriesTerminadas) {
		this.seriesTerminadas = seriesTerminadas;
	}

	public Set<Serie> getSeriesPendientes() {
		return seriesPendientes;
	}

	public void setSeriesPendientes(Set<Serie> seriesPendientes) {
		this.seriesPendientes = seriesPendientes;
	}

	public CursorSerie getUltimoCapitulo() {
		return ultimoCapitulo;
	}

	public void setUltimoCapitulo(CursorSerie ultimoCapitulo) {
		this.ultimoCapitulo = ultimoCapitulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBAN == null) ? 0 : ISBAN.hashCode());
		result = prime * result + (cuotaFija ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		//result = prime * result + ((seriesEmpezadas == null) ? 0 : seriesEmpezadas.hashCode());
		//result = prime * result + ((seriesPendientes == null) ? 0 : seriesPendientes.hashCode());
		//result = prime * result + ((seriesTerminadas == null) ? 0 : seriesTerminadas.hashCode());
		//result = prime * result + ((ultimoCapitulo == null) ? 0 : ultimoCapitulo.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Usuario other = (Usuario) obj;
		if (ISBAN == null) {
			if (other.ISBAN != null)
				return false;
		} else if (!ISBAN.equals(other.ISBAN))
			return false;
		if (cuotaFija != other.cuotaFija)
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (seriesEmpezadas == null) {
			if (other.seriesEmpezadas != null)
				return false;
		} else if (!seriesEmpezadas.equals(other.seriesEmpezadas))
			return false;
		if (seriesPendientes == null) {
			if (other.seriesPendientes != null)
				return false;
		} else if (!seriesPendientes.equals(other.seriesPendientes))
			return false;
		if (seriesTerminadas == null) {
			if (other.seriesTerminadas != null)
				return false;
		} else if (!seriesTerminadas.equals(other.seriesTerminadas))
			return false;
		if (ultimoCapitulo == null) {
			if (other.ultimoCapitulo != null)
				return false;
		} else if (!ultimoCapitulo.equals(other.ultimoCapitulo))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", ISBAN=" + ISBAN
				+ ", cuotaFija=" + cuotaFija + ", seriesEmpezadas=" + seriesEmpezadas + ", seriesTerminadas="
				+ seriesTerminadas + ", seriesPendientes=" + seriesPendientes + ", ultimoCapitulo=" + ultimoCapitulo
				+ "]";
	}

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	 
	
}