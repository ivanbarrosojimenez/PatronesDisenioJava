package abstractfactory;

/**
 * El objetivo de este patron es poder implementar varias factorias, por ejemplo para implementar conexiones seguras
 * @author ibarrosj
 *
 */
public abstract class FabricaAbstracta {
	
	public FabricaAbstracta() {
		
	}
	
	protected abstract factory.Conexion creaConexion(String tipo);
	
}
