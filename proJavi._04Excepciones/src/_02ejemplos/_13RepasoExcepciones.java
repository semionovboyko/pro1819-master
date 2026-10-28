package _02ejemplos;

public class _13RepasoExcepciones {
	public static void main(String[] args) {
		String[] nombres = { "Ana", "Luisa", "Luis Manuel", "Alejandro", "Pepe" };
		int[] posiciones = { 2, 1, 13, 8, 2 };

		// De cada nombre mostrar el fragmento que va desde la posición
		// cero hasta la posicion contenida en el array posiciones

		for (int i = 0; i < posiciones.length; i++) {
			try {
				System.out.println("Nombre original:  " + nombres[i]);
				String recortado = nombres[i].substring(0, posiciones[i] + 1);
				System.out.println("Nombre recortado: " + recortado);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("No se puede recortar");
			}
		}
	}

}
