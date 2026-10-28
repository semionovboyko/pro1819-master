package _03ejercicios;

public class _05Mes {
	public static void main(String[] args) {

	}

	public static int diasDe(int mes) {
		int dias;
		switch (mes) {
		case 2:
			dias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;	
		default:
			dias = 31;
		}

		return dias;
	}

	public static int diasDe(String mes) {
		int dias = 0;
		switch (mes) {
		case "enero":
			dias = 31;
			break;
		case "febrero":
			dias = 28;
			break;
		case "marzo":
			dias = 31;
			break;
		case "abril":
			dias = 30;
			break;
		case "mayo":
			dias = 31;
			break;
		case "junio":
			dias = 30;
			break;
		case "julio":
			dias = 31;
			break;
		case "agosto":
			dias = 31;
			break;
		case "septiembre":
			dias = 30;
			break;
		case "octubre":
			dias = 31;
			break;
		case "noviembre":
			dias = 30;
			break;
		case "diciembre":
			dias = 31;
		}
		return dias;
	}
}
