package pruebas;

import java.util.Scanner;

import adapter.AdaptadorNombre;
import adapter.Nombre;

public class PruebaAdaptador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Nombre nombre = new Nombre();
		nombre.setNombreCompuesto(sc.nextLine());
		System.out.println("El nombre completo es:" + nombre.getNombreCompuesto());

		AdaptadorNombre adaptadorNombre = new AdaptadorNombre(nombre);
		System.out.println("Tu nombre es: " + adaptadorNombre.getNombre());
		System.out.println("Tu apellido es: " + adaptadorNombre.getApellido());
		
		sc.close();
	}
}
