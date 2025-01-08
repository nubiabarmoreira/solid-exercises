package srp;

public class RelatorioFinanceiro {
    public static void main (String[] args) {
        ConfeccaoDeRelatorio confeccao = new ConfeccaoDeRelatorio();
        EnvioDeRelatorio envio = new EnvioDeRelatorio();

        confeccao.gerarRelatorio();
        envio.enviarPorEmail();
    }
}

class ConfeccaoDeRelatorio {
    public void gerarRelatorio() {
        System.out.println("Gerando relatório financeiro...");
    }
}

class EnvioDeRelatorio {
    public void enviarPorEmail() {
        System.out.println("Enviando relatório por e-mail...");
    }
}