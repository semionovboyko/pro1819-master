package _02ejemplos;

import java.net.*;
import java.io.*;

public class _08ServidorSumas {
	final static int PUERTO = 5000;

	public _08ServidorSumas() {
		try {

			ServerSocket skServidor = new ServerSocket(PUERTO);
			while (true) {

				System.out.println("Servidor: escuchando en el puerto " + PUERTO);
				Socket skCliente = skServidor.accept();

				System.out.println("Servidor: Sirviendo a un cliente");
				DataOutputStream flujoSal = new DataOutputStream(skCliente.getOutputStream());
				DataInputStream flujoEnt = new DataInputStream(skCliente.getInputStream());

				// Completar ...
				int num1 = flujoEnt.readInt();
				int num2 = flujoEnt.readInt();
				flujoSal.writeInt(num1 + num2);

				skCliente.close();
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		new _08ServidorSumas();
	}
}