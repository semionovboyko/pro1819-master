package ejercicio2;
public class Vendedor extends Empleado{
	
	protected double ventas;
	
	public Vendedor(String n, int a, double s, double v){
		super(n,a,s);
		ventas = v;
	}

	@Override
	public double getSalarioBruto() {
		if(ventas > 6000){
			return sbase + 100;
		} else {
			return sbase;
		}
	}
	
	@Override
	public String toString(){
		return "Vendedor\n" + super.toString() + 
				"\nVentas: " + ventas + " €";
	}
}
