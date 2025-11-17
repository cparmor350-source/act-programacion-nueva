package Articulos;

public class Usuario {

    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimiento;

    // Constructor completo
    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    // Constructor vacío
    public Usuario() {

    }

    // Getters y setters


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    // esAdulto
    public boolean esAdulto() {
        return (2025 - this.anyoNacimiento) >= 18;
    }

    // contrasenyaSegura
    public boolean contrasenyaSegura() {
        return this.contrasenya != null && this.contrasenya.length() > 10;
    }

    //STRING
    @Override
    public String toString() {
        return String.format("%s (%d)", nombreUsuario, id);
    }
}
