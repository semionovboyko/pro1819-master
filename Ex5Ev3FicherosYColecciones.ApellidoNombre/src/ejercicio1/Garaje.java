package ejercicio1;


import java.util.*;
import java.io.*;

public class Garaje {
	private HashSet<String> permitidas;
	private HashMap<String,Long> dentro;
    
    public Garaje(){
    	permitidas = new HashSet<>();
    	dentro = new HashMap<>();
    }
    
    public void cargarPermitidos(){
    	try(Scanner f = new Scanner(new File("permitidos.txt"))){
    		while(f.hasNextLine()){
    			String mat = f.nextLine();
    			permitidas.add(mat);
    		}
    	} catch (FileNotFoundException e){
    		System.out.println("El fichero no existe o no se puede abrir");
    	}
    	
    }
    
    public void registrarMatricula(String matricula){
    	//Comprobamos si es una matrícula permitida
    	if(!permitidas.contains(matricula)){
    		System.out.println("Matrícula " + matricula + " no permitida");
    	} else {
    		//Comprobamos si es entrada o salida
    		Long instanteEntrada = dentro.get(matricula);
    		if(instanteEntrada == null){
    			//Entrada
    			long instante = System.currentTimeMillis();
    			System.out.format("Entrada del vehiculo %s en el instante %d%n",
    					matricula,instante);
    			dentro.put(matricula, instante);
    		} else {
    			//Salida
    			long instante = System.currentTimeMillis();
    			System.out.format("Entrada del vehiculo %s en el instante %d%n",
    					matricula,instante);
    			System.out.format("Tiempo dentro %d%n", (instante - instanteEntrada));
    			dentro.remove(matricula);
    		}
    	}
    }
    
    public String toString(){
    	String res = "--- Contenido del garaje ---\n";
    	Set<String> matriculasDentro = dentro.keySet();
    	
    	for(String matricula: matriculasDentro){
    		Long instante = dentro.get(matricula);
    		res += String.format("Matricula: %s, Instante entrada: %d%n",
    				matricula,instante);
    	}
    	return res;
    }
  }





