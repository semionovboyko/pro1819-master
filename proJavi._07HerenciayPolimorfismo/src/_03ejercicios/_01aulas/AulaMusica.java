package _03ejercicios._01aulas;

public class AulaMusica extends Aula{
	private boolean piano;
	
	public AulaMusica(int c, double l, double a, boolean p){
		super(c,l,a);
		this.piano = p;
	}
	public boolean getPiano(){
		return piano;
	}
	public void setPiano(boolean p){
		piano = p;
	}
	public double capacidad(){
		//Supongamos que es la capcidad normal menos dos alumnos
		// si tien piano
		if(piano) return super.capacidad() - 2;
		else return super.capacidad();
		
	}
	@Override
	public String toString(){
		return "Aula de musica " + super.toString();
	}
}
