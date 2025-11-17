
public class Libro {

    private String autor;
    private int numPaginas;
    private Genero genero;

    //constructor
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia,
                 String autor, int numPaginas, Genero genero) {

        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    //Constructor vacio
    public Libro(String elMisterio, int i, String anaPérez, double v, Genero misterio) {

    }


    public Libro(String autor, int numPaginas, Genero genero) {
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }
    //getter and setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    // Getters y setters


    // esLargo()
    public boolean esLargo() {
        return this.numPaginas > 200;
    }
    //toString
    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", genero=" + genero +
                '}';
    }
}




