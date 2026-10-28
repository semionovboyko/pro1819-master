package bucles;

public class _06TresCarasSeguidas {
	public static void main(String[] args) {
		final int N = 10000;
		
		//En N lanzamientos de una moneda al aire, contar cuántas veces
		// salen 3 caras seguidas
		int caras = 0;
		int tresSeguidas = 0;
		for(int cont = 0; cont < N; cont++){
			double moneda = Math.random();
			if(moneda < 0.5) {
				caras++;
				if(caras == 3) {
					tresSeguidas ++;
					caras = 0;
				} 
			} else {
				caras = 0;
			}
			
		}
		System.out.println(tresSeguidas);
	}
}
