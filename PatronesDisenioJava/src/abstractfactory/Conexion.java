package abstractfactory;

public abstract class Conexion {
	private String tipo;
	public Conexion(String tipo) {
		this.tipo = tipo;
	}
	
	public String descripcion() {
		return "Conexion generica";
	}
}
