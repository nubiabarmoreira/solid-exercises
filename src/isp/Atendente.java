package isp;

public class Atendente implements Atendedor {
    @Override
    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}
