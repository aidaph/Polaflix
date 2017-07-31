package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class SerieRepositoryImpl {

	@Autowired
	private SerieRepository repository;

	
	@PersistenceContext
	private EntityManager em;
	
	/*@Override
	@Transactional
	public Serie save(Serie serie) {
	  return repository.save(serie);
	}*/
	
	public List<Serie> findByName(String name) {

	    TypedQuery query = em.createQuery("select a from Serie a where a.name = ?1", Serie.class);
	    query.setParameter(1, name);

	    return query.getResultList();
		//return repository.findByName(name);
	}
	
	public List<Temporada> findTemporadaBySerie(int idSerie){
		TypedQuery query = em.createQuery("select a from Temporada a where a.serie = ?1", Temporada.class);
	    query.setParameter(1, idSerie);

	    return query.getResultList();
		//return repository.findByName(name);
	}
}
