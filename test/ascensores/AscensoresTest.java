package ascensores;

import static org.junit.Assert.*;

import org.junit.Test;

import ascensores.dominio.Ascensor;
import ascensores.dominio.Cliente;
import ascensores.dominio.Edificio;
import ascensores.dominio.Empleado;
import ascensores.dominio.Persona;

public class AscensoresTest {

	@Test
	public void queSePuedaCrearUnAscensor() {
		Ascensor ascensor = new Ascensor();
		assertNotNull(ascensor);
	}
	
	@Test
	public void queSePuedaCrearUnEmpleado() {
		Persona empleado = new Persona();
		assertNotNull(empleado);
	}
	
	@Test
	public void queSeCalculeElTiempoDeEmpleadoPorPiso() {
		Empleado empleado = new Empleado(8,17,"Eduardo",70.0,true);
		assertEquals((Integer) empleado.calcularTiempo(empleado.getHoraLlegada(), empleado.getHoraSalida()), (Integer) 9);

	}
	
	@Test
	public void queSeCalculeElTiempoPromedioDeClientesAdentroDelEdificio() {
		Cliente cliente1 = new Cliente ("Eduardo",17,70.0);
		Cliente cliente2 = new Cliente ("Jose",17,70.0);
		Cliente cliente3 = new Cliente ("Sebas",17,70.0);
		
		Edificio edificio = new Edificio();
		
		edificio.agregarCliente(cliente1);
		edificio.agregarCliente(cliente2);
		edificio.agregarCliente(cliente3);
		
		assertEquals(edificio.calcularTiempoCliente(),(Integer)17);
	}
	
	@Test
	public void queSeListeLosEmpleadosAusentesEnUnDiaDeterminado() {
		Empleado empleado3 = new Empleado(8,17,"ian",70.0,true);
		Empleado empleado1 = new Empleado(8,17,"Eduardo",70.0,true);
		Empleado empleado2 = new Empleado(8,17,"pepe",70.0,false);
		Empleado empleado4 = new Empleado(8,17,"nico",70.0,false);
		Edificio edificio = new Edificio();
		
		edificio.agregarEmpleados(empleado1);
		edificio.agregarEmpleados(empleado2);
		edificio.agregarEmpleados(empleado3);
		edificio.agregarEmpleados(empleado4);
		
		assertEquals(edificio.listadoEmpleadosAusente(),(Integer) 2);
	}
	
	@Test
	public void queSePuedaEvaluarLaCantidadDeAscensores() {
		Empleado empleado1 = new Empleado(8,17,"ian",1000.0,true);
		Empleado empleado2 = new Empleado(8,17,"Eduardo",1000.0,true);
		Empleado empleado3 = new Empleado(8,17,"pepe",1000.0,false);
		Empleado empleado4 = new Empleado(8,17,"nico",70.0,false);
		Cliente cliente1 = new Cliente ("Eduardo",17,70.0);
		Cliente cliente2 = new Cliente ("Jose",17,70.0);
		Cliente cliente3 = new Cliente ("Sebas",17,70.0);
		Ascensor ascensor1 = new Ascensor();
		Ascensor ascensor2 = new Ascensor();
		Ascensor ascensor3 = new Ascensor();
		Ascensor ascensor4 = new Ascensor();
		Edificio edificio = new Edificio("Eduardo");
		
		edificio.agregarAscensores(ascensor1);
		edificio.agregarAscensores(ascensor2);
		edificio.agregarAscensores(ascensor3);
		edificio.agregarAscensores(ascensor4);
		
		edificio.agregarPersonas(cliente1);
		edificio.agregarPersonas(cliente2);
		edificio.agregarPersonas(cliente3);
		edificio.agregarPersonas(empleado1);
		edificio.agregarPersonas(empleado2);
		edificio.agregarPersonas(empleado3);
		edificio.agregarPersonas(empleado4);
		
		
		assertFalse(edificio.evaluarAscensores());
	}
}
