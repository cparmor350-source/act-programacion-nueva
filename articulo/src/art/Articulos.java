public class Articulos {

        private String titulo;
        private int anyoLanzamiento;
        private double precioPorDia;

//constructor
        public Articulos (String titulo, int anyoLanzamiento, double precioPorDia) {
            this.titulo = titulo;
            this.anyoLanzamiento = anyoLanzamiento;
            this.precioPorDia = precioPorDia;
        }

//Constructor vacio
        public Articulos () {

        }

//getter and setter

        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public int getAnyoLanzamiento() { return anyoLanzamiento; }
        public void setAnyoLanzamiento(int anyoLanzamiento) { this.anyoLanzamiento = anyoLanzamiento; }

        public double getPrecioPorDia() { return precioPorDia; }
        public void setPrecioPorDia(double precioPorDia) { this.precioPorDia = precioPorDia; }

//calculos
        public double calcularPrecio(int numArticulos, int dias) {
            if (numArticulos < 0) numArticulos = 0;
            if (dias < 0) dias = 0;
            return numArticulos * dias * precioPorDia;
        }
//toString
        @Override
        public String toString() {
            return String.format("[Artículo] %s (%.2f €/día)", titulo, precioPorDia);
        }
    }


