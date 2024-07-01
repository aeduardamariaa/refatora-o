package lista3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1 = 0, n2 = 0;
        String op;

        menu();
        op = sc.next().toUpperCase();

        Calculadora calculadora = new Calculadora();

        while (!op.equals("#")) {
            System.out.println("Informe o primeiro número: ");
            n1 = sc.nextFloat();
            System.out.println("Informe o segundo número: ");
            n2 = sc.nextFloat();

            float res = 0;
            switch (op) {
                case "S":
                    res = calculadora.soma(n1, n2);
                    System.out.println("Resultado da soma: " + res);
                    break;
                case "U":
                    res = calculadora.subtracao(n1, n2);
                    System.out.println("Resultado da subtração: " + res);
                    break;
                case "X":
                    res = calculadora.multiplicacao(n1, n2);
                    System.out.println("Resultado da multiplicação: " + res);
                    break;
                case "D":
                    if (n2 == 0) {
                        System.out.println("Erro: divisão por zero.");
                    } else {
                        res = calculadora.divisao(n1, n2);
                        System.out.println("Resultado da divisão: " + res);
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            menu();
            op = sc.next().toUpperCase();
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }

    private static void menu() {
        System.out.println("\nQual operação deseja realizar: ");
        System.out.println("S - SOMA / U - SUBTRAÇÃO / X - MULTIPLICAÇÃO / D - DIVISÃO");
        System.out.println("Digite '#' para sair.");
    }
}

class Calculadora {
    public float soma(float a, float b) {
        return a + b;
    }

    public float subtracao(float a, float b) {
        return a - b;
    }

    public float multiplicacao(float a, float b) {
        return a * b;
    }

    public float divisao(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Erro: divisão por zero.");
        }
        return a / b;
    }
}
