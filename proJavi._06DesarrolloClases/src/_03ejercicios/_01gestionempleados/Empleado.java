package _03ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado {
	private String nombre;
	private String dni;
	private int anyoDeIngreso;
	private double sueldoBrutoAnual;
	
	//constructor
	public Empleado(String n, String d, int a, double s){
		this.nombre = n;
		this.dni = d;
		this.anyoDeIngreso = a;
		this.sueldoBrutoAnual = s;
	}
	//Getter
	public String getNombre(){
		return nombre;
	}
	public String getDni(){
		return dni;
	}
	public int getAnyoIngreso(){
		return anyoDeIngreso;
	}
	public double getSueldoBrutoAnual(){
		return sueldoBrutoAnual;
	}
	
	//Setter
	public void setNombre(String n){
		nombre = n;
	}
	public void setDni(String d){
		dni = d;
	}
	public void setAnyoIngreso(int a){
		if(a < 0) throw new IllegalArgumentException("El año ha de ser positivo");
		//else 
		anyoDeIngreso = a;
	}
	public void setSueldoBrutoAnual(double s){
		if(s < 0) throw new IllegalArgumentException("El sueldo ha de ser positivo");
		sueldoBrutoAnual = s;
	}
	//toStrig
	public String toString(){
		return String.format("Nombre: %s%n"
				+ "Dni: %s%n"
				+ "Año ingreso: %d%n"
				+ "Sueldo bruto: %.2f €%n", nombre, dni,anyoDeIngreso,
				sueldoBrutoAnual);
				
	}
	
	public int antiguedad(){
//		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
//		int ant = anyoActual - anyoDeIngreso;
//		if(ant < 0) return 0;
//		else return ant;
		
		return Math.max(0, 
				Calendar.getInstance().get(Calendar.YEAR) - anyoDeIngreso);
	}
	public void incrementarSueldo(double porcentaje){
		sueldoBrutoAnual = sueldoBrutoAnual + (sueldoBrutoAnual * porcentaje / 100);
//v2    sueldoBrutoAnual += sueldoBrutoAnual * porcentaje / 100;
//v3	sueldoBrutoAnual *= 1 + (porcentaje / 100);
	}
	
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Empleado)) return false;
		
		if(this.dni.equals(((Empleado)o).dni)) return true;
		else return false;
		
	}
	
	public int compareTo(Empleado e){
//		if(this.dni.compareTo(e.dni) < 0) return -1;
//		else if(this.dni.compareTo(e.dni) > 0) return 1;
//		else return 0;
		return this.dni.compareTo(e.dni);
	}
	
	public static double calcularIRPF(double salario){
		double irpf;
		if(salario < 800) irpf = 3;
		else if(salario < 1000) irpf = 10;
		else if(salario < 1500) irpf = 15;
		else if(salario < 2100) irpf = 20;
		else  irpf = 30;
		return irpf;
	}
}















