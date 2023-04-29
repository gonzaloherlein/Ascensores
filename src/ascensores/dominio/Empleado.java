package ascensores.dominio;

public class Empleado extends Persona{
	private Boolean presencia;
	
	public Empleado(Integer horaLlegada,Integer horaSalida,String nombre,Double peso,Boolean presencia) {
		super(horaLlegada,horaSalida,nombre,peso);
		this.presencia = presencia;
	}

	public Boolean getPresencia() {
		return presencia;
	}

	public void setPresencia(Boolean presencia) {
		this.presencia = presencia;
	}
	
}
