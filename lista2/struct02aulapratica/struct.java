package struct02aulapratica;

import java.util.Scanner;

public class struct {
    public static void main(String[] args) {
        Iptu imovel = new Iptu();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o cadastro:");
        imovel.setCadastro(scanner.nextInt());

        System.out.println("Informe o valor do IPTU:");
        imovel.setIptu(scanner.nextFloat());

        System.out.println("Informe quantos meses atrasado:");
        imovel.setMesAtrasado(scanner.nextInt());

        imovel.setMulta(imovel.getMesAtrasado() * 50f);

        System.out.println(imovel.getCadastro());
        System.out.println(imovel.getIptu());
        System.out.println(imovel.getMesAtrasado());
        System.out.println(imovel.getMulta());

        scanner.close();
    }
}
