package ejercicio3;
public class EstudianteCCFF extends Estudiante implements Formable{
	@Override
	public void formar(int horas) {
		System.out.println("Estudiante CCFF recibe formación de " + horas + " horas");
		
	}
}
