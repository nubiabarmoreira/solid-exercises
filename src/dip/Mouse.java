package dip;

public class Mouse implements DispositivoEntrada {
    @Override
    public void usar() {
        System.out.println("Clicando...");
    }
}
