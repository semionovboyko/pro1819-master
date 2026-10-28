package _02ejemplos;

public class _15RepasoExcepciones {
	public static void main(String[] args) {
		String[] nombres = { "Ana", "Luisa", "Luis Manuel", "Alejandro", "Pepe" };
		int[] posiciones = { 2, 1, 13, 8, 2 };

		// De cada nombre mostrar el fragmento que va desde la posición
		// cero hasta la posicion contenida en el array posiciones
		try {
			String res = "";
			for (int i = 0; i < posiciones.length; i++) {
				res += "Nombre original:  " + nombres[i] + "\n";
				String recortado = nombres[i].substring(0, posiciones[i] + 1);
				res += "Nombre recortado: " + recortado + "\n";
			}
			System.out.println(res);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("No se pudo recortar");
		}
	}

}
