package _03ejercicios._07hoteles;

public class OfertaHotel {
	private String nombre; //nombre del hotel. 
	private String ciudad; //ciudad en que esta
	private double precio;

	public OfertaHotel(String n, String c, double p){
		nombre = n;
		ciudad = c;
		precio = p;
	}
	//Dos ofertas son iguales si coincide el nombre
	//del hotel y la ciudad
	public boolean equals(Object o){
		if (this == o) return true;
		if (!(o instanceof OfertaHotel)) return false;
		OfertaHotel x =  (OfertaHotel) o;
		return this.nombre.equals(x.nombre) 
				&& this.ciudad.equals(x.ciudad);
	}
	
	public int hashCode(){
		return (nombre + " " + ciudad).hashCode();
		//return nombre.length() + ciudad.length();
	}
	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public double getPrecio() {
		return precio;
	}
	public String toString(){
		return nombre + " - " + ciudad + " - " + precio; 
	}
	
}
