package c06.p07;

public class PruebaClaseB {

    public static void main(String[] args) {

        System.out.println("ClaseB: "
                + ClaseB.campoStatic + "\n");

        ClaseB.campoStatic = 10;

        System.out.println("ClaseB: "
                + ClaseB.campoStatic + "\n");

        ClaseB.campoStatic = 200;

        System.out.println("ClaseB: "
                + ClaseB.campoStatic + "\n");

        ClaseB.campoStatic = 3000;

        System.out.println("ClaseB: "
                + ClaseB.campoStatic + "\n");

    } // Fin del método main

} // Fin de la clase PruebaClaseB