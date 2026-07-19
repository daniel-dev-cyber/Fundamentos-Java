package c07.p02;

public class PruebaCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Carlos");
        cliente1.setApellidoPaterno("Cadena");
        cliente1.setApellidoMaterno("Castillo");
        cliente1.setNumeroCliente(2001);

        cliente1.imprimirCampos();

    } // Fin del método main

} // Fin de la clase PruebaCliente
