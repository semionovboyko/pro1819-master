package ejercicio4;

public class Inmueble implements Valorable{
	private double metros;
	public Inmueble(double metros){
		this.metros = metros;
	}
	public double valorar(){
		return metros * 1000;
	}
}
