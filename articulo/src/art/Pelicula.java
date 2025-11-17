public class Pelicula {

        private String director;
        private int duracion; // en minutos


    //constructor
    public Pelicula(String laGranAventura, int i, double v, String director, int duracion) {
        this.director = director;
        this.duracion = duracion;
    }


    //Constructor vacio
        public Pelicula() {

        }

//getter and setter

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // getDuracionHorasYMinutos() -> muestra por consola "X horas y Y minutos"
        public void getDuracionHorasYMinutos() {
            int horas = duracion / 60;
            int minutos = duracion % 60;
            System.out.println(horas + " horas y " + minutos + " minutos");
        }

        // getDuracionSegundos()
        public int getDuracionSegundos() {
            return duracion * 60;
        }
    //toString
    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}



