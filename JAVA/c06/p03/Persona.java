package c06.p03;

class Persona {

    private String nombre;
    private int edad;

    public Persona() {

        nombre = "(Sin nombre)";
        edad = 0;

    } // Fin del constructor

    public void imprimirCampos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println();

    } // Fin del método imprimirCampos

    public String getNombre() {

        return nombre;

    } // Fin del método getNombre

    public void setNombre(String valor) {

        nombre = valor;

    } // Fin del método setNombre

    public int getEdad() {

        return edad;

    } // Fin del método getEdad

    public void setEdad(int valor) {

        edad = valor;

    } // Fin del método setEdad

} // Fin de la clase Persona