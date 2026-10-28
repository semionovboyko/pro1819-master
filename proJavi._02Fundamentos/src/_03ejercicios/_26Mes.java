package _03ejercicios;

public class _26Mes {
	public static void main(String[] args) {

	}

	public static int diasDe (int mes) {
		int dias;
		if(mes == 1){
			dias = 31;
		} else if(mes == 2){
			dias = 28;
		} else if(mes == 3){
			dias = 31;
		} else if(mes == 4){
			dias = 30;
		} else if(mes == 5){
			dias = 31;
		} else if(mes == 6){
			dias = 30;
		} else if(mes == 7){
			dias = 31;
		} else if(mes == 8){
			dias = 31;
		} else if(mes == 9){
			dias = 30;
		} else if(mes == 10){
			dias = 31;
		} else if(mes == 11){
			dias = 30;
		} else {
			dias = 31;
		}
		return dias;
	}
	public static int diasDe (String mes) {
		int dias;
		if(mes.equalsIgnoreCase("enero")){
			dias = 31;
		} else if(mes.toLowerCase().equals("febrero")){
			dias = 28;
		} else if(mes.toLowerCase().equals("marzo")){
			dias = 31;
		} else if(mes.toLowerCase().equals("abril")){
			dias = 30;
		} else if(mes.toLowerCase().equals("mayo")){
			dias = 31;
		} else if(mes.toLowerCase().equals("junio")){
			dias = 30;
		} else if(mes.toLowerCase().equals("julio")){
			dias = 31;
		} else if(mes.toLowerCase().equals("agosto")){
			dias = 31;
		} else if(mes.toLowerCase().equals("septiembre")){
			dias = 30;
		} else if(mes.toLowerCase().equals("octubre")){
			dias = 31;
		} else if(mes.toLowerCase().equals("noviembre")){
			dias = 30;
		} else {
			dias = 31;
		}
		return dias;
	}
}
