package _02ejemplos;

public class _02CambioTipo {
	public static void main(String[] args) {
		
		//En una asignación, variable y expresión tienen que ser 
		// del mismo tipo
		
		int a = 2;
		int b = a;
		int c = a + 1;
		
		// o de tipos compatibles: CONVERSIÓN IMPLÍCITA
		
		double d = 4; //Conversión implícita de 4 a double
		double e = a; //Conversión implícita de a a double
		float f = b; // Conversión implícita de b a float
		
		
		//A veces queremos convertir de un tipo a otro
		// de forma EXPLÍCITA: CONVERSIÓN EXPLÍTITA
		
		//Ejemplo 1
		double superficieHabitacion = 48.39;
		double metrosPorPersona = 0.93;
		//Cuantas personas caben en la habitacion
		int caben = (int) (superficieHabitacion / metrosPorPersona);
		System.out.format("En la habitación caben %d personas%n", caben);
		
		//Ejemplo 2
		int sumaEdades = 153;
		int numPersonas = 7;
		
		double media = (double) sumaEdades / numPersonas;
		
		System.out.format("La media de edad de las %d personas es %4.1f%n",
				numPersonas, media);
		
		
	}
}


