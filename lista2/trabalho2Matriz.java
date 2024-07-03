import java.util.Scanner;

public class trabalho2Matriz {
    public static void main(String[] args) {
        Integer mat1[][] = new Integer[5][5];
        Integer mat2[][] = new Integer[5][5];
        Integer matresul[][] = new Integer[5][5];
        Integer l, c, diagonal = 0, cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira matriz:");
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.println("Informe o valor da linha " + l + ", e da coluna "+c);
                mat1[l][c] = sc.nextInt();
            }
        }

        System.out.println("Segunda matriz:");
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.println("Informe o valor da linha " + l + ", e da coluna "+c);
                mat2[l][c] = sc.nextInt();
            }
        }

        sc.close();

        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                matresul[l][c] = mat1[l][c] + mat2[l][c];
            }
        }

        System.out.println("Soma das 2 matrizes:");
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.println("| " + matresul[l][c] + " |");
            }
            System.out.println();
        }

        for (cont = 0; cont < 5; cont++) {
            diagonal += matresul[cont][cont];
        }

        System.out.println("O valor da diagonal principal é " + diagonal);
    }
}

