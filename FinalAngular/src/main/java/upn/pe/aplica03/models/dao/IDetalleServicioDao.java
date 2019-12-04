package upn.pe.aplica03.models.dao;

import org.springframework.data.repository.CrudRepository;

import upn.pe.aplica03.models.entities.DetalleServicio;

public interface IDetalleServicioDao extends CrudRepository<DetalleServicio, Long>{
	/*
	 * CAPA DAO :
	 * CONSULTAS PERSONALIZADAS PARA BASE DE DATOS 
	 * QUE NO ESTÁN EN CRUD_REPOSITORY
	 */
}