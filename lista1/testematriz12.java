import java.util.Scanner;

public class testematriz12 {

    public static final int DIML = 3;
    public static final int DIMC = 5;
    public static void main(String[] args) {
        int l, c;
        int [][] matriz = new int[DIML][DIMC];

        Scanner sc = new Scanner(System.in);

        for(l = 0; l < DIML; l++){
            for(c = 0; c < DIMC; c++){
                System.out.println("Informe a posição( " + l + ", " + c + " )da matriz: ");
                matriz[l][c]= sc.nextInt();
            }
        }

        for(l = 0; l < DIML; l++){
            for(c = 0; c < DIMC; c++){
                System.out.print(matriz[l][c] + " | ");
            }
            System.out.println();
        }
        sc.close();
    }
}
