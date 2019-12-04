package upn.pe.aplica03.models.services;

import java.util.List;

import upn.pe.aplica03.models.entities.Cliente;

public interface IClienteService {
	/*
	 * CAPA SERVICE:
	 * LISTA DE FUNCIONES DE LA LOGICA DE NEGOCIO
	 */
	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void deleteById(Long id);
}