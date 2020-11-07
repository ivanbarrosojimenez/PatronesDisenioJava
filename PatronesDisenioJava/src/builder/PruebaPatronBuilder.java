package builder;


public class PruebaPatronBuilder {

	public static void main(String[] args) {
		//Con este patron podemos definir los atributos del constructor sin importar el orden
		ClaseBuilder claseBuilder = new ClaseBuilder.Builder()
				.numeroInt(1)
				.textoString("hola")
				.build();
		ClaseBuilder claseBuilder2 = new ClaseBuilder.Builder()
				.textoString("hola")
				.numeroInt(1)
				.build();
				
	}

}
