package _05ejgenericidad._03metodosgenericos;

public class Genericos {
	public static void main(String[] args) {
		System.out.println(minimo(1,2));
		System.out.println(minimo(new Integer(1), new Integer(2)));
		System.out.println(minimo("casa","agua"));
		
		//Da error de compilación porque Object no implementa 
		// Comparable
		//System.out.println(minimo(new Integer(5),"casa"));
		
	}
	public static <T extends Comparable<T>> T minimo(T o1, T o2){
		if(o1.compareTo(o2) < 0) return o1;
		else return o2;
	}
}
