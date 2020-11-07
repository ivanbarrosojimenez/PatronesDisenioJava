package pruebas;

import singleton.ClaseSingleton;

public class PruebaPatroneSingleton {

	public static void main(String[] args) {
		ClaseSingleton objeto1 = ClaseSingleton.obtenerClaseSingleton();
		ClaseSingleton objeto2 = ClaseSingleton.obtenerClaseSingleton();
		ClaseSingleton objeto3 = ClaseSingleton.obtenerClaseSingleton();
		ClaseSingleton objeto4 = ClaseSingleton.obtenerClaseSingleton();
		ClaseSingleton objeto5 = ClaseSingleton.obtenerClaseSingleton();
		ClaseSingleton objeto6 = ClaseSingleton.obtenerClaseSingleton();
		ClaseSingleton objeto7 = ClaseSingleton.obtenerClaseSingleton();

	}

}
