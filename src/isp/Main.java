package isp;

public class Main {
    public static void main (String[] args) {
        Programador desenvolvedor = new Desenvolvedor();
        Atendedor atendente = new Atendente();

        desenvolvedor.programar();
        atendente.atenderCliente();
    }
}
