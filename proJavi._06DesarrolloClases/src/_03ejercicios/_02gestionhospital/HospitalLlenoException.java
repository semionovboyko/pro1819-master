package _03ejercicios._02gestionhospital;

@SuppressWarnings("serial")
public class HospitalLlenoException extends Exception{
	public HospitalLlenoException(){
		super();
	}
	public HospitalLlenoException(String msg){
		super(msg);
	}
}
