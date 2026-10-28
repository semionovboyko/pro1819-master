package _05ejgenericidad._02colaprioridad2;

public class UrgenciaMedica implements Priorizable{
	private String descripcion;
	private int gravedad;
	public UrgenciaMedica(String d, int g){
		this.descripcion = d;
		this.gravedad = g;
	}
	public String toString(){
		return descripcion;
	}
	@Override
	public int getPrioridad() {
		return gravedad ;
	}
	
}
