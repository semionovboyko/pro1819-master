package _02ejemplos;

import java.util.ArrayList;

public class _05RepasoListas {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<String> nombresA = new ArrayList<>();
		ArrayList<String> nombresB = new ArrayList<>();
		
		nombres.add("Luis");
		nombres.add("Ana");
		nombres.add("Bea");
		nombres.add("Andres");
		nombres.add("Bonifacio");
		nombres.add("German");
		
		
		repartir(nombres, nombresA, nombresB);
		System.out.println(nombres);
		System.out.println(nombresA);
		System.out.println(nombresB);
		
		
	}
	//todos contiene una serie de Strings, 
	// hay que pasar al ArrayList conA todos los que empiezan por "a" o "A"
	// hay que pasar al ArrayList conB todos los que empiezan por "b" o "B"
	public static void repartir(
			ArrayList<String> todos,
			ArrayList<String> conA, 
			ArrayList<String> conB){
		
		for(int i = 0; i < todos.size(); i++){
			String texto = todos.get(i);
			if(texto.toUpperCase().charAt(0) == 'A'){
				conA.add(texto);
				todos.remove(i);
				i--;
			} else if(texto.toUpperCase().charAt(0) == 'B'){
				conB.add(texto);
				todos.remove(i);
				i--;
			}
		}
	}
	public static void repartir2(ArrayList<String> todos,ArrayList<String> conA,ArrayList<String> conB){
		
		for(int i = todos.size() - 1; i >= 0; i--){
			String texto = todos.get(i);
			if(texto.toUpperCase().charAt(0) == 'A'){
				conA.add(0,texto);
			} else if(texto.toUpperCase().charAt(0) == 'B'){
				conB.add(0,texto);
			}
		}
	}
}
