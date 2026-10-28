package ejercicio4;

public class AlumnoInterno  extends Alumno{
	public final static int SA = 0;
	public final static int MP = 1;
	public final static int PC = 2;
	
	private int regimen;
	
	public AlumnoInterno(String dni, String nombre, String deporte, int regimen){
		super(dni,nombre,deporte);
		this.regimen = regimen;
	}
	@Override
	public String toString(){
		String textoRegimen = "";
		switch(regimen){
			case SA: textoRegimen = "Solo alojamiento";
				break;
			case MP: textoRegimen = "Media ";
				break;
			case PC: textoRegimen = "Completa";
				break;
		}
		
		return "INTERNO\n" + super.toString() + 
				"\nPension: " + textoRegimen;
	}
	
	public String toString2(){
		String[] textoRegimen = {"Solo alojamiento", "Media", "Completa"};
		
		return "INTERNO\n" + super.toString() + 
				"\nPension: " + textoRegimen[regimen];
	}
	
	public double calcularImporteAPagar(){
		double importe = 0;
		switch(regimen){
		case SA: importe = 300;
			break;
		case MP: importe = 500;
			break;
		case PC: importe = 800;
			break;
		}
		return importe;
	}

}
