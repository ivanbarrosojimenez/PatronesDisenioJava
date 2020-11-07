package pruebas;

import prototype.Prototipo;

public class PruebaPrototipo {

	public static void main(String[] args) {
		//Prueba sin usar propotipo
		Prototipo prototipo = new Prototipo("Hola");
		Prototipo prototipo2 = new Prototipo("Adios");

		System.out.println(prototipo.getNombre());
		System.out.println(prototipo2.getNombre());

		prototipo = prototipo2;
		prototipo.setNombre("Nuevo nombre");
		System.out.println(prototipo.getNombre());
		System.out.println(prototipo2.getNombre());

		//Prueba usando prototipo
		Prototipo prototipo3 = new Prototipo("Hola");
		Prototipo prototipo4 = new Prototipo("Adios");
		System.out.println(prototipo3.getNombre());
		System.out.println(prototipo4.getNombre());

		prototipo3 = prototipo4.clonar();
		System.out.println(prototipo3.getNombre());
		System.out.println(prototipo4.getNombre());

		prototipo3.setNombre("Copia del 4");
		System.out.println(prototipo3.getNombre());
		System.out.println(prototipo4.getNombre());

	}

}
