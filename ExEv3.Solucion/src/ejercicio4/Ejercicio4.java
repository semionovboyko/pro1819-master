package ejercicio4;

public class Ejercicio4 {
	//Programa de test
	public static void main(String[] args) {
		Object [] misPropiedades = {
				new VinoAnyejo(2000),
				new Inmueble(70),
				new Inmueble(70),
				new VinoAnyejo(1998)
		};
		System.out.println(calcularValorTotal(misPropiedades));
	}
	
	//A�adir el m�todo calcularValorTotal al que est� llamando el main
	
	public static double calcularValorTotal(Object[] v){
		double total = 0;
		for (int i = 0; i < v.length; i++) {
			total += ((Valorable)v[i]).valorar(); 
		}
		return total;
	}
	
	
}
