package ifelse;

import java.util.Scanner;

public class _01Termostatos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Temperatura: ");
		int temp = tec.nextInt();
		System.out.println("Invierno o verano?: ");
		String iv = tec.next().toLowerCase();
		if (iv.equals("invierno")) {
			System.out.println("Dia o noche?: ");
			String dn = tec.next().toLowerCase();
			
			if(dn.equals("dia")){
				if(temp > 21) {
					System.out.format("Demasiado alta. Bajala %d grados. Ahorrarás %5.2f%n"
							, temp-21, (temp-21)*3);
				} else {
					System.out.println("La temperatura es adecuada");
				}
			} else {
				if(temp > 17) {
					System.out.format("Demasiado alta. Bajala %d grados. Ahorrarás %5.2f%n"
							, temp-17, (temp-17)*3);
				} else {
					System.out.println("La temperatura es adecuada");
				}
			}
		} else {
			if(temp < 21) {
				System.out.format("Demasiado baja. Súbala %d grados. Ahorrarás %5.2f%n"
						, 25 - temp, (25 - temp)*3);
			} else {
				System.out.println("La temperatura es adecuada");
			}
		}
	}
}








