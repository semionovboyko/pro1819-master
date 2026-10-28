package _02ejemplos._03atributosDeClase;

public class TestX {
	public static void main(String[] args) {
		X x1 = new X(); //Constructor por defecto
		X x2 = new X();
		
		System.out.println("x1: " + x1.toString());
		System.out.println("x2: " + x2.toString());
		
		//Modificamos el atributo1 de cada objeto
		x1.setAtributo1(10);
		x2.setAtributo1(20);
		System.out.println("x1: " + x1.toString());
		System.out.println("x2: " + x2.toString());
	
		//Modificamos el atributo2 de x1
		x1.setAtributo2(100);
		System.out.println("x1: " + x1.toString());
		System.out.println("x2: " + x2.toString());
		
		
		//Modificamos el atributo2 de x2
		x1.setAtributo2(200);
		System.out.println("x1: " + x1.toString());
		System.out.println("x2: " + x2.toString());
	}
}
