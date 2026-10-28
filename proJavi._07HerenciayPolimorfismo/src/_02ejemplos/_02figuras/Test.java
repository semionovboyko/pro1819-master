package _02ejemplos._02figuras;

import java.util.ArrayList;
import javafx.scene.paint.Color;

public class Test {
	public static void main(String[] args) {
		ArrayList<Figura> listaFiguras = new ArrayList<>();
		
		listaFiguras.add(new Circulo(100,120,50,Color.AQUAMARINE));
		listaFiguras.add(new Rectangulo(400,400,100,200,Color.AQUA));
		listaFiguras.add(new Circulo(130,100,60,Color.BEIGE));
		listaFiguras.add(new Circulo(110,118,20,Color.BROWN));
		listaFiguras.add(new Rectangulo(500,400,130,200,Color.DARKKHAKI));
		
		for(Figura f: listaFiguras){
			//Posicion
			System.out.format("(%d, %d)%n", f.getPosX(),f.getPosY());
			
			//¿Radio?
			//System.out.format("Radio: %d",f.getRadio());
			
			//Perimetro
			System.out.format("Perimetro: %6.2f%n", f.perimetro());
		}
	}
}
