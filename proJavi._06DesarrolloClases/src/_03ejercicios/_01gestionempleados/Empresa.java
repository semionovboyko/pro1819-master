package _03ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> plantilla;
	
	//Constructor
	public Empresa (String nombre){
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	//Numero de empleados
	public int getNumeroEmpleados(){
		return this.plantilla.size();
	}
	
	//Getter y setter
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	//Contratar 
	public void contratar(Empleado e){
		this.plantilla.add(e);
	}
	
	//Despedir
	public void despedir(Empleado e){
		boolean encontrado;
		encontrado = this.plantilla.remove(e);
		if(!encontrado){
			throw new NoSuchElementException("El empleado no esta en plantilla");
		}
	}
	public void despedir2(Empleado e){
		if(this.plantilla.contains(e)){
			this.plantilla.remove(e);
		} else {
			throw new NoSuchElementException("El empleado no esta en plantilla");
		}
	}
	
	public String toString(){
		String res = "Empresa: "  + nombre;
		if(plantilla.size() == 0){
			res += "\n--- SIN EMPLEADOS --- ";
		} else {
			res += "\n---- Plantilla ----";
			for(Empleado e: this.plantilla){
				res += "\n" + e.toString();
			}
		}
		return res;
	}
	public void subirTrienio(double porcentaje){
		for(Empleado e: this.plantilla) {
			if(e.antiguedad() % 3 == 0) {
				e.incrementarSueldo(porcentaje);
			}
		}
	}
}






