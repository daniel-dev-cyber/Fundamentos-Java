package c07.p02;

public class Cliente extends Persona {

    private int numeroCliente;

    public Cliente() {

        setNombre("");
        setApellidoPaterno("");
        setApellidoMaterno("");
        numeroCliente = 0;

    } // Fin del constructor

    public int getNumeroCliente() {

        return numeroCliente;

    } // Fin del método getNumeroCliente

    public void setNumeroCliente(
            int pNumeroCliente) {

        numeroCliente = pNumeroCliente;

    } // Fin del método setNumeroCliente

    public void imprimirCampos() {

        System.out.println("Cliente:"
                + "\nNombre = " + getNombre()
                + "\nApellido paterno = "
                + getApellidoPaterno()
                + "\nApellido materno = "
                + getApellidoMaterno()
                + "\nNúmero de cliente = "
                + numeroCliente);

    } // Fin del método imprimirCampos

} // Fin de la clase Cliente