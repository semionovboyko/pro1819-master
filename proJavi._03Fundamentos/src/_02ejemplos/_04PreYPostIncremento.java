package _02ejemplos;

public class _04PreYPostIncremento {
	public static void main(String[] args) {
		
		//Con preincremento
		int a, b;
		
		a = 10;
		b = ++a;
		System.out.format("Preincremento a = %d, b = %d %n",a,b);
		
		
		//Con postincremento
		a = 10;
		b = a++;
		System.out.format("Postincremento a = %d, b = %d %n",a,b);
		
		
	}

}
