package bucles;

import java.util.Scanner;

public class _04NumerosAmigos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dos enteros: ");
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		if(amigos(n1,n2)) System.out.println("amigos");
		else System.out.println("no amigos");
	}
	public static boolean amigos(int a, int b){
		if(sumaDivisores(a) == b && sumaDivisores(b) == a) return true;
		else return false;
	}
	
	public static int sumaDivisores(int n){
		int suma = 0;
		for(int divisor = 1; divisor <= n/2; divisor++){
			if(n % divisor == 0){
				suma = suma + divisor;
			}
		}
		return suma;
	}

}
