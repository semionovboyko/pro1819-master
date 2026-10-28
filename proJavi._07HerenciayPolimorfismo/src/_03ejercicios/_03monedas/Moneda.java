package _03ejercicios._03monedas;

public class Moneda extends Dinero{
	private double diametro;
	private double peso;
	
	public Moneda(double valor, int anyo, double diametro, double peso){
		super(valor,anyo);
		this.diametro = diametro;
		this.peso = peso;
	}
	public String toString(){
		return String.format("%s - %s - Diam: %3.1f - Peso %3.1f",
				"MONEDA", super.toString(), diametro, peso); 
	}
}
