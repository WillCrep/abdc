package upn.pe.aplica03.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upn.pe.aplica03.models.dao.IPersonalDao;
import upn.pe.aplica03.models.entities.Personal;

@Service
public class PersonalServiceImpl implements IPersonalService {
	
	@Autowired
	private IPersonalDao personalDao;
	
	@Override 		//LISTAR
	@Transactional(readOnly = true)
	public List<Personal> findAll() {
		return (List<Personal>) personalDao.findAll();
	}

	@Override 		//BUSCAR
	@Transactional(readOnly = true)
	public Personal findById(Long id) {
		return personalDao.findById(id).orElse(null);
	}

	@Override 		//GUARDAR
	@Transactional
	public Personal save(Personal personal) {
		return personalDao.save(personal);
	}

	@Override 		//ELIMINAR 
	@Transactional
	public void deleteById(Long id) {
		personalDao.deleteById(id);
	}
}