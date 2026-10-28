package _02ejemplos._03polimorfismo;

import _02ejemplos._02figuras.Circulo;
import _02ejemplos._02figuras.Figura;
import _02ejemplos._02figuras.Rectangulo;
import javafx.scene.paint.Color;

public class SumarAreaFiguras {
	public static void main(String[] args) {
		//La variable figuras es POLIMORFICA:
		// Cada componente del array es de tipo Figura
		// Cada componente del array referencia a un Circulo
		// o a un Rectangulo.
		
		Figura [] figuras = {
				new Circulo(0,0,100,Color.ALICEBLUE),
				new Circulo(0,0,150,Color.ALICEBLUE),
				new Circulo(0,0,210,Color.ALICEBLUE),
				new Circulo(0,0,120,Color.ALICEBLUE),
				new Rectangulo(0,0,10,10,Color.ALICEBLUE),
				new Rectangulo(0,0,20,10,Color.ALICEBLUE),
				new Rectangulo(0,0,10,30,Color.ALICEBLUE),
				new Rectangulo(0,0,10,110,Color.ALICEBLUE),
		};
		double sumaAreas = 0;
		for (int i = 0; i < figuras.length; i++){
			sumaAreas = sumaAreas + figuras[i].area();
		}
		System.out.println("Suma areas: " + sumaAreas);
		
		//Mostrar posición y perimetro de cada figura
		for (int i = 0; i < figuras.length; i++){
			mostrarPosYPerimetro(figuras[i]);
		}
	}
	//El parámetro f es POLIMÓRFICO.
	// Está declarado de tipo Figura.
	// Referenciará a un Circulo o a un Rectangulo
	public static void mostrarPosYPerimetro(Figura f){
		System.out.format("Pos (%d,%d) - Perimetro: %8.2f%n",
				f.getPosX(),f.getPosY(),f.perimetro());
	}
}
