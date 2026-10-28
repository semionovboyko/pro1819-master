package _03ejercicios;

public class _08Lluvias {
	public static void main(String[] args) {
		double[] precip ={	2.3, 2.2, 2.1, 2.0, 1.8,
							0.0, 0.0, 0.0, 0.0, 0.0,
							12, 13, 12, 12, 13,
							20, 21, 22, 23, 24,
							0.0, 0.0, 0.0, 0.0, 0.0,
							0.0, 0.0, 0.0, 0.0, 0.0, 8};
		//Primer dia que no llovió
		System.out.println(primerDiaLluviaX(precip, 0));
		
	}
	public static int primerDiaLluviaX(double[] p, double x){
		//Búsqueda ascendente
		boolean enc = false;
		int i = 0;
		while(i < p.length && !enc){
			if(p[i] == x){
				enc = true;
			} else {
				i++;
			}
		}
		if(enc){
			return i;
		} else {
			return -1;
		}
	}
	public static int ultimoDiaLluviaX(double[] p, double x){
		//Búsqueda ascendente
		boolean enc = false;
		int i = p.length-1;
		while(i >= 0 && !enc){
			if(p[i] == x){
				enc = true;
			} else {
				i--;
			}
		}
		if(enc){
			return i;
		} else {
			return -1;
		}
	}
	
}