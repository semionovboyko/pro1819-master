package _02ejemplos._06Genericidad;

//Representa un par de elementos de cualquier tipo en el
//que el primero actua como responsable y el segundo
//como subordinado

public class Pareja <J,S>{
	private J jefe;
	private S subordinado;
	
	public Pareja(J j, S s){
		this.jefe = j;
		this.subordinado = s;
	}
	public String toString (){
		return String.format("%s - (%s) ", jefe.toString().toUpperCase()
				,subordinado.toString());
	}

}
