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

import upn.pe.aplica03.models.entities.Cliente;
import upn.pe.aplica03.models.services.IClienteService;

@CrossOrigin(origins = "http://localhost:4200") 
/*
 * Se podrá solicitar desde Angular al BackEnd. 
 * Utilizando el componente en Angular HttpCliente
 */
@RestController
@RequestMapping(value="/api/Cliente")
public class MantenedorClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	/*List*/
	@GetMapping(value = "/listar")
	public List<Cliente> listar() {
		return clienteService.findAll();
	}
	
	/*Create*/
	@PostMapping(value = "/form")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	/*Find By Id*/
	@GetMapping(value = "/form/{id}")
	@ResponseStatus()
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	
	/*Update*/
	@PutMapping(value = "/listar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteActual = clienteService.findById(id);
		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setApellidos(cliente.getApellidos());
		return clienteService.save(clienteActual);
	}
	
	/*Delete*/
	@DeleteMapping(value = "/listar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deleteById(id);
	}
}