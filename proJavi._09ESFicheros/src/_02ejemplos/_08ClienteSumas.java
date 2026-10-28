package _02ejemplos;

import java.io.*;
import java.net.*;

public class _08ClienteSumas {
	final static String HOST = "localhost";
	final static int PUERTO = 5000;

	public _08ClienteSumas() {
		boolean terminar = false;
		while (!terminar) {
			try {
				System.out.println("Cliente: Esperando conexión con el servidor");
				Socket skCliente = new Socket(HOST, PUERTO);

				System.out.println("Cliente: Conectado al servidor");
				DataInputStream flujoEnt = new DataInputStream(skCliente.getInputStream());
				DataOutputStream flujoSal = new DataOutputStream(skCliente.getOutputStream());
				// Completar
				flujoSal.writeInt(111111);
				flujoSal.writeInt(222222);
				int result = flujoEnt.readInt();
				System.out.println(result);

				skCliente.close();
				terminar = true;
			} catch (ConnectException ex) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException ie) {
					System.out.println(ie);
				}
			} catch (IOException ex) {
				System.out.println(ex);
				terminar = true;
			}
		}
	}

	public static void main(String[] args) {
		new _08ClienteSumas();
	}
}
