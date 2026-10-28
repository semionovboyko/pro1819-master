package ejercicio2;
public class Peon extends Empleado{
	private int horas;
	
	public Peon(String n, int a, double s, int h){
		super(n,a,s);
		horas = h;
	}

	@Override
	public double getSalarioBruto() {
		return (sbase / 40) * horas; 
	}
	
	@Override
	public String toString(){
		return "Peon\n" + super.toString() + 
				"\nHoras semanales: " + horas;
	}
	
}
