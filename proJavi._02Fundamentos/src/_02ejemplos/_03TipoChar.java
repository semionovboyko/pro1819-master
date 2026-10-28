package _02ejemplos;

public class _03TipoChar {
	public static void main(String[] args) {
		//Declaración e inicialización
		char inicialNombre = 'J';
		
		//Declaración y asignación
		char letraNif ;
		letraNif = 'K';
		
		
		//Conversión char <--> int
		char letra = 'M';
		int codigo = (int) letra;
		
		System.out.format("El codigo de la letra %c es %d%n", letra,codigo);
		System.out.format("El codigo de la letra %c es %d%n", 'ñ',(int)'ñ');
		System.out.format("El codigo de la letra %c es %d%n", '€',(int)'€');
		
		//Al revés tb funciona
		System.out.format("El codigo %d corresponde al caracter %c%n"
				, 65, (char) 65);
		
		//Se puede hacer operaciones "aritmeticas" con caracteres
		
		int diferencia = 'C' - 'A';
		System.out.println("Diferencia: " + diferencia);
		
		System.out.println("Numero de letras: "  + ('Z' - 'A' + 1));
		
		
		
		// Secuencias de escape
		System.out.println("primera linea\nsegunda linea\ntercera linea");
		
		System.out.println("El dijo \"hola\"");
		
		System.out.println("Carpeta: c:\nueva carpeta\news");
		System.out.println("Carpeta: c:\\nueva carpeta\\news");
		
		
		
		
		
		
		
		
	}
}
