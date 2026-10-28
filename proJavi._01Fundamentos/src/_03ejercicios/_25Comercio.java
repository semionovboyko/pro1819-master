package _03ejercicios;

import java.util.Scanner;

public class _25Comercio {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
	
		System.out.println("Introduzca importe compra: ");
		double importeCompra = tec.nextDouble();
		double descuento = 0;
		
		if(importeCompra > 40) {
			descuento = 8;
		}
		
		double descuentoAplicado = importeCompra * descuento / 100;
		if(descuentoAplicado > 12){
			descuentoAplicado = 12;
		}
		
		System.out.println("Porcentaje descuento: " + descuento + " %");
		
		System.out.println("Descuento aplicado: " + descuentoAplicado);
		
		System.out.println("Cantidad a pagar: " 
								+ (importeCompra - descuentoAplicado));
		
		
		
	}
}
	
	
	
	
	
	
	
	
