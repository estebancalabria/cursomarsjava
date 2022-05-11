package org.indra.model;

public class Archivo extends EntidadSistemaFicheros {
	
	private int tamaño;
	
	public Archivo(String nombre, int tamaño) {
		super(nombre);
		this.tamaño = tamaño;
		if (miradoPor!=null) miradoPor.notificar("Creando archivo "+nombre+" con "+tamaño+" bytes.");
	}
	
	public Archivo(String nombre) {
		super(nombre);
		this.tamaño = 0;
		if (miradoPor!=null) miradoPor.notificar("Creando archivo "+nombre+" vacio");
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public int calcularTamaño() {
		return this.tamaño;
	}	
}
