package _05ejgenericidad._02colaprioridad2;

public class TestColaPrioridad {
	public static void main(String[] args) {
		ColaPrioridad<UrgenciaMedica> c = new ColaPrioridad<>();
		c.encolar(new UrgenciaMedica("Pierna rota",6));
		c.encolar(new UrgenciaMedica("Brazo roto",5));
		c.encolar(new UrgenciaMedica("Dolor fuerte pecho",8));
		c.encolar(new UrgenciaMedica("Vomitos",4));
		
		while(c.talla()!=0){
			System.out.println(c.primero());
			c.desencolar();
		}
	}
}
