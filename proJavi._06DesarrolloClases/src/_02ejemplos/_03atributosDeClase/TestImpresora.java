package _02ejemplos._03atributosDeClase;

public class TestImpresora {
	public static void main(String[] args) {
		Impresora i1 = new Impresora("hp 100");
		Impresora i2 = new Impresora("Canon 300");
		Impresora i3 = new Impresora("hp 100 hlc+");
		Impresora i4 = new Impresora("Fujitsu m40");
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
	}
}
