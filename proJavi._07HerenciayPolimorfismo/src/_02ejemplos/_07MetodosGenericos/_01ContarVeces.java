package _02ejemplos._07MetodosGenericos;

public class _01ContarVeces {
	public static void main(String[] args) {
		int[] v1 = {1,1,1,1,2,2,2,2,3};
		System.out.println(veces(v1,2));
		
		String[] v2 = {"a","a","a","b","b","c","d"};
		System.out.println(veces(v2,"a"));
		System.out.println(vecesHastaV1_4(v2,"a"));
		System.out.println(vecesDesdeV1_4(v2,"a"));
	}

	//Método que devuelve las veces que x aparece en un array
	public static int veces(int[] v, int x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] == x) cont++;
		}
		return cont;
		
	}
	public static int veces(double[] v, double x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] == x) cont++;
		}
		return cont;
	}
	public static int veces(String[] v, String x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].equals(x)) cont++;
		}
		return cont;
	}
	//Método genérico para cualquier tipo de objeto
	//Hasta la Versión 1.4. de Java se usa Object
	public static int vecesHastaV1_4(Object[] v, Object x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].equals(x)) cont++;
		}
		return cont;
	}
	//A partir de la v 1.4 se puede usar notación de diamante <>
	public static <T> int vecesDesdeV1_4(T[] v, T x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].equals(x)) cont++;
		}
		return cont;
	}
	

}
