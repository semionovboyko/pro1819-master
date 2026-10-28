package _03ejercicios;
 
import java.util.Scanner;

public class _01EntradaSalida {

	public static void main(String arg[]) {
		Scanner tec = new Scanner(System.in);
		int a, b;
		
		System.out.println("Introduce un nÃºmero entero");
		a = tec.nextInt();
		System.out.println("Introduce otro nÃºmero entero");
		b = tec.nextInt();
		
		System.out.println("Los nÃºmeros introducidos son " + a + " y " + b);
	}
}
//Si el usuario introduce un número real en lugar de entero, se produce error de ejecución.
//Si quitamos la instrucción import, se produce error de compilación
