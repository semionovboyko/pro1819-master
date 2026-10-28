package _03ejercicios._02gestionhospital;

public class TestPaciente {
	public static void main(String[] args) {
		Paciente p1 = new Paciente ("Juan",20);
		Paciente p2 = new Paciente ("Miguel",30);
		System.out.println(p1);
		System.out.println(p2);
		
		//Mostrar el menor
		if(p1.compareTo(p2) < 0){
			System.out.println("El menor es " + p1);
		} else if(p1.compareTo(p2)>0) {
			System.out.println("El menor es " + p2);
		} else {
			System.out.println("Se consideran iguales");
		}
		
		//Mejorar al más grave hasta igualar las gravedades: Solo ejecutará
		//uno de los siguientes bucles
		while (p1.getEstado() < p2.getEstado()){
			p1.mejorar();
			System.out.println(p1);
			System.out.println(p2);
		}
		while (p2.getEstado() < p1.getEstado()){
			p2.mejorar();
			System.out.println(p1);
			System.out.println(p2);
		}
	}

}
