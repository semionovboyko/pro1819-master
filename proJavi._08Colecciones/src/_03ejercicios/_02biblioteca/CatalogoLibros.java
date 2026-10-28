package _03ejercicios._02biblioteca;

import java.util.Collection;
import java.util.HashSet;

public class CatalogoLibros {
	private Collection<Libro> catalogo;
	
	public CatalogoLibros(Libro[] v){
		//catalogo = new LinkedList<>(); //contains se basa en equals
		//catalogo = new ArrayList<>(); //contains se basa en equals
		//catalogo = new TreeSet<>(); //contains se basa compareTo
		catalogo = new HashSet<>(); 
		for (int i = 0; i < v.length; i++) {
			catalogo.add(v[i]);
		}
	}
	
	public boolean buscarLibro(String titulo){
		Libro aux = new Libro(titulo, null,null);
		if(catalogo.contains(aux)){
			return true;
		} else {
			return false;
		}
	}
}
