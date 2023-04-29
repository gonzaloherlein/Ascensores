package ascensores.dominio;

public class Cliente extends Persona{ 
	private Integer minutosDeEspera;
	private String nombre;
	private Double peso;
	
	public Cliente(String nombre, Integer minutosDeEspera, Double peso) {
		this.nombre = nombre;
		this.minutosDeEspera = minutosDeEspera;
		this.peso = peso;
	}

	public Integer getMinutosDeEspera() {
		return minutosDeEspera;
	}

	public void setMinutosDeEspera(Integer minutosDeEspera) {
		this.minutosDeEspera = minutosDeEspera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
}
