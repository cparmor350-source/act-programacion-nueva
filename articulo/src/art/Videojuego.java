public class Videojuego {
        private String director;
        private String plataformas;
        private int pegi;

//constructor

    public Videojuego(String director, String plataformas, int pegi) {
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }
    //Constructor vacio
        public Videojuego(String spaceBattle, int i, double v, String devStudio, String s, int i1) {

        }

        // Getters y setters
        public String getDirector() { return director; }
        public void setDirector(String director) { this.director = director; }

        public String getPlataformas() { return plataformas; }
        public void setPlataformas(String plataformas) { this.plataformas = plataformas; }

        public int getPegi() { return pegi; }
        public void setPegi(int pegi) { this.pegi = pegi; }

        // paraAdultos()
        public boolean paraAdultos() {
            return this.pegi >= 18;
        }

        // esApto
        public boolean esApto(int edad) {
            return edad >= this.pegi;
        }
    //toString
    @Override
    public String toString() {
        return "Videojuego{" +
                "director='" + director + '\'' +
                ", plataformas='" + plataformas + '\'' +
                ", pegi=" + pegi +
                '}';
    }
}

