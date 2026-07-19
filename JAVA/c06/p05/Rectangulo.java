package c06.p05;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
        base = 1;
        altura = 1;
    }

    public Rectangulo(int pBase, int pAltura) {
        base = pBase;
        altura = pAltura;
    }

    public void imprimirCampos() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println();
    }
}