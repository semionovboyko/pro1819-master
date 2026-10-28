package _02ejemplos;

public class _14RepasoExcepciones {
	public static void main(String[] args) {
		String[] nombres = { "Ana", "Luisa", "Luis Manuel", "Alejandro", "Pepe" };
		int[] posiciones = { 2, 1, 3, 8, 2 };

		// De cada nombre mostrar el fragmento que va desde la posición
		// cero hasta la posicion contenida en el array posiciones
		for (int i = 0; i < posiciones.length; i++) {
			recortar(nombres[i], posiciones[i] + 1);
		}

		// También se puede capturar aqui
		for (int i = 0; i < posiciones.length; i++) {
			try{
			recortar2(nombres[i], posiciones[i] + 1);
			} catch(StringIndexOutOfBoundsException e){
				System.out.println("No se puede recortar");
			}
		}
	}

	public static void recortar(String texto, int pos) {
		try {
			System.out.println("Nombre original:  " + texto);
			String recortado = texto.substring(0, pos);
			System.out.println("Nombre recortado: " + recortado);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("No se puede recortar");
		}
	}

	public static void recortar2(String texto, int pos) throws StringIndexOutOfBoundsException {

		System.out.println("Nombre original:  " + texto);
		String recortado = texto.substring(0, pos);
		System.out.println("Nombre recortado: " + recortado);

	}
}
