package Articulos;
public class Administrador {

        private String nombreUsuario;
        private int Id;
        private String contrasenya;
        private int anyonacimiento;

        // Constructor completo

        public Administrador(String nombreUsuario, int id, String contrasenya, int anyonacimiento) {
            this.nombreUsuario = nombreUsuario;
            Id = id;
            this.contrasenya = contrasenya;
            this.anyonacimiento = anyonacimiento;
        }


        // Constructor vacío
        public Administrador() {

        }

        // Getters y setters


        public String getNombreUsuario() {
            return nombreUsuario;
        }

        public void setNombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getContrasenya() {
            return contrasenya;
        }

        public void setContrasenya(String contrasenya) {
            this.contrasenya = contrasenya;
        }

        public int getAnyonacimiento() {
            return anyonacimiento;
        }

        public void setAnyonacimiento(int anyonacimiento) {
            this.anyonacimiento = anyonacimiento;
        }


        // retirarArticulo(usuario) -> elimina el artículo si el usuario es Cliente
        public void retirarArticulo(Usuario usuario) {

        }
        //String
        @Override
        public String toString() {
            return "Administrador{" +
                    "nombreUsuario='" + nombreUsuario + '\'' +
                    ", Id=" + Id +
                    ", contrasenya='" + contrasenya + '\'' +
                    ", anyonacimiento=" + anyonacimiento +
                    '}';
        }
    }

