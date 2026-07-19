package c06.p10;

public class Acciones {

    public static void imprimeCambioDeEdad(
            Persona persona) {

        persona.edad = persona.edad + 10;

        System.out.println(
                "Edad: " + persona.edad);

    } // Fin del método imprimeCambioDeEdad

} // Fin de la clase Acciones