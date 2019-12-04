package upn.pe.aplica03.models.dao;

import org.springframework.data.repository.CrudRepository;

import upn.pe.aplica03.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	/*
	 * CAPA DAO :
	 * CONSULTAS PERSONALIZADAS PARA BASE DE DATOS 
	 * QUE NO ESTÁN EN CRUD_REPOSITORY
	 */
}