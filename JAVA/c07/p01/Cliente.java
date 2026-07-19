package c07.p01;

public class Cliente {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int numeroCliente;

    public Cliente() {

        nombre = "";
        apellidoPaterno = "";
        apellidoMaterno = "";
        numeroCliente = 0;

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

    public int getNumeroCliente() {

        return numeroCliente;

    } // Fin del método getNumeroCliente

    public void setNumeroCliente(
            int pNumeroCliente) {

        numeroCliente = pNumeroCliente;

    } // Fin del método setNumeroCliente

    public void imprimirCampos() {

        System.out.println("Cliente:"
                + "\nNombre = " + nombre
                + "\nApellido paterno = "
                + apellidoPaterno
                + "\nApellido materno = "
                + apellidoMaterno
                + "\nNúmero de cliente = "
                + numeroCliente);

    } // Fin del método imprimirCampos

} // Fin de la clase Cliente