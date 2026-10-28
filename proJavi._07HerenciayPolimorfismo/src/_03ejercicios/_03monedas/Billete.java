package _03ejercicios._03monedas;

public class Billete extends Dinero{
	private double altura;
	private double anchura;
	
	public Billete(double valor, int anyo, double altura, double anchura){
		super(valor,anyo);
		this.altura = altura;
		this.anchura = anchura;
	}
	public String toString(){
		return String.format("%s - %s - Alto: %3.1f - Ancho %3.1f",
				"BILLETE", super.toString(), altura, anchura); 
	}
}
