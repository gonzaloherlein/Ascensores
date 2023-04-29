package ascensores.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Edificio {
	private String nombre;
	private ArrayList<Ascensor> ascensores = new ArrayList<Ascensor>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Empleado> empleadosAusentes = new ArrayList<Empleado>();
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public Edificio() {
		
	}
	
	public Edificio(String nombre) {
		this.nombre = nombre;
		this.ascensores = new ArrayList<Ascensor>();
		this.clientes = new ArrayList<Cliente>();
		this.empleados = new ArrayList<Empleado>(); 
		this.empleadosAusentes = new ArrayList<Empleado>();
	}
	
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public Integer calcularTiempoCliente() {
		Integer tiempoDeEsperaTotal = 0;
		for (int i = 0; i < clientes.size(); i++) {
			tiempoDeEsperaTotal += clientes.get(i).getMinutosDeEspera();
		}
		return tiempoDeEsperaTotal / clientes.size();
	}
	
	public void agregarEmpleados(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void agregarPersonas(Persona persona) {
		personas.add(persona);
	}
	
	
	public Integer listadoEmpleadosAusente() {
		for (Empleado empleado : empleados) {
			if(empleado.getPresencia() == false) {
				this.empleadosAusentes.add(empleado);
			}
		}
		return this.empleadosAusentes.size();
	}
	
	public void agregarAscensores(Ascensor ascensor) {
		ascensores.add(ascensor);
	}
	
	
	public Double pesoTotalAscensores() {
		Double pesoTotalAscensores = 0.0;
		for (int i = 0; i < ascensores.size(); i++) {
			pesoTotalAscensores += ascensores.get(i).getPESO_MAXIMO_PERMITIDO();
		}
		return pesoTotalAscensores;
	}
	

	
	
	

	public Double pesoTotalPersonas(){
		Double pesoTotalPersonas = 0.0;
		for (int i = 0; i < personas.size(); i++) {
			pesoTotalPersonas += personas.get(i).getPeso();
		}
		return pesoTotalPersonas;
	}
	
	public Boolean evaluarAscensores() {
		Double pesoTotal = pesoTotalPersonas();
		Double pesoTotalAscensores = pesoTotalAscensores();
		if(pesoTotal <= pesoTotalAscensores) {
			return true;
		}
		return false;
	}
	

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Empleado> getEmpleadosAusentes() {
		return empleadosAusentes;
	}

	public void setEmpleadosAusentes(ArrayList<Empleado> empleadosAusentes) {
		this.empleadosAusentes = empleadosAusentes;
	}

}
