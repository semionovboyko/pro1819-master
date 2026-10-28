package _03ejercicios._02gestionhospital;

public class Paciente implements Comparable<Paciente> {
	private String nombre;
	private int edad;
	private int estado;
	
	public Paciente(String n, int e){
		this.nombre = n;
		this.edad = e;
		this.estado = (int)(Math.random() * 5 + 1);
	}
	
	public int getEdad(){
		return edad;
	}
	public int getEstado(){
		return estado;
	}
	public void mejorar(){
		if (estado <= 5)
			this.estado ++;
	}
	public void empeorar(){
		if (estado >= 1)
			this.estado --;
	}
	public String toString(){
		return nombre + " " + edad + " " + estado;
		//return String.format("%s %d %d", nombre,edad,estado);
	}
	public int compareTo(Paciente p){
		//Si this esta mas leve que p, devolver negativo
		if(this.estado > p.estado) return -1;
		//Si this esta menos leve que p, devolver positivo
		else if(this.estado < p.estado) return 1;
		//Si estan igual de leves/graves comparamos por edad
		else if(this.edad < p.edad) return -1;
		else if(this.edad > p.edad) return 1;
		else return 0;
	}
	public int compareToV2(Paciente p){
		if(this.estado == p.estado) return this.edad - p.edad;
		else return p.estado - this.estado;
	}
}
