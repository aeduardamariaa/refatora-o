package lista3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua matrícula: ");
        int mat = sc.nextInt();

        while(mat != 0) {
            System.out.println("Informe seu nome: ");
            String nome = sc.next();

            System.out.println("Informe a primeira nota:");
            Float n1 = sc.nextFloat();
            
            System.out.println("Informe a segunda nota:");
            Float n2 = sc.nextFloat();
            
            System.out.println("Informe a terceira nota:");
            Float n3 = sc.nextFloat();
            
            System.out.println("Informe a quarta nota:");
            Float n4 = sc.nextFloat();

            System.out.println(new Media(nome, mat, n1, n2, n3, n4).toString());
        
            System.out.println("Digite sua matrícula: ");
            mat = sc.nextInt();
        }
    
        sc.close();
    }
}

class Media {
    private String nome;
    int mat = 0;
    float media = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;

    public Media(String nome, int mat, float n1, float n2, float n3, float n4) {
        this.nome = nome;
        this.mat = mat;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public float calc_media() {
        return (n1 + n2 + n3 + n4) / 4;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nMatrícula: " + mat + "\nMédia: " + calc_media();
    }
}
