package bucles;

public class _05CaraOCruz {
	public static void main(String[] args) {
		
		int lanzamientos = 0;
		int cara = 0;
		int cruz = 0;
		double porcentajeCara;
		double porcentajeCruz;
		double diferencia;
		
		do{
			double moneda = Math.random();
			lanzamientos ++;

			if (moneda < 0.5) cara++;
			else cruz++;
			
			porcentajeCara = 100.0 * cara / lanzamientos; 
			porcentajeCruz = 100.0 * cruz/ lanzamientos;
			diferencia = Math.abs(porcentajeCara-porcentajeCruz); 
			
			System.out.format("Caras %d - %9.6f%% Cruces %d %9.6f%% %n ", cara, porcentajeCara, cruz, porcentajeCruz);
		}while(lanzamientos < 1000 || diferencia >= 0.000001);
			
		System.out.println("Lanzamientos: " + lanzamientos);
		System.out.println("caras " + cara);
		System.out.println("cruces " + cruz);
		System.out.println("% caras " + porcentajeCara);
		System.out.println("% cruz " + porcentajeCruz);
	}

}
