import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class whilepratica05 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura da pessoa: ");
        float altura = sc.nextFloat();

        while (altura > 0) {
            System.out.println("Informe o sexo da pessoa: \n(M)Homens\n(F)Mulheres");
            String sexo = sc.next();

            Pessoa pessoa = new Pessoa(altura, sexo);
            pessoas.add(pessoa);

            System.out.println("Seu peso ideal é: " + pessoa.getPesoIdeal());

            System.out.println("Informe a altura da pessoa: ");
            altura = sc.nextFloat();
        }

        System.out.println(pessoas.size() + " pessoas participaram!");
        sc.close();
    }
}

class Pessoa {
    private float altura;
    private String sexo;
    private float peso_ideal;

    public Pessoa(float altura, String sexo) {
        this.altura = altura;
        this.sexo = sexo;
        calculaPeso();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPesoIdeal() {
        return this.peso_ideal;
    }

    private void calculaPeso() {
        this.peso_ideal =  (sexo.toUpperCase().equals("M")) ? (float)((72.7*altura)-58) : (float)((62.1*altura-44.7));
    }
}