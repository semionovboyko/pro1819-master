package ejercicio4;

public class AlumnoBecado extends AlumnoInterno{
	
	private double beca;
	
	public AlumnoBecado(String dni, String nombre, String deporte, int regimen, double beca){
		super(dni,nombre,deporte, regimen);
		this.beca = beca;
	}
	@Override 
	public String toString(){
		return "BECADO\n" + super.toString() + 
				"\nBeca: " + beca + " %";
	}
	public double calcularImporteAPagar(){
		double importe = super.calcularImporteAPagar();
		
		return importe - (importe * beca / 100);
		
	}

}
