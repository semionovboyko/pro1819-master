package _02ejemplos._05interfaceComparable;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	
	public Vehiculo(String matricula, String marca, String modelo){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		
	}
	
	@Override
	public String toString(){
		return matricula + " - " + marca + " - " + modelo;
	}
	
	@Override
	public boolean equals(Object o){
		return this == o || 
				o instanceof Vehiculo 
				&& this.matricula.equals(((Vehiculo)o).matricula);
	}
	
	
	public int compareTo(Vehiculo v){
		return this.matricula.compareTo(v.matricula);
	}
	
}
