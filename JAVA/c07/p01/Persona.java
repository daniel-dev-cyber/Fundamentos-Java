package c07.p01;

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

    } // Fin del método getNombre

    public void setNombre(String pNombre) {

        nombre = pNombre;

    } // Fin del método setNombre

    public String getApellidoPaterno() {

        return apellidoPaterno;

    } // Fin del método getApellidoPaterno

    public void setApellidoPaterno(
            String pApellidoPaterno) {

        apellidoPaterno = pApellidoPaterno;

    } // Fin del método setApellidoPaterno

    public String getApellidoMaterno() {

        return apellidoMaterno;

    } // Fin del método getApellidoMaterno

    public void setApellidoMaterno(
            String pApellidoMaterno) {

        apellidoMaterno = pApellidoMaterno;

    } // Fin del método setApellidoMaterno

    public void imprimirCampos() {

        System.out.println("Nombre: "
                + nombre);
        System.out.println("Apellido paterno: "
                + apellidoPaterno);
        System.out.println("Apellido materno: "
                + apellidoMaterno);

    } // Fin del método imprimirCampos

} // Fin de la clase Persona