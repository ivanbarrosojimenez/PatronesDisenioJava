package pruebas;

import proxy.PersonaProxy;

public class PruebaProxy {
	PersonaProxy persona;
	public PruebaProxy() {
		persona = new PersonaProxy();
		persona.saludar();
		persona.decirEstado();
		persona.despedirse();
	}
	
	public static void main(String[] args) {
		PruebaProxy pp = new PruebaProxy();
	}
}
