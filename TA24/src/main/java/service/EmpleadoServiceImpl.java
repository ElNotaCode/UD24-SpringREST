package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.EmpleadoDao;
import com.crud.spring.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	//Utilizamos los metodos de la interface EmpleadoDao, es como si instaciaramos.
	@Autowired
	EmpleadoDao empleadoDao;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// SELECT ALL
		return empleadoDao.findAll();
	}

	@Override
	public Empleado createEmpleado(Empleado empleado) {
		// CREATE
		return empleadoDao.save(empleado);
	}

	@Override
	public Empleado ReadCliente(Long id) {
		// READ
		//return empleadoDao.findById(id).get();
		return empleadoDao.getById(id);
	}

	@Override
	public List<Empleado> listarEmpleadosNombre(String nombre) {
		// Listar por nombre.
		return empleadoDao.findByNombre(nombre);
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		// UPDATE
		return empleadoDao.save(empleado);
	}

	@Override
	public void deleteEmpleado(Long id) {
		// DELETE
		empleadoDao.deleteById(id);
	}

}
