package ascensores.dominio;

public class Ascensor {
	private final Double PESO_MAXIMO_PERMITIDO =  400.0;
	private Integer cantidadMaximaDePersonas;
	private Integer piso;
	
	public Ascensor() {
		
	}
	
	public Ascensor(Integer cantidadMaximaDePersonas) {
		this.cantidadMaximaDePersonas = cantidadMaximaDePersonas;
	}

	public Integer getCantidadMaximaDePersonas() {
		return cantidadMaximaDePersonas;
	}

	public void setCantidadMaximaDePersonas(Integer cantidadMaximaDePersonas) {
		this.cantidadMaximaDePersonas = cantidadMaximaDePersonas;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Double getPESO_MAXIMO_PERMITIDO() {
		return PESO_MAXIMO_PERMITIDO;
	}
	
	
}
