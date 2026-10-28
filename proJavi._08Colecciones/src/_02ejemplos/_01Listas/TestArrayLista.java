package _02ejemplos._01Listas;

public class TestArrayLista {
	public static void main(String[] args) {
		ArrayLista<String> l = new ArrayLista<>();
		
		System.out.println(l);
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		System.out.println("------------");
		System.out.println(l);
		l.add(2,"100");
		System.out.println("------------");
		System.out.println(l);
		l.remove("100");
		System.out.println("------------");
		System.out.println(l);
	}
}
