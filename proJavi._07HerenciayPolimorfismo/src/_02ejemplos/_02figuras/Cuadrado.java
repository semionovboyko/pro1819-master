package _02ejemplos._02figuras;

import javafx.scene.paint.Color;

public class Cuadrado extends Rectangulo{
	//Cuadrado no tiene atributos extra
	
	//Constructor
	public Cuadrado(int posX, int posY, int lado, Color color){
		super(posX,posY,lado,lado,color);
	}

	@Override
	public void setAncho(int ancho){
		super.setAncho(ancho);
		super.setAlto(ancho);
	}
	
	@Override
	public void setAlto(int alto){
		super.setAncho(alto);
		super.setAlto(alto);
	}

	public int getLado(){
		return getAncho(); // o getAlto()
	}
	
	public void setLado(int lado){
	//	super.setAncho(alto);
	//	super.setAlto(alto);
	//	o bien ...
		this.setAncho(lado); // o this.setAlto();
	}
}
