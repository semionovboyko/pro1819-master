package _03ejercicios._01gestionempleados;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa e1 = new Empresa("Dam 1 Tecnologies");
		System.out.println(e1);
		
		//Contratar
		e1.contratar(new Empleado("Manuel","11111111A",2000,2000));
		e1.contratar(new Empleado("Ramona","22222222B",2001,2000));
		e1.contratar(new Empleado("Miguel","33333333C",2002,2000));
		e1.contratar(new Empleado("Luisa","44444444D"  ,2003,2000));
		e1.contratar(new Empleado("Roberto","55555555E",2004,2000));
		e1.contratar(new Empleado("Ruben","66666666F"  ,2005,2000));
		e1.contratar(new Empleado("Pablo","77777777G"  ,2006,2000));
		System.out.println("================");
		System.out.println(e1);
		
		//Despedir a Pablo
		e1.despedir(new Empleado("","77777777G",0,0));
		System.out.println("================");
		System.out.println(e1);
		
		//Subir trienio
		e1.subirTrienio(10);
		System.out.println("================");
		System.out.println(e1);
	}
}
