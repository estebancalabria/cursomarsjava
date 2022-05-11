package indra.banco.models;

public abstract class Entidad {

	private String nombre;

	public Entidad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}	
}
