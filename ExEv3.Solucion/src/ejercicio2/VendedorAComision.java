package ejercicio2;
public class VendedorAComision extends Vendedor{
	
	private double pComision;
	
	public VendedorAComision(String n, int a, double v, double pc){
		super(n,a,1000,v);
		pComision = pc;
	}
	
	@Override
	public double getSalarioBruto(){
		return super.getSalarioBruto() + (ventas * pComision / 100);
	}
	
	@Override
	public String toString(){
		return super.toString() + 
				"\nPorcentaje de comision: " + pComision + " %";
	}
}
