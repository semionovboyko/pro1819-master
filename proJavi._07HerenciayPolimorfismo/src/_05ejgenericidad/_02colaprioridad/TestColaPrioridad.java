package _05ejgenericidad._02colaprioridad;

import _03ejercicios._02gestionhospital.Paciente;

public class TestColaPrioridad {
	public static void main(String[] args) {
		ColaPrioridad<Paciente> c = new ColaPrioridad();
		c.encolar(new Paciente("Luis",30));
		c.encolar(new Paciente("Pablo",31));
		c.encolar(new Paciente("Vicente",32));
		c.encolar(new Paciente("Miguel",33));
		c.encolar(new Paciente("Angel",34));
		
		while(c.talla()!=0){
			System.out.println(c.primero());
			c.desencolar();
		}
	}
}
