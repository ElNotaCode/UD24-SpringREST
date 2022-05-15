package com.crud.spring.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.spring.dto.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, Long>{
	
	//Lista de los empleados por nombre
	public List<Empleado> findByNombre(String nombre);
	
}
