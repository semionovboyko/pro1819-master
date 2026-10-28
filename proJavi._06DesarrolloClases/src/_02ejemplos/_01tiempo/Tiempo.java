package _02ejemplos._01tiempo;

public class Tiempo implements Comparable<Tiempo>{
	//Las clases, generalmente van a tener atributos (información)
	// y métodos para manipular dichos atributos.
	
	//Atributos: Se definen siempre privados. Esto tiene como consecuencia
	// que solo son accesibles (leibles/escribibles) desde la clase
	// en que están definidos
	private int hora;
	private int minuto;
	private int segundo;
	
	//Una constante 
	final static int SEGUNDOSPORMINUTO = 60;
	final static int SEGUNDOSPORHORA = 3600;
	
	//Métodos: Van a permitir manipular los objetos de la clase
	
	/* Método constructor: Es el método que se ejecutará para crear
	 	los objetos de la clase Tiempo
	 	Es un método que:
	 	- Tiene el mismo nombre que la clase
	 	- No devuelve nada (no tiene return), pero no se pone void
		
	*/
	/**
	 * Crea un objeto Tiempo con la hora, minuto y segundo especificados
	 * @param h la hora
	 * @param m el minuto
	 * @param s el segundo
	 */
	public Tiempo(int h, int m, int s){
//		this.hora = h;
//		this.minuto = m;
//		this.segundo = s;
		setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}
	
	/**
	 * Crea un objeto Tiempo con la hora y minuto. Los segundos seran 0
	 * 
	 * @param h la hora
	 * @param m el minuto
	 */
	public Tiempo(int h, int m){
//		this.hora = h;
//		this.minuto = m;
//		this.segundo = 0;
//		o bien
		this(h,m,0);
	}
	
	/*
	 * METODO toString
	 * Se utiliza para obtener una representación textual del objeto.
	 * En la clase Object tiene un comportamiento por defecto: 
	 * - Devuelve nombreClase@DireccionMemoria
	 * 
	 * Podemos REESCRIBIR EL METODO para darle otro comportamiento
	 * en esta clase
	 */
	public String toString(){
		//return hora + ":" + minuto + ":" + segundo;
		return String.format("%02d:%02d:%02d", hora,minuto,segundo);
	}
	
	/*
	 * METODOS CONSULTORES Y MODIFICADORES (Getter y Setter)
	 * Son métodos que diseñaremos para permitir la consulta y modificación
	 * de los atributos de la clase. 
	 * 
	 * Por convenio, se llaman getXXX y setXXX, donde XXX es el nombre
	 * del atributo consultado o modificado. Cuando el atributo consultado
	 * es de tipo boolean, el consultor se llama isXXX en lugar de getXXX
	 * 
	 * 
	 */
	//GETTER
	public int getHora(){
		return this.hora;
	}
	
	public int getMinuto(){
		return this.minuto;
	}
	
	public int getSegundo(){
		return this.segundo;
	}
	
	//SETTER
	public void setHora(int hora){
		if (hora < 0 || hora > 23) {
			throw new IllegalArgumentException("Tiene que estar en [0,23]");
		}
		this.hora = hora; //En este caso this es necesario para diferenciar 
		//entre el atributo (this.hora) y el parametro (hora)
	}
	public void setMinuto(int m){
		if(m < 0 || m > 59) {
			throw new IllegalArgumentException("Tiene que estar en [0,59]");
		}
		this.minuto = m;
	}
	public void setSegundo(int s){
		if(s < 0 || s > 59) {
			throw new IllegalArgumentException("Tiene que estar en [0,59]");
		}
		this.segundo = s;
	}
	
	public boolean equals(Object o){
		if(this == o){ 	//Estoy comparando el objeto consigo mismo
			return true; 
		} else if(!(o instanceof Tiempo)){ // o no es de la clase Tiempo
			return false;
		} else {
			Tiempo t = (Tiempo)o;
			if(this.hora == t.hora && this.minuto == t.minuto 
					&& this.segundo == t.segundo){
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	/**
	 * Compara el Tiempo actual (this) con otro que se recibe como parámetro
	 * 
	 * @param t el Tiempo con el que hay que comparar
	 * @return  <0 si this es anterior a t
	 * 			>0 si this es posterior a t
	 * 			0 si son iguales
	 */
	public int compareToVersion1(Tiempo t){
		if(this.hora < t.hora) return -1;
		else if(this.hora > t.hora) return 1;
		else if(this.minuto < t.minuto) return -1;
		else if(this.minuto > t.minuto) return 1;
		else if(this.segundo < t.segundo) return -1;
		else if(this.segundo > t.segundo) return +1;
		else return 0;
		
	}
	public int compareTo(Tiempo t){
		int segundosThis = this.hora * 60 * 60 + this.minuto * 60 + this.segundo;
		int segundosT = t.hora * 60 * 60 + t.minuto * 60 + t.segundo;
		
		return segundosThis - segundosT;
		
	}
	//***************************************************************
	//Otros métodos que consideremos que pueden ser necearios o útiles
	//***************************************************************
	
	/**
	 * Anyade al Tiempo actual la cantidad de segundos indicada
	 * @param segundos los segundos a anyadir
	 */
	public void anyadirSegundos (int segundos){
		int s = this.hora * 60 * 60 + this.minuto * 60 + this.segundo;
		s = s + segundos;
		this.hora = s / 3600;
		this.minuto = s % 3600 / 60;
		this.segundo = s % 3600 % 60;
	}
	
	/**
	 * Determina si un instante de tiempo es o no valido
	 * El instante es h:m:s
	 * @param h
	 * @param m
	 * @param s
	 * @return true si está entre las 00:00:00 y las 23:59:59
	 */
	public static boolean esValido(int h, int m, int s){
		if(h >= 0 && h < 24 &&
				m >= 0 && m < 60 &&
				s >= 0 && s < 60){
			return true;
		} else {
			return false;
		}
	}
	
	//Version no estatica del mismo metodo
	public boolean esValido(){
		if(hora >= 0 && hora < 24 &&
				minuto >= 0 && minuto < 60 &&
				segundo >= 0 && segundo < 60){
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Devuelve un objeto Tiempo equivalente a 
	 * la cantidad de segundos especificada
	 * @param s los segundos
	 * @return el Tiempo
	 */
	public static Tiempo segundosToTiempo(int s){
		int h = s / 3600;
		int m = s % 3600 / 60;
		s = s % 3600 % 60;
		
		return new Tiempo (h,m,s);
	}

	public int pasarASegundos() {
		return hora * 3600 + minuto * 60 + segundo;
	}
}




