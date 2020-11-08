package proxy;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonaProxy implements Runnable {

	private Thread thread;
	Socket socket;
	InputStream in;
	PrintWriter salida;
	int character;
	
	public PersonaProxy() {
		try {
			socket = new Socket("127.0.0.1", 35353);
			System.out.println("Conectando...");
			in = socket.getInputStream();
			salida = new PrintWriter(socket.getOutputStream(), true);
			thread = new Thread(this);
			thread.start();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	@Override
	public void run() {
		try {
			while((character = in.read()) != -1) {
				System.out.print((char)character);
			}
		} catch (Exception e) {
		}
	}
	
	public void saludar() {
		salida.println("saludar");
	}
	
	public void decirEstado() {
		salida.println("decirEstado");
	}
	
	public void despedirse() {
		salida.println("despedirse");
	}

}
