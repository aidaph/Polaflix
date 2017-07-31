package com.example;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serie/{serieId}/temporada")
public class TemporadaRestController {

	private SerieRepository serieRepository = null;
	private TemporadaRepository tempoRepository = null;
	
	@Autowired
	TemporadaRestController(SerieRepository serieRepository,
						   TemporadaRepository tempoRepository) {
		this.serieRepository = serieRepository;
		this.tempoRepository = tempoRepository;
	}
	
	 @RequestMapping(method = RequestMethod.GET)
     public List<Temporada> getAllTemporada(@PathVariable int serieId){
         // return new ResponseEntity<>((List<Serie>) serieRepository.findAll(), HttpStatus.OK);
		 Serie serie = serieRepository.findById(serieId);
		 return tempoRepository.findBySerie(serie);
	 }
	 
	 @RequestMapping(value = "{tempoNum}",method = RequestMethod.GET)
     public ResponseEntity<Temporada> getTempoByNum(@PathVariable int tempoNum,@PathVariable int serieId) {
		 Serie serie = serieRepository.findById(serieId);
	     return new ResponseEntity<>(tempoRepository.findByNumAndSerieOrderByNumAsc(tempoNum, serie),HttpStatus.OK);
	 }
	
	 @RequestMapping(value = "{tempoNum}/capitulo/{cap_id}",method = RequestMethod.GET)
     public ResponseEntity<Temporada> getTempoByCap(@PathVariable int tempoNum,@PathVariable int cap_id, @PathVariable int serieId) {
		 return new ResponseEntity<>(tempoRepository.findByNum(tempoNum), HttpStatus.OK);		 
	 }
	 
	 
}