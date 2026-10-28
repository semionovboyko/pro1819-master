package _03ejercicios._07hoteles;

import java.util.Map;
import java.util.TreeMap;

public class MejorOferta {
	public static void main(String[] args) {
		OfertaHotel[] ofertas = { new OfertaHotel("NH", "VALENCIA", 80), new OfertaHotel("GRAN VIA", "MADRID", 200),
				new OfertaHotel("TIBIDABO", "BARCELONA", 210), new OfertaHotel("NH", "VALENCIA", 90),
				new OfertaHotel("GRAN VIA", "MADRID", 220), new OfertaHotel("TIBIDABO", "BARCELONA", 180),
				new OfertaHotel("NH", "VALENCIA", 85), new OfertaHotel("GRAN VIA", "MADRID", 150),
				new OfertaHotel("TIBIDABO", "BARCELONA", 300)

		};

		Map<OfertaHotel, Double> mejorOferta = new TreeMap<>();
		for (int i = 0; i < ofertas.length; i++) {
			//Buscamos el mejor precio con que habia
			// aparecedo el hotel
			Double mejorPrecio = mejorOferta.get(ofertas[i]);
			if(mejorPrecio == null){
				//Es la primera vez que aparece el hotel
				mejorOferta.put(ofertas[i], ofertas[i].getPrecio());
			} else {
				if(mejorPrecio > ofertas[i].getPrecio()){
					mejorOferta.put(ofertas[i], ofertas[i].getPrecio());
				}
			}
		}
		System.out.println(mejorOferta);
	}
}
