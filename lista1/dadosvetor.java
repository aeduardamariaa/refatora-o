package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dadosvetor {
    public static void main(String[] args) {
        List<Integer> vetjogo = new ArrayList<Integer>();
        Integer cont = 0, valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0, valor6 = 0;
        Scanner scan = new Scanner(System.in);

        for (cont = 0; cont < 20; cont++) {
            System.out.println("Informe o numero tirado no dado(de 1 a 6):" + cont);
            vetjogo.add(scan.nextInt());

            if(vetjogo.get(cont) == 1) {
                valor1++;
            }

            if(vetjogo.get(cont) == 2) {
                valor2++;
            }

            if(vetjogo.get(cont) == 3) {
                valor3++;
            }

            if(vetjogo.get(cont) == 4) {
                valor4++;
            }
            
            if(vetjogo.get(cont) == 5) {
                valor5++;
            }

            if(vetjogo.get(cont) == 6) {
                valor6++;
            }
        }

        System.out.println("Numero 1 foi tirado " + valor1 + " vezes.");
        System.out.println("Numero 2 foi tirado " + valor2 + " vezes.");
        System.out.println("Numero 3 foi tirado " + valor3 + " vezes.");
        System.out.println("Numero 4 foi tirado " + valor4 + " vezes.");
        System.out.println("Numero 5 foi tirado " + valor5 + " vezes.");
        System.out.println("Numero 6 foi tirado " + valor6 + " vezes.");

        scan.close();
    }
}
