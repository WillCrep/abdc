package upn.pe.aplica03.models.services;

import java.util.List;

import upn.pe.aplica03.models.entities.DetalleServicio;;

public interface IDetalleServicioService {
	/*
	 * CAPA SERVICE:
	 * LISTA DE FUNCIONES DE LA LOGICA DE NEGOCIO
	 */
	public List<DetalleServicio> findAll();
	public DetalleServicio findById (Long id);
	public DetalleServicio save(DetalleServicio detalle);
	public void deleteById(Long id);
}