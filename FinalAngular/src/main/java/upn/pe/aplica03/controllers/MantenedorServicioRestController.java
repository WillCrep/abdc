package upn.pe.aplica03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import upn.pe.aplica03.models.entities.Servicio;
import upn.pe.aplica03.models.services.IServicioService;;

@CrossOrigin(origins = "http://localhost:4200") 
/*
 * Se podrá solicitar desde Angular al BackEnd. 
 * Utilizando el componente en Angular HttpCliente
 */
@RestController
@RequestMapping(value="/api/Servicio")
public class MantenedorServicioRestController {
	
	@Autowired
	private IServicioService servicioService;
	
	/*List*/
	@GetMapping(value = "/listar")
	public List<Servicio> listar(){
		return servicioService.findAll();
	}
	
	/*Create*/
	@PostMapping(value = "/form")
	@ResponseStatus(HttpStatus.CREATED)
	public Servicio create(@RequestBody Servicio servicio) {
		return servicioService.save(servicio);
	}
	
	/*Find By Id*/
	@GetMapping(value = "/form/{id}")
	@ResponseStatus()
	public Servicio show(@PathVariable Long id) {
		return servicioService.findById(id);
	}
	
	/*Update*/
	@PutMapping(value = "/listar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Servicio update(@RequestBody Servicio servicio, @PathVariable Long id) {
		Servicio servicioActual = servicioService.findById(id);
		servicioActual.setNombre(servicio.getNombre());
		servicioActual.setMonto(servicio.getMonto());
		return servicioService.save(servicioActual);
	}
	
	/*Delete*/
	@DeleteMapping(value = "/listar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		servicioService.deleteById(id);
	}
	
}