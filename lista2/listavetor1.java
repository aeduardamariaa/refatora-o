import java.util.Scanner;

public class listavetor1 {
    public static void main(String[] args) {
        Float[] notas = new Float[5];
        Integer cont, maisque75 = 0;
        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);

        for (cont = 0; cont < 5; cont++) {
            System.out.println("Qual seu nome?");
            nomes[cont] = sc.next();

            System.out.println("Qual sua nota?");
            notas[cont] = sc.nextFloat();
            sc.close();
        }


        System.out.println("Notas acima de 7,5:");

        for (cont = 0; cont < 5; cont++) {
            if (notas[cont] >=7.5) {
                String formattedNota = String.format("%.2f", notas[cont]);
                System.out.println("Nota: " + formattedNota + ". Do aluno: " + nomes[cont]);
                maisque75 ++;
            }
        }

        System.out.println(maisque75 + " alunos tiraram acima que 7,5.");
    }
}
