package _04ejpolimorfismo._01obreros;

public class Test {
	public static void main(String[] args) {
		Montador m1 = new Carpintero();
		// Un Albanyil NO ES un Montador
		// La clase Albanyil NO IMPLEMENTA Montador
		// Montador m2 = new Albanyil();
		Obrero o1 = new Carpintero();
		Obrero o2 = new Albanyil();
		
		//La clase Obrero no tiene método montar(...)
		//o1.montar("Mesa");
		
		//La clase Obrero no tiene método levantarMuro(...)
		//o2.levantarMuro();
		
		//El interface Montador no tiene método saludar()
		//m1.saludar();
		
		m1.montar("Silla");
		((Albanyil) o2).levantarMuro();
		
		//Compila, pero produce excepción al ejecutar
		//ClassCastException
		((Albanyil) o1).levantarMuro();
	
		
	}
}
