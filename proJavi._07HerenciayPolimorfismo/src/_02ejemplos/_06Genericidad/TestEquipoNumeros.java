package _02ejemplos._06Genericidad;

public class TestEquipoNumeros {
	public static void main(String[] args) {
		EquipoDeNumeros<Integer> eqPares = new EquipoDeNumeros<>("pares");
		eqPares.anyadir(2);
		eqPares.anyadir(4);
		eqPares.anyadir(6);
		eqPares.anyadir(8);
		eqPares.anyadir(10);
		eqPares.setCapitan(10);
		
		System.out.println(eqPares);
		
		EquipoDeNumeros<Double> eqReales = new EquipoDeNumeros<>("reales");
		//...
		//...
		
		//Pero no puedo crear un EquipoDeNumeros de algo
		// que no herede de Number
		//EquipoDeNumeros<String> eqNombres = new EquipoDeNumeros<>("nombres");
		
	}
}
