package _03ejercicios;

public class _18EsSimetrica {
	public static void main(String[] args) {
		
	}
	public static boolean esSimetrica1(int[][] m){
		if(m.length != m[0].length) return false;
		else {
			boolean enc = false;
			for (int i = 0; i < m.length && !enc ; i++) {
				for (int j = 0; j < m[i].length && !enc; j++) {
					if(m[i][j] != m[j][i]) enc = true;
				}
			}
			//return !enc;
			if(enc) return false;
			else return true;
		}
	}
	public static boolean esSimetrica2(int[][] m){
		if(m.length != m[0].length) return false;
		else {
			boolean enc = false;
			for (int i = 0; i < m.length - 1 && !enc ; i++) {
				for (int j = i + 1; j < m[i].length && !enc; j++) {
					if(m[i][j] != m[j][i])	enc = true;
				}
			}
			if(enc) return false;
			else return true;
		}
	}
	
}
