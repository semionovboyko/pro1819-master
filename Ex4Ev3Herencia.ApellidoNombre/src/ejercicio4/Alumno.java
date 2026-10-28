package ejercicio4;

public abstract class Alumno {
	private String dni;
	private String nombre;
	private String deporte;
	public Alumno(String dni, String nombre, String deporte){
		this.dni = dni;
		this.nombre = nombre;
		this.deporte = deporte;
	}
	public String getDeporte(){
		return deporte;
	}
	public String getDni(){
		return dni;
	}
	
	@Override
	public String toString(){
		return  "Nombre: " + nombre +
				"\nDni: " + dni + 
				"\nDeporte: " + deporte;
	}
	
	public abstract double calcularImporteAPagar();
	
	public void mostrarRecibo(){
		System.out.println("NOMBRE : " + nombre);
		System.out.println("TOTAL A PAGAR " + calcularImporteAPagar());
	}
}
