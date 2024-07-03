import java.util.Scanner;

public class struct{
    public static void main(String[] args) {
        fichaAluno aluno = new fichaAluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código");
        aluno.setCodigo(sc.nextInt());

        System.out.println("Informe o nome");
        aluno.setNome(sc.next());

        System.out.println("Informe o telefone");
        aluno.setTelefone(sc.nextInt());

        System.out.println("Informe o email");
        aluno.setEmail(sc.next());

        sc.close();

        System.out.println("******************");
        System.out.println("******************");

        System.out.println(aluno.getCodigo());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getTelefone());
        System.out.println(aluno.getEmail());

    }
}
