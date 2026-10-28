package bucles;

import java.util.Scanner;

public class _03CincoPrimerosDivisores {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		//Mostrar los 5 primeros divisores del número n (o los que tenga)
		
		int divisor = 1;
		int cont = 0;
		while (divisor <= n/2 && cont < 5){
			if(n % divisor == 0) {
				System.out.println(divisor);
				cont++;
			}
			divisor++;
		}
	}

}
