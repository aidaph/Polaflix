package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * @(#) CapituloVisualizado.java
 */
import java.util.Date;

@Entity
public class CapituloVisualizado
{
	@Id
	@GeneratedValue
	private Date fecha;
	
	
	private Capitulo capitulo;
		
}
