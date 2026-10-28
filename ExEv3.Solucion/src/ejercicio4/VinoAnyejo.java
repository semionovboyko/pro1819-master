package ejercicio4;

public class VinoAnyejo implements Valorable{
	private double anyos;
	public VinoAnyejo (int anyos){
		this.anyos = anyos;
	}
	public double valorar(){
		return anyos * 10;
	}
}
