package _02ejemplos;

public class _03RecorridoPorColumnas {
	public static void main(String[] args) {
		int[][] m = {{1,2,3},{4,5,6},{1,1,1},{9,4,2}};
		
		//Para recorrer matrices se usan dos bucles anidados.
		// Uno va cambiando de fila y el otro va cambiando de columna
		
		//Recorremos las columnas
		for(int j = 0; j < m[0].length; j++){
			System.out.print("Columna " + j + ": ");
			//Recorremos las filas 
			for(int i = 0; i < m.length; i++){
				System.out.print(m[i][j] + " ");
			}
			//Salto de linea
			System.out.println();
		}
		
	}
}
