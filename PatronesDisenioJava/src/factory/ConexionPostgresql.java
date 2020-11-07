package factory;

public class ConexionPostgresql extends Conexion {
	public ConexionPostgresql() {
	}

	@Override
	public String descripcion() {
		return "Conexion Postgresql";
	}
	
}
