public class AlbumMusica {

        private String autor;
        private int numCanciones;
        private boolean single;

    //constructor
    public AlbumMusica(String s, int i, double v, String autor, int numCanciones, boolean single) {
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    //Constructor vacio
        public AlbumMusica() {

        }


    //getter and setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    //calculos
        public int getDuracionTotal(int duracionMediaPorCancion) {
            if (duracionMediaPorCancion < 0) duracionMediaPorCancion = 0;
            return numCanciones * duracionMediaPorCancion;
        }
    //toString
    @Override
    public String toString() {
        return "AlbumMusica{" +
                "autor='" + autor + '\'' +
                ", numCanciones=" + numCanciones +
                ", single=" + single +
                '}';
    }
}

