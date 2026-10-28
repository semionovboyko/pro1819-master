package _03ejercicios;

public class _02Lluvias {
	public static void main(String[] args) {
		double[] precip ={	2.3, 2.2, 2.1, 2.0, 1.8,
							0.0, 0.0, 0.0, 0.0, 0.0,
							12, 13, 12, 12, 13,
							20, 21, 22, 23, 24,
							0.0, 0.0, 0.0, 0.0, 0.0,
							0.0, 0.0, 0.0, 0.0, 0.0, 8};
		//Lluvia total
		System.out.println("Lluvia total: " + lluviaTotal(precip));
		//Lluvia media
		System.out.println("Lluvia media: " + lluviaMedia(precip));
		//Lluvia máxima
		System.out.println("LLuvia maxima: " + lluviaMaxima(precip));
	}
	
	public static double lluviaTotal(double[] p){
		//Recorro el array sumando sus componentes
		double suma = 0;
		for (int i = 0; i < p.length; i++) {
			suma += p[i]; 
		}
		return suma;
	}
	
	public static double lluviaMedia(double[] p){
		//Recorro el array sumando sus componentes
		double suma = 0;
		for (int i = 0; i < p.length; i++) {
			suma += p[i]; 
		}
		return suma / p.length;
	}
	
	public static double lluviaMedia2(double[] p){
		double suma = lluviaTotal(p);
		return suma / p.length;
	}
	
	public static double lluviaMaxima(double p[]){
		double max = p[0];
		for (int i = 1; i < p.length; i++) {
			if(p[i] > max){
				max = p[i];
			}
		}
		return max;
	}

	public static double lluviaMinima (double p[]){
		double min = p[0];
		for (int i = 1; i < p.length; i++) {
			if(p[i] < min){
				min = p[i];
			}
		}
		return min;
	}

	public int diaMasLluvia(double p[]){
		int diaMax = 0;
		for(int i = 1; i < p.length; i++){
			if(p[i] > p[diaMax]){
				diaMax = i;
			}
		}
		return diaMax;
	}
	
	public int diaMenosLluvia(double p[]){
		int diaMin = 0;
		for(int i = 1; i < p.length; i++){
			if(p[i] < p[diaMin]){
				diaMin = i;
			}
		}
		return diaMin;
	}
}









