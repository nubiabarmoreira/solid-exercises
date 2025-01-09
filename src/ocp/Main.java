package ocp;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();

        System.out.print("Digite o primeiro número: ");
        int a = input.nextInt();
        input.nextLine();
        System.out.print("Digite o segundo número: ");
        int b = input.nextInt();
        input.nextLine();
        System.out.print("Informe o tipo de operação que deseja realizar: (soma/subtração) ");
        String operacao = input.nextLine();

        int resultado;

        switch (operacao) {
            case "soma":
                resultado = calculadora.calcular(a, b, soma);
                System.out.println(resultado);
                break;
            case "subtração":
                resultado = calculadora.calcular(a, b, subtracao);
                System.out.println(resultado);
                break;
            default:
                System.out.println("Operação inválida. Escolha soma ou subtração.");
                break;
        }

        input.close();
    }
}
