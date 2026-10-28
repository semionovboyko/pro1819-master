package _02ejemplos;

public class _13While {
	public static void main(String[] args) throws InterruptedException {
		//Mostrar los múltiplos de 5 menores que 1000
		
		int multiplo = 5;
		while(multiplo < 1000) {
			System.out.format("%d es multiplo de 5%n",multiplo);
			multiplo = multiplo + 5;
			Thread.sleep(100);
		}
	}

}
