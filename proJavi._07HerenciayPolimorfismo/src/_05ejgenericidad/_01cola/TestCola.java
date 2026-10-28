package _05ejgenericidad._01cola;

public class TestCola {
	public static void main(String[] args) {
		Cola<String> c = new Cola<>();
		//Llegan personas a la cola
		c.encolar("Miguel");
		c.encolar("Pablo");
		c.encolar("Vicente");
		c.encolar("Rosa");
		c.encolar("Luis");
		
		//Las atendemos en el orden en que llegaron
		while(c.talla() > 0){
			System.out.println(c.primero());
			c.desencolar();
		}
	}
}
