package _02ejemplos;

import java.util.Arrays;

public class _04Adyacentes {
	public static void main(String[] args) {
		char[][] datos = {
					{' ',' ','#',' ',' ',' '},
					{'#',' ','#',' ',' ',' '},
					{' ',' ',' ','#',' ',' '},
					{' ',' ',' ',' ',' ',' '}
				} ;
		
		int [][] vecinas = matrizDeVecinos(datos);
		for (int i = 0; i < vecinas.length; i++) {
			System.out.println(Arrays.toString(vecinas[i]));
		}
	}
	
	public static int[][] matrizDeVecinos(char [][] datos){
		int [][] total = new int[datos.length][datos[0].length];
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				total[i][j] = contarVecinos(datos,i,j);
			}
		}
		return total;
	}
	public static int contarVecinos (char[][] datos, int fila, int col){
		int cont = 0;
		for (int i = fila-1; i <= fila + 1; i++) {
			for (int j = col-1; j <= col + 1; j++) {
				//Compruebo si (i,j) es una posicion correcta
				if(i >= 0 && j >= 0 && i < datos.length && j < datos[0].length){
					//Si hay un # ...
					if(datos[i][j] == '#'){
						cont ++;
					}
				}
				
			}
		}
		return cont;
	}
	public static int contarVecinos2 (char[][] datos, int fila, int col){
		int cont = 0;
		
		if(datos[fila][col] == '#') cont ++;
		if(fila >= 1 && datos[fila-1][col] == '#') cont ++;
		if(fila <= datos.length-2 && datos[fila+1][col] == '#') cont ++;
		try{
			if(datos[fila][col-1] == '#') cont ++;
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		
		// ... etc
		// ... etc
		// ... etc
		return cont;
	}

}
