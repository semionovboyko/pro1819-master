package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class _17Energia {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        
        double m;
        final double C = 2.997925E8; //Constante
        
        System.out.println("Introduce masa: ");
        m = tec.nextDouble();
        
        double e = m*C*C;
        System.out.println("Energía: " + e);


    }
}
