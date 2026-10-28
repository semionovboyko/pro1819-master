package _03ejercicios._06diccionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DiccionarioBilingue {
	private Map<String, Set<String> > diccionario;
	
	public DiccionarioBilingue(){
		diccionario = new HashMap<>();
	}
	
	
	public boolean anyadirTraduccion(String palCast, String palIngl){
		
		Set<String> traducciones = diccionario.get(palCast);
		if(traducciones == null){
			//palCast es nueva. Creo un set que contenga a la palabra
			// en ingles y pongo la pareja en el map
			traducciones = new HashSet<>();
			traducciones.add(palIngl);
			diccionario.put(palCast, traducciones);
			return true;
		} else {
			//palCast ya estaba. Anyado la traduccion
			return traducciones.add(palIngl);
		}
		
	}
	
	public boolean quitarTraduccion(String palCast, String palIngl){
		Set<String> traducciones = diccionario.get(palCast);
		if(traducciones == null){
			return false;
		} else {
			boolean quitado = traducciones.remove(palIngl);
			if(traducciones.isEmpty()){
				//La palabra se ha quedado sin traducciones
				diccionario.remove(palCast);
			}
			return quitado;
		}	
	}
	//Traduce la frase usando la primera traducción de cada 
	//palabra. Si una palabra no tiene traducción deja la 
	//original.
	public String traducir(String frase){
		String fraseTraducida = "";
		StringTokenizer st = new StringTokenizer(frase, " ");
		while(st.hasMoreTokens()){
			String palCast = st.nextToken();
			
			//Traducir la palabra
			Set<String> traducciones = diccionario.get(palCast);
			if(traducciones == null){
				fraseTraducida += palCast + " ";
			} else {
				//Obtenemos la primera traduccion
				Iterator<String> it = traducciones.iterator();
				String palIngl = it.next();
				fraseTraducida += palIngl+ " ";
			}
		}
		return fraseTraducida;
	}
	
	public String toString(){
		return diccionario.toString();
	}

}
