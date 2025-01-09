package ocp;

import java.nio.channels.MulticastChannel;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();

        System.out.print("Digite o primeiro número: ");
        int a = input.nextInt();
        input.nextLine();
        System.out.print("Digite o segundo número: ");
        int b = input.nextInt();
        input.nextLine();
        System.out.print("Informe o tipo de operação que deseja realizar: (soma/subtração/multiplicação) ");
        String operacao = input.nextLine();

        int resultado;

        switch (operacao) {
            case "soma":
                resultado = calculadora.calcular(a, b, soma);
                System.out.print(resultado);
                break;
            case "subtração":
                resultado = calculadora.calcular(a, b, subtracao);
                System.out.print(resultado);
                break;
            case "multiplicação":
                resultado = calculadora.calcular(a, b, multiplicacao);
                System.out.print(resultado);
                break;
            default:
                System.out.println("Operação inválida. Escolha soma, subtração ou multiplicação.");
                break;
        }

        input.close();
    }
}
