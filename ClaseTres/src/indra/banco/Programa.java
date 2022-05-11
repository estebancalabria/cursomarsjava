package indra.banco;

import java.time.LocalDate;
import java.util.*;
import indra.banco.models.*;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//Primer Ejemplo
			/*System.out.println("Ingrese su nombre");
			String nombre = sc.nextLine();
			System.out.println("Ingrese su apelllido");
			String apellido = sc.nextLine();
			System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD)");
			LocalDate nacimiento = LocalDate.parse(sc.nextLine());*/

			//Segundo Ejemplo
			//Agrupamos la variales en el concepto del cliente
			/*Cliente cliente = new Cliente();
			
			System.out.println("Ingrese su nombre");
			//cliente.nombre= sc.nextLine();
			cliente.setNombre(sc.nextLine()); //<<Ahora con un setter
			
			System.out.println("Ingrese su apelllido");
			cliente.setApellido(sc.nextLine());
			
			System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD)");
			cliente.setFechaDeNacimiento( LocalDate.parse(sc.nextLine()));
			
			System.out.println(cliente);*/
			
			//TErcer Ejemplo, ahora con constructor
			System.out.println("Ingrese su nombre");
			String nombre = sc.nextLine();
			System.out.println("Ingrese su apelllido");
			String apellido = sc.nextLine();
			System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD)");
			LocalDate nacimiento = LocalDate.parse(sc.nextLine());
			Cliente cliente = new Cliente(nombre,apellido, nacimiento);
			System.out.println(cliente);
			
		}
		finally {
			sc.close();
		}
	}

}
