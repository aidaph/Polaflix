package com.example;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SerieRepository extends JpaRepository<Serie,Integer>{
	//Declare query methods on the interface.
	Serie findById(int id);
	
	List<Serie> findByName(String name);
	
	//List<Capitulo> findCapitulobyTemporada(int num);
	List<Serie> findAll();
	
	@Query("SELECT seriesEmpezadas FROM Usuario WHERE usuario_id=:user_id")
	List<Serie> findEmpezadasByUser(@Param("user_id") int user_id);
	
	@Query("SELECT seriesPendientes FROM Usuario WHERE usuario_id=:user_id")
	List<Serie> findPendientesByUser(@Param("user_id") int user_id);
	
	@Query("SELECT seriesTerminadas FROM Usuario WHERE usuario_id=:user_id")
	List<Serie> findTerminadasByUser(@Param("user_id") int user_id);
	
	@Query("SELECT s FROM Serie s WHERE s.name LIKE CONCAT(:letra,'%') ORDER BY s.name ")
	List<Serie> findByInitial(@Param("letra") char letra);
	
	@Query("SELECT s FROM Serie s WHERE s.name LIKE CONCAT('%',:texto,'%')")
	List<Serie> findByTexto(@Param("texto") String texto);
	
	@Query("SELECT listaActores FROM Serie WHERE serie_id=:serie_id")
	List<Actor> findActoresById(@Param("serie_id") int serie_id);
	
	Serie save(Serie serie);
	
	//Serie findByInicial();
	
	
}
