package indra.banco.models;

import java.time.LocalDate;

public class Cliente extends Entidad {
	
    //private String nombre;
    private String apellido;
	private  LocalDate fechaDeNacimiento;
	
    public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/*public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}*/

	public String getApellido() {
		return apellido;
	}

	/*public void setApellido(String apellido) {
		this.apellido = apellido;
	}*/
 
    /*public String getNombre() {
    	return nombre;
    }*/
    
    /*public void setNombre(String value) {
    	this.nombre = value;
    }*/
    
    public Cliente(String nombre, String apellido, LocalDate fechaDeNacimiento) {
    	super(nombre);
    	this.apellido = apellido;
    	this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    @Override
    public String toString() {
    	return String.format("Hola soy %s %s y naci el %s", this.getNombre(), apellido, fechaDeNacimiento);
    }
}
