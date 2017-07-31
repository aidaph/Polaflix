package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CursorRepository extends JpaRepository<CursorSerie,Integer>{

	//Declare query methods on the interface.
	CursorSerie findById(int id);
		
	@Query("SELECT ultimaTemporada FROM CursorSerie c WHERE (c.user.id=:userId AND c.serie.id=:serieId)")
	Temporada findUltimaTempo(@Param("userId") int userId, @Param("serieId") int serieId);
	
	@Query("SELECT ultimoCapitulo FROM CursorSerie c WHERE (c.user.id=:userId AND c.serie.id=:serieId)")
	Capitulo findUltimoCapi(@Param("userId") int userId, @Param("serieId") int serieId);
	
	CursorSerie save(CursorSerie cursor);
}
