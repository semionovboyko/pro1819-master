package _02ejemplos;

public class _10TiemposRobusto {
	/* Entradas con las que el programa produce excepcion:
	  	10.20.30
	  	10:20.30
	  	10:20:aa
	 */
	public static void main(String[] args) {
		try{
			System.out.println(calcularSegundosTranscurridos("10  20 30"));
		} catch (NumberFormatException | StringIndexOutOfBoundsException e) {
			System.out.println("El instante indicado es incorrecto");
		}
	}
	
	public static int calcularSegundosTranscurridos (String instante) 
			throws NumberFormatException, StringIndexOutOfBoundsException{
		 int h = extraerHora(instante);
		 int m = extraerMinuto(instante);
		 int s = extraerSegundo(instante);
		 
		 int transcurrido = h * 3600 + m * 60 + s;
		 return transcurrido;
	}
	public static int extraerHora (String instante) 
			throws NumberFormatException, StringIndexOutOfBoundsException {
		int posDosPuntos = instante.indexOf(":");
		String sHora = instante.substring(0, posDosPuntos);
		int hora = Integer.valueOf(sHora);
		return hora;
	}
	public static int extraerMinuto(String instante)
		throws NumberFormatException, StringIndexOutOfBoundsException {
		int posDosPuntos1 = instante.indexOf(":");
		int posDosPuntos2 = instante.lastIndexOf(":");
		String sMin = instante.substring(posDosPuntos1 + 1, posDosPuntos2);
		int min = Integer.valueOf(sMin);
		return min;
	}

	public static int extraerSegundo(String instante)
			throws NumberFormatException, StringIndexOutOfBoundsException {

		int posDosPuntos2 = instante.lastIndexOf(":");
		String sSeg = instante.substring(posDosPuntos2 + 1);
		int seg = Integer.valueOf(sSeg);
		return seg;
	}
	
	
	
}
