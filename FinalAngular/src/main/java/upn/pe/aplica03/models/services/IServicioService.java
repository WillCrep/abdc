package upn.pe.aplica03.models.services;

import java.util.List;

import upn.pe.aplica03.models.entities.Servicio;;

public interface IServicioService {
	/*
	 * CAPA SERVICE:
	 * LISTA DE FUNCIONES DE LA LOGICA DE NEGOCIO
	 */
	public List<Servicio> findAll();
	public Servicio findById (Long id);
	public Servicio save(Servicio servicio);
	public void deleteById(Long id);
}