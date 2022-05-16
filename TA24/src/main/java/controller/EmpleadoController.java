package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.dto.Empleado;

import service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")

public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarEmpleadosNombre(@PathVariable(name = "nombre") String nombre){
		return empleadoServiceImpl.listarEmpleadosNombre(nombre);
	}
	
	@PostMapping("/empleados")
	public Empleado createEmpleado (@RequestBody Empleado empleado) {
		return empleadoServiceImpl.createEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado readEmpleado(@PathVariable(name = "id")Long id) {
		return empleadoServiceImpl.readEmpleado(id);
	}
	
	@PutMapping("/empleados/")
	public Empleado updateEmpleado(@PathVariable(name="id") Long id, @RequestBody Empleado empleado){
		Empleado empleado_a_actualizar;
		Empleado empleadoActualizado;
		
		empleado_a_actualizar = empleadoServiceImpl.readEmpleado(id);
		
		empleado_a_actualizar.setNombre(empleado.getNombre());
		empleado_a_actualizar.setTrabajo(empleado.getTrabajo());
		empleado_a_actualizar.setSalario(empleado.getSalario());

		empleadoActualizado = empleadoServiceImpl.updateEmpleado(empleado_a_actualizar);
		
		return empleadoActualizado;

	}
	
}
