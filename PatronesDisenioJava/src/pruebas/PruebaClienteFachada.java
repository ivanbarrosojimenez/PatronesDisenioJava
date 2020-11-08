package pruebas;

import facade.Fachada;

public class PruebaClienteFachada {
	private Fachada fachada;

	public PruebaClienteFachada() {
		fachada = new Fachada();
	}
	
	public void encenderCpu() {
		fachada.encederCpu();
		System.out.println("Comienzo a trabajar");
	}
	public static void main(String[] args) {
		PruebaClienteFachada clienteFachada = new PruebaClienteFachada();
		clienteFachada.encenderCpu();
	}

}
