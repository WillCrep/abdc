package upn.pe.aplica03.models.services;

import java.util.List;

import upn.pe.aplica03.models.entities.ServicioMecanico;;

public interface IServicioMecanicoService {
	/*
	 * CAPA SERVICE:
	 * LISTA DE FUNCIONES DE LA LOGICA DE NEGOCIO
	 */
	public List<ServicioMecanico> findAll();
	public ServicioMecanico findById (Long id);
	public ServicioMecanico save(ServicioMecanico servicioMecanico);
	public void deleteById(Long id);
}