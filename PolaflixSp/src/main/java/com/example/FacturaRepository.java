package com.example;

import java.util.List;
import java.util.Set;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FacturaRepository extends JpaRepository<Factura,Integer>{
	
	Factura findById(int id);
	
	List<Factura> findAll();
	
	/*@Modifying
	@Query("select listaCapitulosVistos from Factura f where f.user.id = ?1 AND MONTH(f.fecha) = MONTH(?2) ")
	List<Capitulo> findCapitulosByDateMonth(@Param(value = "user") int userId, @Param ("fecha")Date date);*/
	
	@Query("select listaCapitulosVistos from Factura f where f.id=?1")
	Set<CapituloVisualizado> findCapitulosByFactura(@Param("factura_id") int factura_id);
	
	@Query("select c from CapituloVisualizado c where c.factura.id=?1 AND c.id=?2")
	CapituloVisualizado findCapituloVById(@Param("factura_id") int factura_id, @Param("capituloV_id") int capituloV_id);
	
	@Query("select c from CapituloVisualizado c where c.id=?1")
	CapituloVisualizado findCapituloVById2(@Param("capituloV_id") int capituloV_id);
	
	
	@Query("select capitulo from CapituloVisualizado c where c.id=?1")
	Capitulo findCapituloByCapituloV(@Param("capituloV_id") int capituloV_id);
	
	Factura save(int factura_id);
	
}
