package _03ejercicios._02gestionhospital;

public class Hospital {
	
	public static final int MAXC = 10;
	private Paciente[] listaCamas ;
	private int numLibres;
	
	public Hospital(){
		//Creamos el array
		listaCamas = new Paciente[MAXC + 1];
		//Todas las habitaciones libres
		numLibres = MAXC;
	}
	public boolean hayLibres(){
		return numLibres > 0; 
//		if(numLibres > 0) return true;
//		else return false;
	}
	public int primeraLibre(){
		//if(numLibres > 0){
		if(hayLibres()){
			//Busqueda con garantia de exito
			//(No me preocupa salirme del array
			// porque no puede pasar)
			int i = 1;
			while(listaCamas[i] != null){
				i++;
			}
			return i;
		} else {
			return 0;
		}
	}
	public int primeraLibre2(){
		if(hayLibres()){
			boolean enc = false;
			int i = 1;
			while(i < listaCamas.length && !enc){
				if(listaCamas[i] == null) enc = true;
				else i++;
			}
			return i;
		} else return 0;
	}
	
	public void ingresarPaciente(String n, int e) throws HospitalLlenoException  {
		int numHabitacion = primeraLibre();
		if(numHabitacion == 0){
			//El hospital esta lleno
			throw new HospitalLlenoException("No quedan camas libres");
		} else {
			//Anyadimos al paciente en la habitacion
			Paciente p = new Paciente(n,e);
			listaCamas[numHabitacion] = p;
			//listaCamas[numHabitacion] = new Paciente(n,e);
			numLibres --;
		}
	}
	
	private void darAltaPaciente(int i){
		if(listaCamas[i] != null){
			listaCamas[i] = null;
			numLibres ++;
		}
	}
	
	public void darAltas(){
		for( int i = 1; i< listaCamas.length; i++){
			if(listaCamas[i] != null){
				listaCamas[i].mejorar();
				if(listaCamas[i].getEstado() == 6) {
					//Paciente curado --> Alta
					darAltaPaciente(i);
				}
			}
		}
	}
	
	public void darAltas2(){
		int numCama = 0;
		for(Paciente p: listaCamas){
			if(p != null){
				p.mejorar();
				if(p.getEstado() == 6) {
					//Paciente curado --> Alta
					darAltaPaciente(numCama);
				}
			}
			numCama++;
		}
	}
	
	public int getNumLibres(){
		return numLibres;
	}
	
	
	public String toString(){
		String res = "";
		for(int i = 1; i < listaCamas.length; i++){
			if(listaCamas[i] == null) {
				//Cama libre
				res += i + ": libre\n";
			}else {
				//Cama ocupada
				res += i + ": " + listaCamas[i] + "\n"; //.toString()
			}
		}
		return res;
	}
	
	

}
