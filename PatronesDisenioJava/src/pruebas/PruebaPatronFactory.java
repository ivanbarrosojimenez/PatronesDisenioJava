package pruebas;

import factory.Conexion;
import factory.Factoria;

public class PruebaPatronFactory {

	public static void main(String[] args) {
		//Varias conexiones
		Factoria factoria = new Factoria("oracle");
		Conexion conexion = factoria.creaConexion();
		System.out.println(conexion.descripcion());
		
		Factoria factoria2 = new Factoria("mysql");
		Conexion conexion2 = factoria2.creaConexion();
		System.out.println(conexion2.descripcion());
	}

}
