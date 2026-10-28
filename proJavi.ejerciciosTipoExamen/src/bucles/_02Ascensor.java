package bucles;

import java.util.Scanner;

public class _02Ascensor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		boolean completo = false;
		int personas = 0;
		double pesoTotal = 0;
		
		while(!completo){
			System.out.print("Introduce peso: ");
			double peso = tec.nextDouble();
			
			if(pesoTotal + peso <= 500 ) {
				personas ++;
				pesoTotal = pesoTotal + peso;
				System.out.format("Adelante. Personas %d Peso %5.1f%n",personas, pesoTotal);
				if(pesoTotal == 500 || personas == 8){
					completo = true;
				}
			} else {
				System.out.format("STOP. No cabes. El peso sería %5.1f%n",pesoTotal+peso);
				completo = true;
			}
		}
		System.out.println("-----------");
		System.out.format("Ascensor lleno. Personas %d. Peso %5.1f%n", personas, pesoTotal);
	}
}
