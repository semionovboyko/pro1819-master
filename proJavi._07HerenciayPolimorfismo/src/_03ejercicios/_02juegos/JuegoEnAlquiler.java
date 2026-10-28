package _03ejercicios._02juegos;

public class JuegoEnAlquiler extends JuegoParaLlevar{
	
	private int dias;
	
	public JuegoEnAlquiler(String t, String f, int a, double p, int c, int d){
		super (t,f,a);
		this.precio = p;
		this.copias = c;
		this.dias = d;
	}

	public int getDias() {
		return dias;
	}
	
}
