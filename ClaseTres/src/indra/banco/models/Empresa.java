package indra.banco.models;

public class Empresa extends Entidad {
	private String cif;
//	private String nombre;
	
	public String getCif() {
		return cif;
	}

//	public String getNombre() {
//		return nombre;
//	}

	public Empresa(String cif, String nombre) {
		super(nombre);
		this.cif = cif;
//		this.nombre = nombre;
	}
}
