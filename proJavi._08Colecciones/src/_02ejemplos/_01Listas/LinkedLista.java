package _02ejemplos._01Listas;

public class LinkedLista <T> implements Lista<T>{
	//Atributos
	Nodo<T> primero;
	Nodo<T> ultimo;
	
	//Constructor
	public LinkedLista(){
		primero = null;
		ultimo = null;
	}
	
	
	@Override
	public void add(T elem) {
		Nodo<T> nuevo = new Nodo<>(elem);
		if(primero == null){
			//La lista estaba vacía
			primero = nuevo;
			ultimo = nuevo;
		} else {
			//La lista ya tenía algún elemento
			ultimo.siguiente = nuevo;
			ultimo = nuevo;
		}
	}
	
	@Override
	public void add(int pos, T elem) {
		Nodo<T> nuevo = new Nodo<>(elem);
		if(pos == 0){
			nuevo.siguiente = primero;
			primero = nuevo;
			if(ultimo == null){
				ultimo = nuevo;
			}
		} else {
			//localizamos al elemento de la posicion pos - 1
			Nodo<T> ant = primero;
			for(int i = 0; i < pos; i++){
				ant = ant.siguiente;
			}
			nuevo.siguiente = ant.siguiente;
			ant.siguiente = nuevo;
			if(ultimo == ant){
				ultimo = nuevo;
			}
		}
		
	}

	@Override
	public boolean remove(T elem) {
		return false;
	}

	@Override
	public boolean remove(int pos) {
		return false;
	}
	
	public String toString(){
		return "";
	}

}
