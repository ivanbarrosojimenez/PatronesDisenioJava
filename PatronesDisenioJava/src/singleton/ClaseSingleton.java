package singleton;

/**
 * Este patron es util cuando solo queremos una instancia de un objeto, por ejemplo si queremos una clase controladora de eventos.
 * Tambien para conexiones de base de datos, en juegos para saber los usuarios conectados etc.
 * @author ibarrosj
 *
 */
public final class ClaseSingleton {
	private static final ClaseSingleton singleton = new ClaseSingleton();
	
	private ClaseSingleton() {
		System.out.println("Instancia del objeto");
	}
	
	public static ClaseSingleton obtenerClaseSingleton() {
		return singleton;
	}
}
