package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
@RequestMapping("/usuario")
public class UsuarioRestController {
	private UsuarioRepository usuarioRepository = null;
	private CursorRepository cursorRepository = null;
	private FacturaRepository facturaRepository = null;
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	UsuarioRestController(UsuarioRepository usuarioRepository, CursorRepository cursorRepository, FacturaRepository facturaRepo) {
		this.usuarioRepository = usuarioRepository;
		this.cursorRepository = cursorRepository;
		this.facturaRepository = facturaRepo;
	}
	
	 @RequestMapping(method = RequestMethod.GET)
     public List<Usuario> getAllUsers(){
         // return new ResponseEntity<>((List<Serie>) serieRepository.findAll(), HttpStatus.OK);
		 return usuarioRepository.findAll();
	 }
	 
	 /*
		 * 
		 * Metodo GET: devuelve el usuairo asociado al id que se le pasa en la request 
		 */
    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
	public ResponseEntity<Usuario> getUserById(@PathVariable int userId) {
		System.out.print(usuarioRepository.findById(userId));
        return new ResponseEntity<>(usuarioRepository.findById(userId),HttpStatus.OK);
    }
	 
	 @RequestMapping(value = "/{userId}/Empezadas",method = RequestMethod.GET)
	public ResponseEntity<Set<Serie>> getSeriesEmpezadasByUser(@PathVariable int userId) {
		    Set<Serie> series =  usuarioRepository.findEmpezadasByUser(userId);
		 	for (Serie serie : series){
		 		System.out.print(serie.getId());
		 	}
	        return new ResponseEntity<>(usuarioRepository.findEmpezadasByUser(userId),HttpStatus.OK);
	    }
	 @RequestMapping(value = "/{userId}/Pendientes",method = RequestMethod.GET)
	 public ResponseEntity<Set<Serie>> getSeriesPendientesByUser(@PathVariable int userId) {
	       return new ResponseEntity<>(usuarioRepository.findPendientesByUser(userId),HttpStatus.OK);
	 }
		
	@CrossOrigin(allowedHeaders="*", allowCredentials="true")
	@RequestMapping(value = "/{userId}/Pendientes",method = RequestMethod.POST) //, headers="content-type=application/json")
	//@ResponseBody
		//public ResponseEntity<Serie> addSeriePendientesByUser(@RequestBody Serie serie) {
	public void addSeriePendientesByUser(@PathVariable("userId") int userId, @RequestBody Serie serie) {
			Set<Serie> seriesEmpezadas =  usuarioRepository.findById(userId).getSeriesEmpezadas();	
			Set<Serie> seriesPendientes =  usuarioRepository.findById(userId).getSeriesPendientes();
			Set<Serie> seriesTerminadas =  usuarioRepository.findById(userId).getSeriesTerminadas();
			if (!seriesEmpezadas.contains(serie) && !seriesPendientes.contains(serie) && !seriesTerminadas.contains(serie)){
				usuarioRepository.findById(userId).getSeriesPendientes().add(serie);
			    usuarioRepository.save(usuarioRepository.findById(userId));
				System.out.println(""+serie.getId());
			}
			//return new ResponseEntity<RequestWrapper>(requestWrapper,HttpStatus.OK);
	}
		
	@RequestMapping(value = "/{userId}/Terminadas",method = RequestMethod.GET)
	public ResponseEntity<Set<Serie>> getSeriesTerminadasByUser(@PathVariable int userId) {
	       return new ResponseEntity<>(usuarioRepository.findTerminadasByUser(userId),HttpStatus.OK);
	}
	@RequestMapping(value = "/{userId}/{serieId}/UltimaTempo",method = RequestMethod.GET)
	public ResponseEntity<Temporada> getUltimaTempo(@PathVariable int userId, @PathVariable int serieId) {
	       return new ResponseEntity<>(cursorRepository.findUltimaTempo(userId, serieId),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{userId}/{serieId}/UltimoCapi",method = RequestMethod.GET)
	public ResponseEntity<Capitulo> getUltimoCap(@PathVariable int userId, @PathVariable int serieId) {
	       return new ResponseEntity<>(cursorRepository.findUltimoCapi(userId, serieId),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/1/facturas",method = RequestMethod.GET)
	public List<Factura> getFacturas(){
        // return new ResponseEntity<>((List<Serie>) serieRepository.findAll(), HttpStatus.OK);
		 return facturaRepository.findAll();
	}
	
	@RequestMapping(value = "/1/facturas/{factura_id}",method = RequestMethod.GET)
	public ResponseEntity<Set<CapituloVisualizado>> getFactura(@PathVariable int factura_id) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
	    return new ResponseEntity<>(facturaRepository.findCapitulosByFactura(factura_id),HttpStatus.OK);
	}

	@CrossOrigin(allowedHeaders="*", allowCredentials="true")
	@RequestMapping(value = "/1/facturas/{factura_id}",method = RequestMethod.POST) //, headers="content-type=application/json")
	//@ResponseBody
		//public ResponseEntity<Serie> addSeriePendientesByUser(@RequestBody Serie serie) {
	public void addCapituloFactura(@PathVariable int factura_id, @RequestBody CapituloVisualizado cap) {
		facturaRepository.findById(factura_id).getCapitulosVisualizados().add(cap);
		//capitulosVistos.add(cap);
		facturaRepository.save(facturaRepository.findById(factura_id));
		System.out.println(""+cap.toString()+"\n");
		/*for (CapituloVisualizado cap2 : capitulosVistos){
	 		System.out.print(cap2.getId()+"\n");
	 	}*/
	}
			//return new ResponseEntity<RequestWrapper>(requestWrapper,HttpStatus.OK);
	
	/*@RequestMapping(value = "/1/facturas/{factura_id}/capis",method = RequestMethod.GET)
	public ResponseEntity<Set<Temporada>> getCapisByFactura(@PathVariable int factura_id) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		Set<Temporada> listaTempo = new HashSet<Temporada>();
		Set<CapituloVisualizado> listaCapis = facturaRepository.findCapitulosByFactura(factura_id);
		for (CapituloVisualizado cap : listaCapis){
	 		listaTempo.add(cap.getCapitulo().getTemporada());
	 	}
		return new ResponseEntity<>(listaTempo,HttpStatus.OK );
	}*/
	
	
	@RequestMapping(value = "/1/facturas/{factura_id}/capis",method = RequestMethod.GET)
	public ResponseEntity<Set<CapituloVisualizado>> getCapisByFactura(@PathVariable int factura_id) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		Set<Temporada> listaTempo = new HashSet<Temporada>();
		Set<CapituloVisualizado> listaCapis = facturaRepository.findCapitulosByFactura(factura_id);
		return new ResponseEntity<>(listaCapis,HttpStatus.OK );
	}
	
	@RequestMapping(value = "/1/facturas/{factura_id}/capis/{cap_id}/tempo",method = RequestMethod.GET)
	public ResponseEntity<Temporada> getTempoByCapiAndFactura(@PathVariable int factura_id, @PathVariable int cap_id) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		CapituloVisualizado capV = facturaRepository.findCapituloVById(factura_id, cap_id);
		
		Temporada tempo = capV.getCapitulo().getTemporada();
		return new ResponseEntity<>(tempo,HttpStatus.OK );
	}
	
	@RequestMapping(value = "/1/facturas/{factura_id}/capis/{cap_id}/serie",method = RequestMethod.GET)
	public ResponseEntity<Serie> getSerieByCapiAndFactura(@PathVariable int factura_id, @PathVariable int cap_id) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		//CapituloVisualizado capV = facturaRepository.findCapituloVById2(cap_id);
		//System.out.println(""+capV.getId());
		CapituloVisualizado capV = facturaRepository.findCapituloVById(factura_id, cap_id);
		System.out.println(""+capV.getId());
		Serie serie = capV.getCapitulo().getTemporada().getSerie();
		return new ResponseEntity<>(serie,HttpStatus.OK );
	}
}
