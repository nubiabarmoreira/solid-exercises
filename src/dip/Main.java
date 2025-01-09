package dip;

public class Main {
    public static void main (String[] args) {
        DispositivoEntrada teclado = new Teclado();
        Computador computadorComTeclado = new Computador(teclado);

        computadorComTeclado.usar();
    }
}