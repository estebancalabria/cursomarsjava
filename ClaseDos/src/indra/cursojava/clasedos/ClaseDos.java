package indra.cursojava.clasedos;

import java.util.*;
import indra.utils.Consola;
import indra.utils.MetodosNumericos;

public class ClaseDos {

	public static void main(String[] args) {

		// Primer Ejercicio
		/*
		 * System.out.println("Bienvenidos a la segunda clase"); String nombre =
		 * Consola.leerEntrada("Ingrese su nombre"); String edad =
		 * Consola.leerEntrada("Ingrese su edad");
		 * 
		 * if (MetodosNumericos.esNumero(edad)){
		 * System.out.println(String.format("Bienvenido %s de %s", nombre, edad)); }else
		 * { System.out.println(String.format("Bienvenido %s. No entendi tu edad",
		 * nombre)); }
		 */

		// Segundo Ejercicio
		/*
		 * boolean encontrado = false; int numoportunidades = 6; int numazar =
		 * MetodosNumericos.valorAlAzar(1, 100);
		 * 
		 * while(!encontrado && numoportunidades > 0) { int num =
		 * Consola.leerNumero("Dame un numero"); if(num > numazar) {
		 * System.out.println("El numero debe ser menor"); numoportunidades--; } else
		 * if(num < numazar){ System.out.println("El numero debe ser mayor");
		 * numoportunidades--; } else { System.out.println("Felicidades, has acertado");
		 * encontrado = true; } }
		 * 
		 * if(!encontrado && numoportunidades == 0) {
		 * System.out.println("Oh no, has perdido"); }
		 */

		// Tercer Ejercicio
		// Les pide al usuario que ingrese dos numeros
		// Luego muestra muestra un menu con las operaciones 1-+ 2- 3* 4/
		// el usuario elige la operacion
		// y con un switch muestra el resultado
		/*
		 * int primerNumero, segundoNumero, seleccion; primerNumero =
		 * Consola.leerNumero("Introduce el primer numero"); segundoNumero =
		 * Consola.leerNumero("Introduce el segundo numero"); seleccion =
		 * Consola.leerNumero("Elige una operación: 1. + 2. - 3. * 4. /");
		 */

		/*
		 * switch (seleccion) { case 1 : System.out.println(primerNumero+segundoNumero);
		 * break; case 2 : System.out.println(primerNumero-segundoNumero); break; case 3
		 * : System.out.println(primerNumero*segundoNumero); break; case 4 :
		 * System.out.println(primerNumero/segundoNumero); break; }
		 */

		/*
		 * int resultado = switch(seleccion) { case 1 -> primerNumero+segundoNumero;
		 * case 2 -> primerNumero-segundoNumero; case 3 -> primerNumero-segundoNumero;
		 * default -> primerNumero/segundoNumero; };
		 */

		/*
		 * int resultado = switch(seleccion) { case 1 : yield
		 * primerNumero+segundoNumero; case 2 : yield primerNumero-segundoNumero; case 3
		 * : yield primerNumero-segundoNumero; default : yield
		 * primerNumero/segundoNumero; };
		 * 
		 * System.out.println(resultado);
		 * 
		 * }
		 */

		// Cuarto ejercicio
		// un programa que inicialice un arreglo de nombres y lo muestre por pantalla
		// String[] nombres = new String[]{"Juan","Alberto","Carlos","sergio"};
		// String[] nombres = {"Juan","Alberto","Carlos","sergio"};
		// for(int i = 0; i < nombres.length; i++) System.out.println(nombres[i]);
		// for (String val:nombres) System.out.println(val);

		// Quinto Ejercicio
		// Preguntarle al usuario cuantos numeros quiere
		// Luego crear un arrray de esa cantidad de elemenos
		// Cargarlo preguntadole cada elemento al usuario
		// DESPUES
		// Una vez que lo cargue, lo recorro y muestro el maximo, el minimo y el
		// promedio
		/*int max = Consola.leerNumero("Introduzca el número máximo de elementos");

		int[] nums = new int[max];

		for (int i = 0; i < nums.length; i++) {
			int num = Consola.leerNumero("Introduzca el elemento " + i);
			nums[i] = num;
		}

		int numMax = nums[0];
		int numMin = nums[0];

		double sumatoria = 0.0;

		for (int num : nums) {
			if (num > numMax) {
				numMax = num;
			}
			if (num < numMin) {
				numMin = num;
			}
			sumatoria += num;
		}

		System.out.println(String.format("Max %s, Min %s, Prom %s", numMax, numMin, sumatoria / max));*/
		
		//Sexto ejercicio
		//Cargar una lista de nombres hasta que el usuario ingresa FIN (ArrayList)
		//Luego recorrer la lista  y mostrar los nombres, su longitud y el nombre en mayuscula en la misma linea
		ArrayList<String> nombres = new ArrayList<String>();
        String nombre = Consola.leerEntrada("Introduce nombre");
        while (!nombre.equals("FIN")) {
            nombres.add(nombre);
            nombre = Consola.leerEntrada("Introduce nombre");
        }
        
        for (String val : nombres) {
            
        	
            String nombreAlreves = new StringBuilder(val).reverse().toString();
            /*for (int i = val.length() - 1; i >= 0; i--) {
                nombreAlreves += val.charAt(i);
            }*/
            
            System.out.println("Nombre: "+val+" "+"Longitud: "+val.length()+"Nombre alrevés: "+nombreAlreves);
        }
		
	}

}
