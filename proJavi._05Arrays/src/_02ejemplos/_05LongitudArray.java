package _02ejemplos;

public class _05LongitudArray {
	public static void main(String[] args) {
		String[] dias = {"lunes","martes","mierc",
				"jueves","viernes"};	
		
		//Recorremos el array para mostrar sus elementos
		//Los arrays tienen un ATRIBUTO llamado length
		// que podemos usar para recorrer 
		for (int i = 0; i < dias.length; i++) {
			System.out.println(i + ": " + dias[i]);
		}
	}
}
	
