package _02ejemplos;

public class _21LlamarMetodoExterno {
	public static void main(String[] args) {
		// Llamamos al metodo formatearFecha 
		// que está en otra clase: Antes de la llamada
		// ponemos el nombre de la clase
		
		String navidadFormateada = _20ModularFecha.formatearFecha(25,12,2018);
		System.out.println(navidadFormateada);
		
	}

}
