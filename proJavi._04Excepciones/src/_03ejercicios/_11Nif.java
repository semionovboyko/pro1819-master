package _03ejercicios;

public class _11Nif {
	public static void main(String[] args) {
		System.out.println(validarNif("52725957K"));
		System.out.println(validarNif("52725957"));
		System.out.println(validarNif(" 52725957K  "));
		
		System.out.println(validarNif("K52725957"));
		System.out.println(validarNif("52725957 k"));
		System.out.println(validarNif("5"));
		System.out.println(validarNif(""));

	}
	public static boolean validarNif(String nif){
		try {
			final String LETRASNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
			//Quitamos posibles espacios en blanco y pasamos a mayuscula
			nif = nif.trim().toUpperCase();
			
			//Separamos la letra y el número
			char letra = nif.charAt(nif.length()-1); //Ultimo caracter 
			String sNumero = nif.substring(0, nif.length()-1); //Todo excepto ultimo
			
			//convertimos a numero
			int num = Integer.parseInt(sNumero); 
			
			//Comprobar si número y letra se corresponden
			int pos = num % 23;
			char letraCorrecta = LETRASNIF.charAt(pos);
			if(letraCorrecta == letra){
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException | StringIndexOutOfBoundsException e){
			// Se produce excepción cuando la primera parte no se 
			// puede convertir en número
			// o cuando el nif es la cadena vacía
			return false;
		}
	}
}
