package _03ejercicios;

public class _19Tetris {
	public static void main(String[] args) {
		int[][] tetris = {
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,2,0,0,0,0,0},
				{1,0,2,2,2,2,2,0},
				{1,0,2,3,3,0,4,0},
				{1,1,2,3,3,4,4,4}
		};
		mostrar(tetris);
		limpiarCompletas(tetris);
		mostrar(tetris);
	}
	public static void limpiarCompletas (int[][] m){
		int fila = m.length-1;
		boolean quedanPiezas = true;
		while(fila >= 0 && quedanPiezas) {
			if(estaCompletaFila(m,fila)){
				eliminarFila(fila);
			} else if(estaVaciaFila(m,fila)){
				quedanPiezas = false;
			} else {
				fila--;
			}
		}
	}
	public static boolean estaCompletaFila(int[][] m, int f){
		boolean enc = false;
		for (int j = 0; j < m[0].length && !enc; j++) {
			if(m[f][j] == 0) enc = true;
		}
		if(enc) return false;
		else return true;
	}
	public static boolean estaVaciaFila(int[][] m, int f){
		boolean enc = false;
		for (int j = 0; j < m[0].length && !enc; j++) {
			if(m[f][j] != 0) enc = true;
		}
		if(enc) return false;
		else return true;
	}
	public static boolean eliminarFila(int [][], int f){
		
	}
	public static void mostrar (int[][] m){
		char[] letras = {'#','@','&','%'};
		for (int i = 0; i < m.length; i++) {
			System.out.print("|");
			if(m[i][0] == 0) System.out.print(" ");
			else System.out.print(letras[m[i][0]-1]);
			for (int j = 1; j < m[0].length; j++) {
				if(m[i][j] == 0) System.out.print("  ");
				else System.out.print(" " + letras[m[i][j]-1]);
			}
			System.out.println("|");
		}
	}
	

}
