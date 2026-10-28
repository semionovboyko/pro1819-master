package _02ejemplos._02figuras;

import javafx.scene.paint.Color;

public abstract class Figura {
	//Atributos
	private Color color;
	private int posX;
	private int posY;
	
	public Figura(int posX, int posY, Color color){
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	public abstract double perimetro();
	
	public abstract double area();
	

}
