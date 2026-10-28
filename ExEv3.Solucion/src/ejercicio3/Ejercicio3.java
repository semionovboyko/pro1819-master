package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3 {

	public static void anyadirAlCatalogo(Armario a) {
		File fichero = new File("Armarios.txt");
		if (fichero.exists()) {
			boolean esta = false;
			try (Scanner f = new Scanner(new File("armarios.txt"))) {
				while (f.hasNext() && !esta) {
					String modelo = f.next();
					f.nextInt();
					f.nextInt();
					f.nextInt();
					f.nextDouble();

					if (modelo.equals(a.getModelo())) {
						esta = true;
					}
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error");
			}

			if (!esta) {
				try (PrintWriter f = 
						new PrintWriter(new FileWriter("armarios.txt", true))) {
					f.println(a.getModelo());
					f.println(a.getAncho());
					f.println(a.getAlto());
					f.println(a.getProfundo());
					f.println(a.getPrecio());

				} catch (FileNotFoundException e) {
					System.out.println("Error");
				} catch (IOException e) {
					System.out.println("Error");
				}
			}
		}
	}

	public static void main(String[] args) {
		// @EndPrint

		// El catalogo ya contiene un armario del modelo "pisa" y otro del
		// modelo "siena",
		// as� que las siguientes llamadas deber�an indicar que los productos ya
		// existen
		anyadirAlCatalogo(new Armario("pisa", 0, 0, 0, 0.0));
		anyadirAlCatalogo(new Armario("siena", 0, 0, 0, 0.0));

		// Sin embargo, no contienen ning�n armario de modelo "florencia", as�
		// que (LA PRIMERA VEZ) deber�a a�adir con �xito el siguiente armario.
		// Para posteriores ejecucionesinventa tus propios armarios....
		anyadirAlCatalogo(new Armario("florencia", 3900, 2159, 923, 2253.8));

	}
}
