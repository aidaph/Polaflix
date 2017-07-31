package com.example;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serie")
public class SerieRestController {
	private SerieRepository serieRepository = null;
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	SerieRestController(SerieRepository serieRepository) {
		this.serieRepository = serieRepository;
	}
	
	 @RequestMapping(method = RequestMethod.GET)
     public List<Serie> getAllSerie(){
         // return new ResponseEntity<>((List<Serie>) serieRepository.findAll(), HttpStatus.OK);
		 return serieRepository.findAll();
	 }
	/*
	 * 
	 * Metodo GET: devuelve la serie asociada al id que se le pasa en la request 
	 */
	@RequestMapping(value = "/{serieId}",method = RequestMethod.GET)
	public ResponseEntity<Serie> getSerieById(@PathVariable int serieId) {
		System.out.print(serieRepository.findById(serieId));
        return new ResponseEntity<>(serieRepository.findById(serieId),HttpStatus.OK);
    }
	
	/*
	 * 
	 * Metodo GET: devuelve la serie asociada al id que se le pasa en la request 
	 */
	@RequestMapping(value = "/{serieId}/listaActores",method = RequestMethod.GET)
	public ResponseEntity<List<Actor>> getActoresById(@PathVariable int serieId) {
        return new ResponseEntity<>(serieRepository.findActoresById(serieId),HttpStatus.OK);
    }
	
	@RequestMapping(value = "/init/{initial}",method = RequestMethod.GET)
	/*Serie getSerie(@PathVariable ("id") int serieId) {
		return this.serieRepository.findById(serieId);
	}*/
	public ResponseEntity<List<Serie>> getSerieByInitial(@PathVariable char initial) {
		System.out.print(serieRepository.findByInitial(initial));
        return new ResponseEntity<>(serieRepository.findByInitial(initial),HttpStatus.OK);
    }
	
	@RequestMapping(value = "/search/{texto}",method = RequestMethod.GET)
	public ResponseEntity<List<Serie>> getSerieByTexto(@PathVariable String texto) {
		System.out.print(serieRepository.findByTexto(texto));
        return new ResponseEntity<>(serieRepository.findByTexto(texto),HttpStatus.OK);
    }
		
}
