import java.util.Scanner;

public class listavetoresmatrizesestrings7 {
    public static void main(String[] args) {
        Integer[] valores = new Integer[10];
        Integer[] par = new Integer[10];
        Integer[] impar = new Integer[10];
        Scanner sc = new Scanner(System.in);
        Integer cont, y = 0, x = 0;

        for (cont = 0; cont < 10; cont++) {
            System.out.println("Informe o " + (cont + 1) + " valor:");
            valores[cont] = sc.nextInt();
        }
        sc.close();

        for (cont = 0; cont < 10; cont++) {
            if (valores[cont] % 2 == 0) {
                par[x] = valores[cont];
                x++;
            } else {
                impar[y] = valores[cont];
                y++;
            }
        }

        System.out.println("Números pares: ");
        for (cont = 0; cont < x; cont++) {
            System.out.println(par[cont]);
        }

        System.out.println("Números ímpares");
        for (cont = 0; cont < y; cont++) {
            System.out.println(impar[cont]);
        }
    }
}