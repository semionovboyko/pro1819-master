package ejercicio4;

public class AlumnoExterno extends Alumno{
	private double mensualidad;
	
	public AlumnoExterno(String dni, String nombre, String deporte, double mensualidad){
		super(dni,nombre,deporte);
		this.mensualidad = mensualidad;
	}

	@Override
	public String toString(){
		return "EXTERNO\n" + super.toString();
	}
	
	public double calcularImporteAPagar(){
		return mensualidad;
	}
}
