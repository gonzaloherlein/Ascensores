package ascensores.dominio;

public class AscensorServicio extends Ascensor{
	private final Double PESO_MAXIMO_PERMITIDO =  600.0;
	private final Integer CANTIDAD_MAXIMA_PERSONAS = 10;
	private Integer areaDeServicio;
	
	
	
	public AscensorServicio() {
		
	}
	
	public AscensorServicio(Integer areaDeServicio) {
		this.areaDeServicio = areaDeServicio;
	}

	public Integer getAreaDeServicio() {
		return areaDeServicio;
	}

	public void setAreaDeServicio(Integer areaDeServicio) {
		this.areaDeServicio = areaDeServicio;
	}

	public Double getPESO_MAXIMO_PERMITIDO() {
		return PESO_MAXIMO_PERMITIDO;
	}

	public Integer getCANTIDAD_MAXIMA_PERSONAS() {
		return CANTIDAD_MAXIMA_PERSONAS;
	}
	
	
}
