package _02ejemplos;

public class _01Format {
	public static void pepe(String[] args) {
		
		int edad = 40; 
		double peso = 80.5;
		String nombre = "Miguel";
		
				
		//Salida con println
		System.out.println("Tienes " + edad + " años.");
	    System.out.println("Pesas " + peso + " quilos" );
		System.out.println("Te llamas " + nombre);
		System.out.println("-----------------");
		
		//Salida con format
		System.out.format("Tienes %d años %n", edad);
		System.out.format("Pesas %f quilos %n",peso);
		System.out.format("Te llamas %s %n", nombre);
		System.out.println("-----------------");
		
		//Se puede insertar más de un dato en la cadena de formato
		
		int a = 20;
		int b = 5;
		System.out.format("La media de %d y %d es %f %n", a, b,(a+b)/2.0);
		System.out.println("-----------------");
		
		
		//Alinear números 
		int num1 = 1, num2 = 27, num3 = 123485;
		
		System.out.format("Cantidad: %d euros%n", num1);
		System.out.format("Cantidad: %d euros%n", num2);
		System.out.format("Cantidad: %d euros%n", num3);

		System.out.println(" Ocupar un espacio fijo");
		System.out.format("Cantidad: %8d euros%n", num1);
		System.out.format("Cantidad: %8d euros%n", num2);
		System.out.format("Cantidad: %8d euros%n", num3);
		
		System.out.println(" Ocupar un espacio fijo y rellenar con ceros");
		System.out.format("Cantidad: %08d euros%n", num1);
		System.out.format("Cantidad: %08d euros%n", num2);
		System.out.format("Cantidad: %08d euros%n", num3);
		
		System.out.println(" Ocupar un espacio fijo alineado izq");
		System.out.format("Cantidad: %-8d euros%n", num1);
		System.out.format("Cantidad: %-8d euros%n", num2);
		System.out.format("Cantidad: %-8d euros%n", num3);
		System.out.println("-------------------------------------");
		//Numeros reales
		double r1 = 20.5, r2 = 123.55798, r3 = 13413.22;
		
		System.out.format("Cantidad: %f euros%n", r1);
		System.out.format("Cantidad: %f euros%n", r2);
		System.out.format("Cantidad: %f euros%n", r3);
		
		System.out.println("Ocupar espacio fijo");
		System.out.format("Cantidad: %11.4f euros%n", r1);
		System.out.format("Cantidad: %11.4f euros%n", r2);
		System.out.format("Cantidad: %11.4f euros%n", r3);
		
		System.out.println("Ocupar espacio fijo con ceros izq");
		System.out.format("Cantidad: %011.4f euros%n", r1);
		System.out.format("Cantidad: %011.4f euros%n", r2);
		System.out.format("Cantidad: %011.4f euros%n", r3);
	}
}








