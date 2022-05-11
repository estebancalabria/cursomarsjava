package indra.utils;

import java.util.Scanner;

public class Consola {
	
	public static String leerEntrada(String titulo) {
        Scanner sc = new Scanner(System.in);
        System.out.println(titulo);
        try {
	        String nombre = sc.nextLine();
	        
            while(nombre.isEmpty()) {
                System.out.println("Ingréselo otra vez");
                nombre = sc.nextLine();
            }
	       
	        return nombre;
        }
        finally {
        	//sc.close();
        }
	}
	
	public static int leerNumero(String titulo) {
		//Me vuelve a pedir un numero hasta que lo ingrese bien
	    System.out.println(titulo); 
	    Scanner teclado = new Scanner(System.in);
	    String numero = teclado.nextLine();
	    
	    while(numero.isEmpty() || !MetodosNumericos.esNumero(numero)){
	        System.out.println("Por favor, ingresa un valor numérico");
	        numero = teclado.nextLine();
	    }
	    
	    return Integer.parseInt(numero);
	}
}
