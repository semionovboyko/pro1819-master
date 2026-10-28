package ejercicio5;
public class Libro {
    private int  anyo;
    private String editorial;
    private String titulo;
    
    public Libro(String t, String e, int a){
        titulo = t;
        editorial = e;
        anyo = a;
    }
    @Override
    public String toString(){
        return titulo + " - " + editorial + " - " +anyo;
    }
}
