package abstractfactory;

import factory.Conexion;
import factory.ConexionMySql;
import factory.ConexionOracle;
import factory.ConexionPostgresql;

public class FabricaHeredada extends FabricaAbstracta {

	@Override
	protected Conexion creaConexion(String tipo) {
		if (tipo.equalsIgnoreCase("oracle")) {
			return new ConexionOracle();
		} else if (tipo.equalsIgnoreCase("mysql")) {
			return new ConexionMySql();
		} else if (tipo.equalsIgnoreCase("postgresql")) {
			return new ConexionPostgresql();
		} else {
			return null;
		}

	}
}
