package _02ejemplos._01tiempo;

public class _01HorarioInstituto {
	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(7,55,0);
		Tiempo t2 = new Tiempo(8,50,0);
		Tiempo t3 = new Tiempo(9,45);
		Tiempo t4 = new Tiempo(10,40);
		
		//Todos los objetos tienen un método toString(), 
		// que sirve para obtener una representacion
		// del objeto en forma de texto
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		
		//Cuando pongo un objeto en un contexto en el que debe ir
		// un texto, java llama automaticamente al toString de ese
		// objeto
		
		System.out.println(t1+ " " + t2);
		//Esto es exactamente lo mismo que
		System.out.println(t1.toString()+ " " + t2.toString());
		
		//Intentamos acceder a los atributos de los objetos
//		System.out.println("Hora de entrada: " + t1.hora);
//		t2.hora = 10;
		System.out.println("Hora de entrada: " + t1.getHora());
		t2.setHora(10);
		
		//Puedo crear objetos "incorrectos"?
		Tiempo tRaro = new Tiempo(100,2399,14);
		System.out.println(tRaro);
		tRaro.setHora(2000);
		System.out.println(tRaro);
		
		
	}

}




