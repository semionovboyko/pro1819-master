package _02ejemplos;

public class _02RecorridoPorFilas {
	public static void main(String[] args) {
		int[][] m = {{1,2,3},{4,5,6},{2,8},{1,2,3,4,5,6}};
		
		//Para recorrer matrices se usan dos bucles anidados.
		// Uno va cambiando de fila y el otro va cambiando de columna
		
		//Recorremos las filas
		for(int i = 0; i < m.length; i++){
			System.out.print("Fila " + i + ": ");
			//Recorremos las columnas 
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			//Salto de linea
			System.out.println();
		}
		
	}
}
