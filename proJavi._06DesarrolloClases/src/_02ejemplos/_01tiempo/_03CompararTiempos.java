package _02ejemplos._01tiempo;

public class _03CompararTiempos {
	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(8,0,0);
		Tiempo t2 = new Tiempo(9,30,0);
		Tiempo t3 = new Tiempo(8,0,0);
		
		System.out.println(t1 == t2); //Falso. No son el mismo objeto
		System.out.println(t1 == t1); //True. Son el mismo objeto
		
		System.out.println(t1.equals(t2)); //False. No son iguales
		System.out.println(t1.equals(t3)); //True. Son iguales
		System.out.println(t1.equals(t1)); //True. Son el mismo objeto 
											// y por tanto iguales
		
		System.out.println(t1.equals("pepe"));
		
	}

}
