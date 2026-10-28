package _04ejpolimorfismo._01obreros;

public class Carpintero extends Obrero 
	implements Montador {

	public Carpintero(){
		//super();
		System.out.println("Se crea carpintero");
	}
	
	@Override
	public void montar(String x) {
		System.out.println("Montando " + x);
		
	}

	@Override
	public void desmontar(String x) {
		System.out.println("Desmontando " + x);
		
	}
	
	public void clavar(){
		System.out.println("Carpintero clavando ...");
	}
}
