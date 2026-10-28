package _02ejemplos;

import java.util.Scanner;

public class _07Descuento {
	public static void main(String args[]){
		//Constante para el precio del artículo
		final double PRECIO = 27.5;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuantas unidades quiere comprar?: ");
		int unidades = tec.nextInt();
		
		double aPagar = unidades * PRECIO;
		//Las compras superiores a 150 euros tienen un descuento del 10%
		if(aPagar > 150) {
			aPagar = aPagar - (aPagar * 10 / 100);
			// aPagar = aPagar * 0.9;
		}
		
		System.out.println("Tienes que pagar " + aPagar + " euros");
		
	}
}
