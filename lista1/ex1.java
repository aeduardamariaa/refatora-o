package lista1;

import java.util.Scanner;
import java.lang.OutOfMemoryError;

public class ex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("QUAL O SALÁRIO:");
        
        Float sal = scan.nextFloat();

        if (sal > 5000) {
            System.out.println("MAIOR QUE R$5.000,00");
        }
        
        scan.close();
    }
}
