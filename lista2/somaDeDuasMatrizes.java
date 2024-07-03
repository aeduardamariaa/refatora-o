import java.util.Scanner;

public class somaDeDuasMatrizes {
    public static void main(String[] args) {
        Integer mat1[][] = new Integer[3][3];
        Integer mat2[][] = new Integer[3][3];
        Integer matsoma[][] = new Integer[3][3];
        Integer l, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira matriz:");
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                System.out.println("Informe o valor da linha " + l + ", e da coluna "+c);
                mat1[l][c] = sc.nextInt();
            }
        }

        System.out.println("Segunda matriz:");
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                System.out.println("Informe o valor da linha " + l + ", e da coluna "+c);
                mat2[l][c] = sc.nextInt();
            }
        }

        sc.close();

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                matsoma[l][c] = mat1[l][c] + mat2[l][c];
            }
        }

        System.out.println("Soma das 2 matrizes:");
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                System.out.println("| " + matsoma[l][c] + " |");
            }
            System.out.println();
        }
    }
}
