import java.util.Scanner;

public class listamold6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("* * * LOJA DE CAMISETAS * * *");
        System.out.println("QUAL A QUANTIDADE DE CAMISETAS PEQUENAS($10,00):");
        int peq = sc.nextInt();

        System.out.println("QUAL A QUANTIDADE DE CAMISETAS MÉDIAS($12,00):");
        int med = sc.nextInt();

        System.out.println("QUAL A QUANTIDADE DE CAMISETAS GRANDES($15,00):");
        int gra = sc.nextInt();

        System.out.println("INSIRA SEU NOME: ");
        String name = sc.next();

        System.out.println(name + ", o seu valor arrecadado foi: R$" + Calculo(peq, med, gra));

        sc.close();
    }
    static float Calculo(int p_peq ,int p_med ,int p_grand) {
        float result = 0;

        result+=10*p_peq;
        result+=12*p_med;
        result+=15*p_grand;

        return result;
    }
}
