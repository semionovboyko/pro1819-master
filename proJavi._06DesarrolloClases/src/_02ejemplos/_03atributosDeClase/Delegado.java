package _02ejemplos._03atributosDeClase;

//Vamos a usar un atributo static
//para crear una clase de la que solo se pueda crear 
//un objeto
public class Delegado {
	private String nombre;
	private static boolean yaExiste = false;
	
	public Delegado(String nombre){
		if(yaExiste){
			throw new IllegalStateException();
		} else {
			this.nombre = nombre;
			yaExiste = true;
		}
	}
}
