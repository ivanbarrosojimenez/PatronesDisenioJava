package adapter;

public class AdaptadorNombre {
	private Nombre objetoNombre;
	private String nombre;
	private String apellido;
	
	public AdaptadorNombre(Nombre nombre) {
		this.objetoNombre = nombre;
		setNombre(nombre.getNombreCompuesto().split(" ")[0]);
		setApellido(nombre.getNombreCompuesto().split(" ")[1]);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
