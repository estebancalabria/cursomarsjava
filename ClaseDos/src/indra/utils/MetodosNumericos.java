package indra.utils;

public class MetodosNumericos {
	
	public static boolean esNumero(String str) {
		//return str.matches("[+-]?\\d*(\\.\\d+)?");
		return (str != null) && (str.matches("[0-9]+"));
	} 
	
	public static int valorAlAzar(int min, int max) {
		return (int) (Math.random () * (max-min)) + min;
	}
	
}
