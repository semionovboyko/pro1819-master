package _02ejemplos._03atributosDeClase;

public class X {
	
	private int atributo1;
	private static int atributo2;
	
	public void setAtributo1(int valor){
		this.atributo1 = valor;
	}
	
	public void setAtributo2 (int valor){
		this.atributo2 = valor;
	}
	
	public String toString(){
		return "Atributo 1: " + atributo1 + "- Atributo 2: " + atributo2 ;  
	}
}
