package upn.pe.aplica03.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upn.pe.aplica03.models.dao.IServicioDao;
import upn.pe.aplica03.models.entities.Servicio;

@Service
public class ServicioServiceImpl implements IServicioService {
	
	@Autowired
	private IServicioDao servicioDao;
	
	@Override 		//LISTAR
	@Transactional(readOnly = true)
	public List<Servicio> findAll() {
		return (List<Servicio>) servicioDao.findAll();
	}

	@Override 		//BUSCAR
	@Transactional(readOnly = true)
	public Servicio findById(Long id) {
		return servicioDao.findById(id).orElse(null);
	}

	@Override 		//GUARDAR
	@Transactional
	public Servicio save(Servicio servicio) {
		return servicioDao.save(servicio);
	}

	@Override 	 	//ELIMINIAR
	@Transactional
	public void deleteById(Long id) {
		servicioDao.deleteById(id);
	}
}