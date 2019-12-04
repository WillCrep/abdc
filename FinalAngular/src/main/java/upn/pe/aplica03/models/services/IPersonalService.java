package upn.pe.aplica03.models.services;

import java.util.List;

import upn.pe.aplica03.models.entities.Personal;

public interface IPersonalService {
	/*
	 * CAPA SERVICE:
	 * LISTA DE FUNCIONES DE LA LOGICA DE NEGOCIO
	 */
	public List<Personal> findAll();
	public Personal findById (Long id);
	public Personal save(Personal personal);
	public void deleteById(Long id);
}
