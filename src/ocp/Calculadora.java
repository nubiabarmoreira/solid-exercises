package ocp;

public class Calculadora {
    public int calcular(int a, int b, Operacao operacao) {
        return operacao.operacaoCalculadora(a, b);
    }
}

class Soma implements Operacao {
    @Override
    public int operacaoCalculadora(int a, int b) {
        return a + b;
    }
}

class Subtracao implements Operacao {
    @Override
    public int operacaoCalculadora(int a, int b) {
        return a - b;
    }
}

class Multiplicacao implements Operacao {
    @Override
    public int operacaoCalculadora(int a, int b) {
        return a * b;
    }
}