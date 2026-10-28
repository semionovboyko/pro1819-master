package _02ejemplos._01Listas;

public class ArrayLista <T> implements Lista<T>{
	private T[] v; //para almacenar los elementos de la lista
	private int numElementos;

	final int TAMINICIAL = 100;
	
	//Constructor
	public ArrayLista(){
		//v = new T[100];
		v = (T[]) new Object[TAMINICIAL];
		numElementos = 0;
	}
	
	
	@Override
	public void add(T elem) {
		if(numElementos == v.length){
			//El array esta lleno
			duplicarCapacidad();
		}
		//Anyado el elemento al final
		v[numElementos] = elem;
		numElementos ++;
	}
	@Override
	public void add(int pos, T elem) {
		if(numElementos == v.length){
			//El array esta lleno
			duplicarCapacidad();
		}
		//Desplazamos una posición a la derecha todos
		//los elementos a partir de la posicion pos
		for(int i = numElementos; i > pos; i--){
			v[i] = v[i-1];
		}
		//Anyadimos en la posicion pos
		v[pos] = elem;
		numElementos ++;
	}

	@Override
	public boolean remove(T elem) {
		//Buscamos elem en el array
		boolean enc = false;
		int pos = 0;
		for (int i = 0; i < numElementos && !enc; i++) {
			if(v[i].equals(elem)){
				pos = i;
				enc = true;
			}
		}
		if(enc){
			remove(pos);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(int pos) {
		//Quitamos el hueco dejado en la posicion pos
		for (int i = pos; i < numElementos-1; i++) {
			v[i] = v[i+1];
		}
		v[numElementos-1] = null;
		numElementos --;
		return true;
	}
	
	private void duplicarCapacidad() {
		//Creo un array con el doble de tamaño
		T[] nuevoV = (T[]) new Object[v.length * 2];
		
		//Copio los elementos de v a nuevoV
		for (int i = 0; i < v.length; i++) {
			nuevoV[i] = v[i];
		}
		//Sustituyo v por el nuevoV
		v = nuevoV;
		
	}
	public String toString(){
		String res = "[";
		for (int i = 0; i < numElementos - 1; i++) {
			res = res + v[i] + ", ";
		}
		if(numElementos > 0){
			res = res + v[numElementos-1];
		}
		res = res + "]";
		return res;
	}

}
