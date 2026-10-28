package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _07Censura {
	public static void main(String[] args) {
		aplicaCensura("censura.txt","textoOriginal.txt","textoCensurado.txt");
		
	}
	public static void aplicaCensura(String fichCensura, String fichEntrada, String fichSalida){
		HashMap<String,String> censura = new HashMap<>();
		try(Scanner fe = new Scanner(new File(fichEntrada));
			PrintWriter fs = new PrintWriter(fichSalida)){
			leerFicheroCensura(fichCensura,censura);
			while (fe.hasNextLine()){
				String linea = fe.nextLine();
				String lineaSustituta = "";
				StringTokenizer st = new StringTokenizer(linea," ,;.",true);
				while(st.hasMoreTokens()){
					String original = st.nextToken();
					
					//Comprobamos si esta prohibida
					String sustituta = censura.get(original);
					if(sustituta == null) lineaSustituta += original;
					else lineaSustituta += sustituta;
				}

				fs.println(lineaSustituta);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir fichero");
		}
	}
	
	public static void leerFicheroCensura(String fichCensura, HashMap<String, String> c) 
			throws FileNotFoundException{
		try(Scanner f = new Scanner(new File(fichCensura))){
			while(f.hasNext()){
				String prohibida = f.next();
				String sustituta = f.next();
				c.put(prohibida, sustituta);
			}
		}
	}
}
