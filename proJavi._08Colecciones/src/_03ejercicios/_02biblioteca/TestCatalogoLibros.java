package _03ejercicios._02biblioteca;

import java.util.Scanner;

public class TestCatalogoLibros {
	public static void main(String[] args) {
		
		Libro[] libros = {
				new Libro("titulo1", "autor1", "est1"),
				new Libro("titulo2", "autor2", "est2"),
				new Libro("titulo3", "autor3", "est3"),
				new Libro("titulo4", "autor4", "est4"),
				new Libro("titulo5", "autor5", "est5")
		};
		
		CatalogoLibros c = new CatalogoLibros(libros);
		Scanner tec = new Scanner(System.in);
		String titulo;
		do{
			System.out.println("Introduce titulo: ");
			titulo = tec.nextLine();
			if(!titulo.isEmpty()){
				boolean esta = c.buscarLibro(titulo);
				if(esta){
					System.out.println("Está en el catalogo");
				} else {
					System.out.println("Libro no encontrado");
				}
			}
		} while(!titulo.isEmpty());
	}
}
