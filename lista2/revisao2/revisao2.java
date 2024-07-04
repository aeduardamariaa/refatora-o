package revisao2;

import java.util.ArrayList;
import java.util.Scanner;

public class revisao2 {
    public static void main(String[] args) {
        ArrayList<func> funcionario = new ArrayList<func>(); 
        Integer cont;
        Scanner sc = new Scanner(System.in);

        for (cont = 0; cont < 3; cont++) {
            func funci = new func();
            System.out.println("Qual o código do funcionário");
            funci.setCod_func(sc.nextInt());

            System.out.println("Qual o nome do funcionário");
            funci.setNome(sc.next());

            System.out.println("Qual o salário do funcionário");
            funci.setSal(sc.nextFloat());

            System.out.println("Qual o email do funcionário");
            funci.setEmail(sc.next());

            System.out.println((cont + 1)+ " funcionário cadastrado com sucesso.");
            funcionario.add(funci);
        }

        for (cont = 0; cont < 3; cont++) {
            System.out.println("____________________________________________________");
            System.out.println("Codigo: " + funcionario.get(cont).getCod_func());
            System.out.println("Nome: " + funcionario.get(cont).getNome());
            System.out.println("Salario: " + funcionario.get(cont).getSal());
            System.out.println("Email: " + funcionario.get(cont).getEmail());
            System.out.println("____________________________________________________");
        }

        Integer pesquisa = 0;

        System.out.println("Consulte um funcionário digitando o seu código: ");
        pesquisa = sc.nextInt();

        sc.close();

        for (cont = 0; cont < 3; cont++) {
            if (pesquisa == funcionario.get(cont).getCod_func()) {
                System.out.println("Funcionário " + funcionario.get(cont).getNome() + " cadastrado.");
                System.out.println("Salário " + String.format("%.2f" ,funcionario.get(cont).getSal()));
                System.out.println("E-mail " + funcionario.get(cont).getEmail());

                break;
            }
        }

    }
}
