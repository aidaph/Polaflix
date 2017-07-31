package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ActorRepository extends JpaRepository<Actor,Integer>{
	//Declare query methods on the interface.
	List<Actor> findById(int id);
	List<Actor> findByNombre(String nombre);
	//List<Capitulo> findbyTemporada(int num);
	List<Actor> findAll();
	Capitulo save(Capitulo capitulo);
	
	@Modifying
	@Query("select a from Actor a where a.serie = ?1 ")
	List<Actor> findBySerie(Serie serie);
}
