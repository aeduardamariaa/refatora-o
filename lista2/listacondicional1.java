import java.util.Scanner;

public class listacondicional1 {
    public static void main(String[] args) {
        char sexo;
        String name;
        Integer idade = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        name = scanner.nextLine();
        
        System.out.println("Qual a sua idade:");
        idade = scanner.nextInt();

        System.out.println("Informe seu sexo(M - masculino / F - feminino):");
        sexo = scanner.next().charAt(0);

        System.out.println("O nome fornecido foi: " + name);
        System.out.println("A idade fornecida foi: " + idade);
        System.out.println("O sexo informado foi: " + sexo);

        if (sexo == 'M') {
            if (idade >= 18 && idade <= 65) {
                System.out.println(name + " esta compreendido(a) entre 18 e 65 anos de idade e e do sexo masculino");
            }
        } else {
            System.out.println(name + " ou nao esta entre 18 e 65 anos de idade e/ou nao e masculino");
        }

        scanner.close();
    }
}

