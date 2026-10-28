package ejercicio3;

public class DarFormacion {
    public static void main(String[] args) {
        Persona v[] = {
            new Desempleado(),
            new EstudianteCCFF(),
            new EstudianteCCFF(),
            new EstudianteCCFF(),
            new Desempleado(),
            new Desempleado(),
            new EstudianteCCFF(),
            new Desempleado(),
            new Desempleado(),
            new EstudianteCCFF()
        };
        darFormacion(v);
    }
    //Anyadir aqu� el m�todo darFormacion que se pide en el enunciado
    public static void darFormacion(Persona[] v){
    	for(int i = 0; i< v.length; i++){
    		((Formable)v[i]).formar(100);
    	}
    	
    }
}
