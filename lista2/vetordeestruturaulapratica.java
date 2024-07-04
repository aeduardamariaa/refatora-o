import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vetordeestruturaulapratica {

    static final int TAM = 2;
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<Candidato>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < TAM ; i++ ) {
            System.out.println("Informe o codigo do candidato: ");
            int cod = sc.nextInt();
    
            System.out.println("Informe o salário:");
            float sal = sc.nextFloat();
    
            System.out.println("Informe o email: ");
            String email = sc.next();

            candidatos.add(new Candidato(cod, sal, email));
        }

        System.out.println("************************************************************");
       
        for (int i = 0; i < TAM; i++) {
            System.out.println("Canditado: " + i+1);
            System.out.println(candidatos.get(i).toString()); 
        }
        sc.close();
    }
}


class Candidato {
    private int codigo;
    private float salario;
    String email;

    public Candidato(int codigo, float salario, String email) {
        this.codigo = codigo;
        this.email = email;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Código: " + this.codigo + "\nSalário: " + this.salario + "\nEmail: " + this.email;
    }
}