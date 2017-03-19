package com.example;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import Temporada;

/**
 * @(#) Serie.java
 */
@Entity
public class Serie
{
	@Id
	@GeneratedValue	
	private char titulo;
	
	@Enumerated
	private TipoSerie tipoSerie;
	
	private char descripcion;
	
	private char creador;
	
	private Actor listaActores;
	
	private Temporada listaTemporadas;
	
	
	
	
}
