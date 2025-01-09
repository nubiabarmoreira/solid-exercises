package dip;

public class Computador {
    private DispositivoEntrada dispositivoEntrada;

    public Computador (DispositivoEntrada dispositivoEntrada){
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void usar(){
        dispositivoEntrada.usar();
    }
}
