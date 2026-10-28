package ejercicio1;

import java.util.Scanner;

public class TestGaraje {
	/**
     * Pide matriculas y las registra. 0 para terminar.
     * @param args 
     */
    public static void main(String[] args) {
        Garaje g = new Garaje();
        g.cargarPermitidos();
        Scanner tec = new Scanner(System.in);
        String matricula;
        do {
            System.out.println("Introduce matricula: ");
            matricula = tec.next();
            g.registrarMatricula(matricula);
           
        } while(!matricula.equals("0"));
        System.out.println(g.toString());
    }

}
