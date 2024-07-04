import java.util.Scanner;

public class listacondicional3 {
    public static void main(String[] args) {
        Float salbruto = 0f, desc = 0f, respliq = 0f;
        Scanner sc = new Scanner(System.in);
        final Float salmin = 1412f;

        System.out.println("Informe o salário bruto:");
        salbruto = sc.nextFloat();

        System.out.println("Informe o imposto a ser pago:");
        desc = sc.nextFloat();

        sc.close();

        desc *= salbruto;

        respliq = salbruto -desc;

        if(desc <= salmin) {
            System.out.println("O salário líquido é " + String.format("%.2f", respliq) + " e seus impostos estão MENORES do que um salário mínimo");
        } else {
            System.out.println("O salário líquido é " + String.format("%.2f", respliq) + " e seus impostos estão MAIORES do que um salário mínimo");

        }
    }
}
