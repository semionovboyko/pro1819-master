package ejercicio3;
public class Desempleado extends Trabajador implements Formable{

	@Override
	public void formar(int horas) {
		System.out.println("Desempleado recibe formación de " + horas + " horas");
		
	}
}
