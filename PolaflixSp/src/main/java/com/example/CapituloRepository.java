package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CapituloRepository extends JpaRepository<Capitulo,Integer >{
	//Declare query methods on the interface.
	List<Capitulo> findById(int id);
	List<Capitulo> findByNum(int num);
	List<Capitulo> findByNombre(String nombre);
	//List<Capitulo> findbyTemporada(int num);
	List<Capitulo> findAll();
	Capitulo save(Capitulo capitulo);
	
	@Modifying
	@Query("select c from Capitulo c where c.tempo = ?1 ")
	List<Capitulo> findByTemporada(Temporada tempo);
	
}
