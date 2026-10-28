package _03ejercicios._01gestionempleados;

import java.util.Scanner;

public class TestEmpleado {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		Empleado e1 = leerEmpleado(tec);
		Empleado e2 = leerEmpleado(tec);

		System.out.println(e1);
		System.out.println("-----------------");
		System.out.println(e2);

		//Aumentar sueldo 20 % al que menos cobra
		if(e1.getSueldoBrutoAnual() < e2.getSueldoBrutoAnual()){
			e1.incrementarSueldo(20);
		} else if(e2.getSueldoBrutoAnual() < e1.getSueldoBrutoAnual()){
			e2.incrementarSueldo(20);
		}
		System.out.println("--Aumentar 20%---");
		System.out.println("-----------------");
		System.out.println(e1);
		System.out.println("-----------------");
		System.out.println(e2);
		
		//Aumentar sueldo 10 % al más antiguo
		if(e1.antiguedad() < e2.antiguedad()) {
			e2.incrementarSueldo(10);
		} else if(e2.antiguedad() < e1.antiguedad()){
			e1.incrementarSueldo(10);
		}
		System.out.println("--Aumentar 10%---");
		System.out.println("-----------------");
		System.out.println(e1);
		System.out.println("-----------------");
		System.out.println(e2);
		
		//Irpf que corresponde a cada empleado
		double irpf1 = Empleado.calcularIRPF(e1.getSueldoBrutoAnual());
		double irpf2 = Empleado.calcularIRPF(e2.getSueldoBrutoAnual());
		System.out.println(irpf1 + " %");
		System.out.println(irpf2 + " %");
		
		System.out.println(Empleado.calcularIRPF(2189));
		
	}

	private static Empleado leerEmpleado(Scanner tec) {
		System.out.println("Dni: ");
		String dni = tec.next(); tec.nextLine();
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Año ingreso:");
		int a = tec.nextInt();
		
		System.out.println("Sueldo: ");
		double s = tec.nextDouble();
		
		return new Empleado(nombre, dni, a, s);
	}
}
