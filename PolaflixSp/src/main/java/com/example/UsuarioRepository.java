package com.example;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
		//Declare query methods on the interface.
	    //@Query("SELECT u FROM Usuario u WHERE u.id=:user_id")
		Usuario findById(int user_id);
		
		List<Usuario> findByUsername(String username);
		
		//List<Capitulo> findCapitulobyTemporada(int num);
		List<Usuario> findAll();
		
		@Query("SELECT seriesEmpezadas FROM Usuario WHERE usuario_id=:user_id")
		Set<Serie> findEmpezadasByUser(@Param("user_id") int user_id);
		
		@Query("SELECT seriesPendientes FROM Usuario WHERE usuario_id=:user_id")
		Set<Serie> findPendientesByUser(@Param("user_id") int user_id);
		
		@Query("SELECT seriesTerminadas FROM Usuario WHERE usuario_id=:user_id")
		Set<Serie> findTerminadasByUser(@Param("user_id") int user_id);
		
		
		Usuario save(Usuario usuario);
		
		//Serie findByInicial();
		
		

}
