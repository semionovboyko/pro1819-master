package _02ejemplos._02figuras;

import javafx.scene.paint.Color;

public class TestCuadrado {
	public static void main(String[] args) {
		Cuadrado c = new Cuadrado(10,10,30,Color.ANTIQUEWHITE);
		
		System.out.println("Ancho: " + c.getAncho());
		System.out.println("Alto: " + c.getAlto());
		
		c.setAncho(100);
		System.out.println("Ancho: " + c.getAncho());
		System.out.println("Alto: " + c.getAlto());
	}
}
