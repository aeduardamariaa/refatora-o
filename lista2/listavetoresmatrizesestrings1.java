import java.util.Scanner;

public class listavetoresmatrizesestrings1 {
    public static void main(String[] args) {
        String[] nome = new String[5];
        Float[] reais = new Float[5];
        Integer cont = 0;
        Scanner sc = new Scanner(System.in);

        for (cont = 0; cont < 5; cont++) {
            System.out.println("Informe o " + (cont +1) + "º nome:");
            nome[cont] = sc.next();

            System.out.println("Informe o " + (cont +1) + "º valor a ser calculado:");
            reais[cont] = sc.nextFloat();
            sc.close();
        }   
        
        System.out.println("____________________________________");
        for (cont = 0; cont < 5; cont++) {
            Float valor = reais[cont] * 2;
            System.out.println(nome[cont] + " com o valor x2 = " + (String.format("%.2f", valor)));
        }
    }
}
