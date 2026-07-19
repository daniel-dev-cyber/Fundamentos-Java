package c07.p02;

public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Persona() {

        nombre = "";
        apellidoPaterno = "";
        apellidoMaterno = "";

    } // Fin del constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String pApellidoPaterno) {
        apellidoPaterno = pApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String pApellidoMaterno) {
        apellidoMaterno = pApellidoMaterno;
    }

} // Fin de la clase Persona