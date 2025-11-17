package Articulos;
public class Cliente {
    private String articulo;
    private int numSocio;

    // Constructor completo

    public Cliente(String maria, String corta, int i1, int i, String articulo, int numSocio) {
        this.articulo = articulo;
        this.numSocio = numSocio;
    }


    // Constructor vacío

    public Cliente(String juan, String segura12345, int i, int i1, int i2) {
    }


    // Getters y setters

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    //String
    @Override
    public String toString() {
        return "Cliente{" +
                "articulo='" + articulo + '\'' +
                ", numSocio=" + numSocio +
                '}';
    }

}