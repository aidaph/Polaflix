package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TemporadaRepository extends JpaRepository<Temporada,Integer >{
	//Declare query methods on the interface.
	Temporada findByNumAndSerieOrderByNumAsc(int num, Serie serie);
	
	Temporada findByNum(int num);

	//List<Capitulo> findbyTemporada(int num);
	List<Temporada> findAllBySerie(int serieId);
	Temporada save(Temporada temporada);
	
	@Modifying
	@Query("select t from Temporada t where t.serie = ?1 ")
	List<Temporada> findBySerie(Serie serie);
	
	@Modifying
	@Query("select tempo from Capitulo c where c.tempo = ?1 ")
	Temporada findTempoByCapi(@Param("capitulo_id") int capitulo_id);	
	
}
