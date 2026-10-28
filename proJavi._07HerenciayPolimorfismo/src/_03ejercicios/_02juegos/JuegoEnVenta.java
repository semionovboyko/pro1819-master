package _03ejercicios._02juegos;

public class JuegoEnVenta extends JuegoParaLlevar{
	public JuegoEnVenta(String t, String f, int a, double p, int c){
		super (t,f,a);
		this.precio = p;
		this.copias = c;
	}
	
}
