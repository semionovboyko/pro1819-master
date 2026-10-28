package _02ejemplos;

public class _05EjerciciosRepaso {
	public static void main(String[] args) {
		int [][] datos = {
					{1,2,3,4,5},
					{5,4,3,2,1},
					{6,7,8,9,10},
					{0,0,0,0,0}
				};
		System.out.println(contarFilasSumanX(datos, 15));	//2
		System.out.println(contarFilasSumanX(datos, 0));	//1
		System.out.println(contarFilasSumanX(datos, 100));	//0
	}
	public static int contarFilasSumanX(int [][] m, int x){
		int cont = 0;
		//Recorro por filas
		for (int i = 0; i < m.length; i++) {
			//Calculo la suma de la fila
			int suma = 0;
			for (int j = 0; j < m[i].length; j++) {
				suma += m[i][j];
			}
			if(suma == x){
				cont ++;
			}
		}
		return cont;
	}
	public static boolean buscarPareja (int v[], int x, int y){
		boolean enc = false;
		int i = 0;
		while(i < v.length - 1 && !enc){
			if(v[i] == x && v[i+1] == y){
				enc = true;
			} else {
				i++;
			}
		}
		return enc;
	}
	public static boolean buscarPareja (String v[], String x, String y){
		boolean enc = false;
		int i = 0;
		while(i < v.length - 1 && !enc){
			if(v[i].equals(x) && v[i+1].equals(y)){
				enc = true;
			} else {
				i++;
			}
		}
		return enc;
	}
	//Devolver número de columnas en las que el primer elemento
	// y el ultimo elemento coinciden
	public static int columnasIniFin(int m[][]){
		int cont = 0;
		//Recorremos por columnas 
		for(int j = 0; j < m[0].length; j++){
			//Comparamos primer y ultimo elemento de la columna
			if(m[0][j] == m[m.length-1][j]) cont++;
		}
		return cont;
	}

}
