package ejercicio2;
public abstract class Empleado {
	protected String nombre;
	protected int alta;
	protected double sbase;
	
	public Empleado(String n, int a, double s){
		nombre = n;
		alta = a;
		sbase = a;
	}
	
	public abstract double getSalarioBruto();
	
	public double getSalarioNeto(){
		double sBruto = getSalarioBruto();
		double sNeto;
		if(sBruto < 1000){
			sNeto = sBruto - sBruto * 10 / 100;
		} else if(sBruto < 1500){
			sNeto = sBruto - sBruto * 0.15;
		} else {
			sNeto = sBruto * 0.8;
		}
		return sNeto;
	}
	
	public String toString(){
		return "Nombre: " + nombre +
				"\nAlta: " + alta + 
				"\nSalario bruto: " + getSalarioBruto()+ " €" + 
				"\nSalario neto: " + getSalarioNeto()+ " €" ;
				
	}
}
