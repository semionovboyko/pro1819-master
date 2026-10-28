package ifelse;

import java.util.Scanner;

public class _01Termostatov2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int tempIdeal = 25;
		
		System.out.println("Temperatura: ");
		int temp = tec.nextInt();
		System.out.println("Invierno o verano?: ");
		String iv = tec.next().toLowerCase();
		if (iv.equals("invierno")) {
			System.out.println("Dia o noche?: ");
			String dn = tec.next().toLowerCase();
			if(dn.equals("dia")) tempIdeal = 21;
			else tempIdeal = 17;
		}
		
		int difTemp = tempIdeal - temp;
		if(difTemp == 0) {
			System.out.println("Adecuada");
		} else if (difTemp < 0){
			System.out.format("Demasiado alta. Bajar %d. Ahorro %5.2f",
					-difTemp, -difTemp * 3);
		} else {
			System.out.format("Demasiado baja. Subir %d. Ahorro %5.2f",
					difTemp, difTemp * 3);
		}
	}

}
