package _02ejemplos._03atributosDeClase;

public class Impresora {
	private int codigo; 
	private String nombre;
	private static int ultimoCodigo = 0;
	
	/**
	 * Constructor. Crea la impresora con el nombre indicado.
	 * El codigo se asigna automáticamente
	 * @param nombre
	 */
	public Impresora(String nombre){
		this.nombre = nombre;
		this.codigo =  ultimoCodigo + 1;
		ultimoCodigo ++;
	}
	
	public String toString(){
		return codigo + " - " + nombre;
	}
	
	

}
