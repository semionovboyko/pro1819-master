package ejercicio3;
//
//No hay que modificar esta clase!!!!!
//
public class Armario {
	
	String modelo;
	int alto;
	int ancho;
	int profundo;
	double precio;
	
	public Armario(String modelo, int alto, int ancho, int profundo, double precio){
		this.modelo = modelo;
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
		this.precio = precio;
	}
	public String toString(){
		return "Modelo: " + modelo +
				"\nMedidas: " +alto + " x " + ancho + " x "+ profundo +
				"\nPVP: " + precio + " euros";
	}
	
	//Dos armarios son iguales si coinciden sus modelos
	public boolean equals(Object o){
		return this.modelo.equals(((Armario)o).modelo);
	}
	
	public String getModelo() {
		return modelo;
	}
	public int getAlto() {
		return alto;
	}
	public int getAncho() {
		return ancho;
	}
	public int getProfundo() {
		return profundo;
	}
	public double getPrecio() {
		return precio;
	}
}
