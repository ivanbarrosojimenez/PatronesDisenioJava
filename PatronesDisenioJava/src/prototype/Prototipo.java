package prototype;

public class Prototipo {
	private String nombre;
	
	public Prototipo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Prototipo clonar() {
		Prototipo prototipo = new Prototipo(this.nombre);
		return prototipo;
	}
}
