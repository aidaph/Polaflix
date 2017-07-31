package com.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PolaflixSpApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PolaflixSpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PolaflixSpApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(SerieRepository repository, TemporadaRepository repositorytempo, CapituloRepository repositorycapi ) {
		
		return (args) -> {
			// save a couple of customers
			
			//repository.save(DatosBD.createSerie());
			
			
			// fetch all customers
			log.info("Serie found with findAll():");
			log.info("-------------------------------");
			for (Serie serie : repository.findAll()) {
				log.info(serie.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			/*Customer customer = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");*/

			// fetch serie by last name
			log.info("Serie found with findByName('Shameless'):");
			log.info("--------------------------------------------");
			for (Serie serie : repository.findByName("13 reasons why")) {
				log.info("Temporadas found findBySerie('13 reasons why'):");
				log.info("--------------------------------------------");
				for (Temporada tempo : repositorytempo.findBySerie(serie)) {
					// Crear una lista de Capitulos
					Set<Capitulo> listaCapitulos= new HashSet<Capitulo>();
					for (Capitulo capi: repositorycapi.findByTemporada(tempo)){
						listaCapitulos.add(capi);
					}
					log.info(tempo.toString(listaCapitulos));
					log.info("");
				}
				
				//log.info(serie.toString());
			}
			log.info("");
			
			
			
		};
	}

}

