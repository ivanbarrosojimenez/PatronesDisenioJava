package builder;

public class ClaseBuilder {

	private int numeroInt;
	private String textoString;
	
	public int getNumeroInt() {
		return numeroInt;
	}


	public void setNumeroInt(int numeroInt) {
		this.numeroInt = numeroInt;
	}


	public String getTextoString() {
		return textoString;
	}


	public void setTextoString(String textoString) {
		this.textoString = textoString;
	}


	/**
     * Constructor privado llamado desde el Builder
     * 
     * @param builder
     */
    private ClaseBuilder(Builder builder) {
        this.numeroInt = builder.numeroInt;
        this.textoString = builder.textoString;
    } // Constructor
    
    
	   /**
     * Clase estática utilizada para construir el pojo con parámetros evitando el antipatron de
     * constructores telescópicos
     * 
     * @author ibarrosj
     */
    public static class Builder {

        private int numeroInt;
        private String textoString;

        public Builder numeroInt(int numeroInt) {
            this.numeroInt = numeroInt;
            return this;
        }

        public Builder textoString(String textoString) {
            this.textoString = textoString;
            return this;
        }


        public ClaseBuilder build() {
            return new ClaseBuilder(this);
        }
    } // Builder

}
