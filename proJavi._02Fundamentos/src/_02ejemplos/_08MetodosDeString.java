package _02ejemplos;

public class _08MetodosDeString {
	public static void main(String[] args) {
		String nombre = "miguel lopez";
		
		//Longitud de un string
		System.out.println("Longitud: " + nombre.length());
		
		//Ultimo caracter
		int ultimaPos = nombre.length() - 1;
		char ultimoChar = nombre.charAt(ultimaPos);
		System.out.println("Ultimo caracter: " + ultimoChar);
		
		//Se pueden anidar  los métodos
		ultimoChar = nombre.toUpperCase().charAt(ultimaPos);
		System.out.println("ULTIMO CARACTER: " + ultimoChar);
		
		

	}
}
