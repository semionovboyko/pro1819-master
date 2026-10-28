package _03ejercicios._09sumaarray;

public class SubArraySumaCero {
	public static void main(String[] args) {
		//int [] v = {2,1,1,1,-1,-2, 1,1,1,1,1,1,1,1,1,0,1};
		//int [] v = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int v[] = new int [1000000];
		for (int i = 0; i < v.length; i++) {
			v[i] = 1;
		}	
				
		long t1 = System.currentTimeMillis();		
		boolean enc = false;
		for(int i = 0; i< v.length && !enc; i++){
			//Comprobamos si en la pos i comienza una secuencia
			// que sume 0 de longitud cualquiera
			int suma = 0;
			for(int j = i; j < v.length && !enc; j++){
				suma += v[j];
				if(suma == 0){
					enc = true;
					System.out.format("Posiciones %d a %d%n" , i, j);
				}
			}
		}

		if(!enc){
			System.out.println("Ninguna secuencia suma cero");
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
	}

}
