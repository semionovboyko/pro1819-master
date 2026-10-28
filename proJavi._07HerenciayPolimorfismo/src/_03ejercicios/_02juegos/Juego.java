package _03ejercicios._02juegos;

public class Juego implements Comparable<Juego>{
	protected String titulo;
	protected String fabricante;
	protected int anyo;
	
	public Juego(String titulo, String fabricante, int anyo) {
		this.titulo = titulo;
		this.fabricante = fabricante;
		this.anyo = anyo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if(!(o instanceof Juego)) return false;
		Juego j = (Juego)o;
		return this.titulo.equals(j.titulo) &&
				this.fabricante.equals(j.fabricante) &&
				this.anyo == j.anyo;
	}

	@Override
	public int compareTo(Juego j) {
		if(this.titulo.compareTo(j.titulo) < 0){
			return -1;
		} else if(this.titulo.compareTo(j.titulo) > 0){
			return 1;
		} else 	if(this.fabricante.compareTo(j.fabricante)<0){
			return -1;
		} else  if(this.fabricante.compareTo(j.fabricante)>0){
			return 1;
		} else return this.anyo - j.anyo;
	}
	
	
	

}
