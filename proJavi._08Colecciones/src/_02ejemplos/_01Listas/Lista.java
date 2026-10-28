package _02ejemplos._01Listas;

public interface Lista<T> {
	void add(T elem);
	void add(int pos, T elem);
	boolean remove(T elem);
	boolean remove(int pos);
}
