package lsp;

import java.util.Scanner;

public class FormasGeometricas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        int ladoQuadrado = input.nextInt();
        input.nextLine();
        Forma quadrado = new Quadrado(ladoQuadrado);
        System.out.println("A área do quadrado é: " + quadrado.getArea());

        System.out.print("Digite a altura do retângulo: ");
        int alturaRetangulo = input.nextInt();
        input.nextLine();
        System.out.print("Digite a largura do retângulo: ");
        int larguraRetangulo = input.nextInt();
        input.nextLine();
        Forma retangulo = new Retangulo(alturaRetangulo, larguraRetangulo);
        System.out.println("A área do retângulo é: " + retangulo.getArea());

        input.close();
    }
}

class Quadrado implements Forma {
    private int lado;

    public Quadrado (int lado){
        this.lado = lado;
    }

    @Override
    public int getArea() {
        return lado * lado;
    }
}

class Retangulo implements Forma {
    private int largura;
    private int altura;

    public Retangulo (int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }
}