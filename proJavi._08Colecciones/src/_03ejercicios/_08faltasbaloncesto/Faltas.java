package _03ejercicios._08faltasbaloncesto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faltas {
	final static String M = "Miguel";
	final static String P = "Pablo";
	final static String V = "Vicente";
	final static String L = "Luis";
	final static String A = "Antonio";
	final static String R = "Raul";
	final static String S = "Sergio";
	
	public static void main(String[] args) {
		Set<String> jugadores = new TreeSet<>();
		jugadores.add(M);
		jugadores.add(P);
		jugadores.add(V);
		jugadores.add(L);
		jugadores.add(A);
		jugadores.add(R);
		jugadores.add(S);
		
		String[] faltas = {M,P,V,M,P,P,P,A,R,P,M,A,M,S,M,S};
		
		//Simular las faltas del partido. Avisar cada vez que un jugador es
		// expulsado por 5 faltas
		//Al final, mostrar los jugadores que quedan sin expulsar.
		
		Map<String,Integer> m = new HashMap<>();
		
		for (int i = 0; i < faltas.length; i++) {
			Integer cont = m.get(faltas[i]);
			if(cont == null){
				//Primera falta. Le quedan 4
				m.put(faltas[i], 4);
			} else {
				if(cont > 1){
					//Aun no se le expulsa. Dispone de una falta menos
					m.put(faltas[i], cont - 1);
				} else {
					//Ha hecho la 5a falta.
					System.out.println(faltas[i] + " expulsado");
					//Lo elimino del map y del set
					m.remove(faltas[i]);
					jugadores.remove(faltas[i]);
				}
			}
		}
		System.out.println(jugadores);
		
	}
}
