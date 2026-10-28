package _03ejercicios;

public class _00MetodosDeString {
	public static void main(String[] args) {
		/* Método indexOf (char c)
		 * Devuelve en qué posición del String está el caracter especificado.
		 * Si el caracter no está, devuelve -1.
		 * Se considera que la primera posición es la cero
		 */
		
		String nombre = "Miguel Gonzalez Perez";
		int pos1 = nombre.indexOf('G');
		int pos2 = nombre.indexOf('g');
		int pos3 = nombre.indexOf('m');
		
		System.out.format("La letra G aparece en la posicion %d%n", pos1);
		System.out.format("La letra g aparece en la posicion %d%n", pos2);
		System.out.format("La letra M aparece en la posicion %d%n", pos3);
	}
}
