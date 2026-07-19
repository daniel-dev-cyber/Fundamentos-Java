
package c05.p02;

class PruebaPersona {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.imprimirCampos();

        System.out.println();

        persona1.nombre = "Alex";
        persona1.apellidoPaterno = "Torres";
        persona1.apellidoMaterno = "Flores";
        persona1.edad = 20;
        persona1.peso = 56;

        persona1.imprimirCampos();

    }

}