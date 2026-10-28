package _03ejercicios;

public class _27Strings {
	public static void main(String[] args) {
		System.out.println(veces("amapola",'a'));
		System.out.println(veces("amapola",'u'));
		
		repetir("Hoy es lunes", 4);
	}
	
	/**
	 * Cuenta las veces que cierto carácter aparece en un String
	 * @param texto el String en el que hay que buscar
	 * @param letra el caracter que hay que buscar
	 * @return el número de veces que aparece
	 */
	public static int veces (String texto, char letra){
		int cont = 0;
		int pos = 0;
		
		while(pos < texto.length()){
			if(texto.charAt(pos) == letra) {
				cont = cont + 1;
			}
			pos = pos + 1;
		}
		return cont;
	}
	/**
	 * Imprime en pantalla un texto un número determinado de veces
	 * @param texto el texto a repetir
	 * @param veces el numero de veces que hay que  repetir 
	 */
	public static void repetir(String texto, int veces){
		int cont = 0;
		while (cont < veces) {
			System.out.println(texto);
			
			cont = cont + 1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
