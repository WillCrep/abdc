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

import upn.pe.aplica03.models.entities.Personal;
import upn.pe.aplica03.models.services.IPersonalService;

@CrossOrigin(origins = "http://localhost:4200") 
/*
 * Se podrá solicitar desde Angular al BackEnd. 
 * Utilizando el componente en Angular HttpCliente
 */
@RestController
@RequestMapping(value="/api/Personal")
public class MantenedorPersonalRestController {
	
	@Autowired
	private IPersonalService personalService;
	
	/*List*/
	@GetMapping(value = "/listar")
	public List<Personal> listar() {
		return personalService.findAll();
	}
	
	/*Create*/
	@PostMapping(value = "/form")
	@ResponseStatus(HttpStatus.CREATED)
	public Personal create(@RequestBody Personal personal) {
		return personalService.save(personal);
	}
	
	/*Find By Id*/
	@GetMapping(value = "/form/{id}")
	@ResponseStatus()
	public Personal show(@PathVariable Long id) {
		return personalService.findById(id);
	}
	
	/*Update*/
	@PutMapping(value = "/listar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Personal update(@RequestBody Personal personal, @PathVariable Long id) {
		Personal personalActual = personalService.findById(id);
		personalActual.setNombre(personal.getNombre());
		personalActual.setApellidos(personal.getApellidos());
		return personalService.save(personalActual);
	}
	
	/*Delete*/
	@DeleteMapping(value = "/listar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personalService.deleteById(id);
	}
}