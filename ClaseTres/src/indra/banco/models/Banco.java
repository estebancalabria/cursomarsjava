package indra.banco.models;

import java.util.*;

public class Banco {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void registrarNuevoCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public Cuenta abrirCuentaNueva(Cliente c) throws Exception {
		if (!this.clientes.contains(c)) {
			throw new Exception( c +"no esta registrado en el banco y no puede abrir una cuenta");
		}
		
		Cuenta nueva = new Cuenta(generarIbanNuevo(), c);
		this.cuentas.add(nueva);
		
		return nueva;
	}

	private String generarIbanNuevo() {
		/*int i=1;
		Integer j= new Integer(1);
		int k= new Integer(1);*/
		
		//Como no tengo la logica de generar el iba nuevo genero un aleatorio
		//return Integer.valueOf((int) Math.abs(Math.round(Math.random() * 100000000))).toString();
		return UUID.randomUUID().toString();
	}
}
