package proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonaRemota implements Runnable {

	private Thread thread;
	ServerSocket socket;
	PrintWriter salida;
	Socket comunicationSocket;

	@Override
	public void run() {
		String textoEntrada;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(comunicationSocket.getInputStream()));
			while((textoEntrada = in.readLine()) != null) {
				if(textoEntrada.equals("saludar")){
					saludar();
				} else if(textoEntrada.equals("decirEstado")){
					decirEstado();
				} else if(textoEntrada.equals("despedirse")) {
					despedirse();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	

	}

	public PersonaRemota() {
		try {
			socket = new ServerSocket(35353);
			comunicationSocket = socket.accept();
			salida = new PrintWriter(comunicationSocket.getOutputStream(), true);
			thread  = new Thread(this);
			thread.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saludar() {
		salida.println("Hola");
	}
	
	public void decirEstado() {
		salida.println("Todo esta bien");
	}
	
	public void despedirse() {
		salida.println("Adios");
	}
	
	public static void main(String[] args) {
		PersonaRemota pr = new PersonaRemota();
	}
}
