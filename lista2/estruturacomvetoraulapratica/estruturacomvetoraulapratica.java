package estruturacomvetoraulapratica;

import java.util.Scanner;

public class estruturacomvetoraulapratica {
    public static void main(String[] args) {
        tipoFuncionario func = new tipoFuncionario();
        Float salAno = 0f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o codigo do funcionario:");
        func.setNumero(scanner.nextInt());

        System.out.println("Informe o nome do funcionario");
        func.setNome(scanner.next());

        for (int j = 0; j < 12; j++) {
            System.out.println("Informe o salario do mes "+ (j+1));
            func.setSalarioMes(scanner.nextFloat());

            salAno += func.getSalarioMes().get(j);
        }

        func.setSalarioAno(salAno);

        System.out.println("*************************");
        System.out.println("*************************");

        System.out.println("O codigo do funcionario e " + func.getNumero());
        System.out.println("O nome do funcionario e: " + func.getNome());

        for (int i = 0; i < 12; i++) {
            System.out.println("Recebe no mes " + (i+1) + ": R$" + func.getSalarioMes().get(i));
        }

        System.out.println("O salario anual e " + func.getSalarioAno());

        scanner.close();
    }    
}
