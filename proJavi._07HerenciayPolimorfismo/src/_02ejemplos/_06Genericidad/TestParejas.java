package _02ejemplos._06Genericidad;

import _02ejemplos._04interfaces.Perro;

public class TestParejas {
	public static void main(String[] args) {
		//Una pareja de baile
		Pareja<String,String> p1 = new Pareja<>("Fred A.","Ginger R.");
		System.out.println(p1);
		
		//Pareja: Baloncestista y nombre de su entrenador
		Pareja<Baloncestista,String> p2 
			= new Pareja<>(new Baloncestista("Pepe"),"Luis");
		System.out.println(p2);
		//Pareja: Mascotas de futbolistas
		Pareja <Futbolista, Perro> p3
			= new Pareja<>(new Futbolista("Antonio"), new Perro("Lassy"));
			
		System.out.println(p3);
		
	}
}
