package ejercicio1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Ejercicio1 {
	public static void mostrarDiferencias(Map<String,Integer> resultados16, Map<String,Integer> resultados19){
		Set<String> partidos19 = resultados19.keySet();
		
		for(String p: partidos19){
			Integer resultado16 = resultados16.get(p);
			Integer resultado19 = resultados19.get(p);
			
			if(resultado16 == null) System.out.println("Emergente");
			else if(resultado16 == resultado19) 
				System.out.println("Mantiene");
			else if(resultado19 > resultado16) 
				System.out.println("sube " + (resultado19 - resultado16));
			else System.out.println("baja " + (resultado16 - resultado19));
		}
		
	}
	
	public static void main(String[] args) {
		//@EndPrint
		String[] _16Nom = {"PP","PSOE","UNIDOS PODEMOS","CS","ERC-CATSI","CDC","PNV","EH Bildu","CCa-PNC"};
		int[] _16Esc = {137,85,71,32,9,8,5,2,1};
		
		String[] _19Nom = {"PSOE","PP","CS","UNIDOS PODEMOS","VOX","ERC-SOBIRANISTES","JxCAT-JUNTS","PNV","EH Bildu","CCa-PNC","NA+","COMPROMIS","PRC"};
		int[] _19Esc = {123,66,57,42,24,15,7,6,4,2,2,1,1};
		
		Map<String,Integer> resultados16 = new LinkedHashMap<>();
		Map<String,Integer> resultados19 = new LinkedHashMap<>();
		
		for (int i = 0; i < _16Esc.length; i++) {
			resultados16.put(_16Nom[i], _16Esc[i]);
		}
		for (int i = 0; i < _19Esc.length; i++) {
			resultados19.put(_19Nom[i], _19Esc[i]);
		}
		
		mostrarDiferencias(resultados16,resultados19);
	}
}
