package factory;

/**
 * Este patron sirve para crear diferentes objetos de la misma naturaleza en tiempo de ejecucion
 * 
 * @author ibarrosj
 *
 */
public class Factoria {
	protected String tipo;

	public Factoria(String tipo) {
		this.tipo = tipo;
	}
	
	public Conexion creaConexion() {
		if(tipo.equalsIgnoreCase("oracle")) {
			return new ConexionOracle();
		} else if(tipo.equalsIgnoreCase("mysql")) {
			return new ConexionMySql();
		} else if(tipo.equalsIgnoreCase("postgresql")) {
			return new ConexionPostgresql();
		} else {
			return null;
		}
		
	}
}
