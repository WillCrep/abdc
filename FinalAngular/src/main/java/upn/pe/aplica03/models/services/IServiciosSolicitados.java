package upn.pe.aplica03.models.services;

import java.util.List;

import upn.pe.aplica03.models.entities.ServiciosSolicitados;

public interface IServiciosSolicitados {
	/*
	 * CAPA SERVICE:
	 * LISTA DE FUNCIONES DE LA LOGICA DE NEGOCIO
	 */
	public List<ServiciosSolicitados> findAll();
	public ServiciosSolicitados findById (Long id);
	public ServiciosSolicitados save(ServiciosSolicitados serviciosSolicitados);
	public void deleteById(Long id);
}