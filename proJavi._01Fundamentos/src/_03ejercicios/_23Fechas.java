package _03ejercicios;

import java.util.Scanner;

public class _23Fechas {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		int d1,m1,a1,d2,m2,a2;
		
		System.out.println("Fecha 1 (dia mes año): ");
		d1 = tec.nextInt();
		m1 = tec.nextInt();
		a1 = tec.nextInt();
		
		System.out.println("Fecha 2 (dia mes año): ");
		d2 = tec.nextInt();
		m2 = tec.nextInt();
		a2 = tec.nextInt();
		
		if(a1 < a2){
			System.out.println(d1 + "/" + m1 + "/" + a1);
		} else if(a1 > a2){
			System.out.println(d2 + "/" + m2 + "/" + a2);
		} else {
			//Los años son iguales. Comprobamos el mes
			if(m1 < m2){
				System.out.println(d1 + "/" + m1 + "/" + a1);
			} else if (m1 > m2){
				System.out.println(d2 + "/" + m2 + "/" + a2);
			} else {
				//Los meses son iguales. Comprobamos el dia
				if(d1 < d2){
					System.out.println(d1 + "/" + m1 + "/" + a1);
				} else if (d1 > d2){
					System.out.println(d2 + "/" + m2 + "/" + a2);
				} else {
					//Las fechas son iguales
					System.out.println("Las fechas son iguales");
				}
			}
		}
		
	}
}
