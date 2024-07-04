import java.util.Scanner;

public class listalaco6 {
    public static void main(String[] args) {
        Integer codlanche, codbebida, pedidos = 0;
        Float precolanche = 0f, precobebida = 0f, pedidototal = 0f, total_dos_pedidos = 0f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do lanche:");
        codlanche = sc.nextInt();

        System.out.println("Digite o código da bebida:");
        codbebida = sc.nextInt();

        while (codlanche > 0 || codbebida > 0) {
            pedidos++;

            if (codlanche == 100) {
                precolanche = 1.20f;
                System.out.println("Cachorro quente à " + String.format("%.2f", precolanche) + " reais.");
            } else {
                if (codlanche == 101) {
                    precolanche = 1.30f;
                    System.out.println("Bauru à " + String.format("%.2f", precolanche) + " reais.");
                } else {
                    if (codlanche == 102) {
                        precolanche = 1.50f;
                        System.out.println("Hamburguer à " + String.format("%.2f", precolanche) + " reais.");
                    } else {
                        if(codlanche != 100 || codlanche != 101 || codlanche != 102){
                            precolanche = 0f;
                        }
                    }
                }
            }

            if(codbebida == 5){
                precobebida = 5f;
                System.out.println("Coca à " + String.format("%.2f", precobebida) + " reais.");
            }
            else{
                if(codbebida == 3){
                    precobebida = 3f;
                    System.out.println("Agua à " + String.format("%.2f", precobebida) + " reais.");
                }
                else{
                    if(codbebida != 5 || codbebida != 3){
                        precobebida = 0f;
                    }
                }	
            }

            pedidototal = precobebida + precolanche;
            System.out.println(String.format("%.2f", pedidototal) + " reais todo o combo");
            total_dos_pedidos += pedidototal;

            System.out.println("Digite o código do lanche: ");
            codlanche = sc.nextInt();

            System.out.println("Digite o código da bebida: ");
            codbebida = sc.nextInt();
        }

        sc.close();

        System.out.println(pedidos + " , pedidos diferentes feitos.");
        System.out.println(String.format("%.2f", total_dos_pedidos) + ", total dos pedidos");
    }
}
