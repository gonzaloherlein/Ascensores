package ascensores.dominio;

public class Persona {
	private Integer horaLlegada;
	private Integer horaSalida;
	private String nombre;
	private Double peso;
	
	
	public Persona() {
		
	}


	public Persona(Integer horaLlegada, Integer horaSalida, String nombre, Double peso) {
		this.horaLlegada = horaLlegada;
		this.horaSalida = horaSalida;
		this.nombre = nombre;
		this.peso = peso;
	}


	public Integer getHoraLlegada() {
		return horaLlegada;
	}


	public void setHoraLlegada(Integer horaLlegada) {
		this.horaLlegada = horaLlegada;
	}


	public Integer getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(Integer horaSalida) {
		this.horaSalida = horaSalida;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Integer calcularTiempo(Integer horaLlegada, Integer horaSalida) {
		return horaSalida - horaLlegada;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
}
