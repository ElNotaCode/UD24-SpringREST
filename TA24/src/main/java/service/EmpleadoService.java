package service;

import java.util.List;

import com.crud.spring.dto.Empleado;

public interface EmpleadoService {
	
	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado createEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado ReadCliente(Long id); //Leer datos de un empleado READ
	
	public List<Empleado> listarEmpleadosNombre(String nombre);//Listar empleados por campo nombre
	
	public Empleado updateEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void deleteEmpleado(Long id);// Elimina el empleado DELETE
	

}
