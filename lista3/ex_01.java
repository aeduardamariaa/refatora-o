import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu código: ");
        int cod = sc.nextInt();

        System.out.println("Quantidade de horas normais: ");
        float h_normais = sc.nextFloat();

        System.out.println("Quantidade de horas extras: ");
        float h_extra = sc.nextFloat();

        sc.close();

        Salario sal = new Salario(h_normais, h_extra);
        float bruto = sal.sal_bruto();
        float liquido = sal.sal_liquido();

        ex_01.imprime(cod, h_normais, h_extra, bruto, liquido);
    }

    private static void imprime(int cod, float normal, float extra, float bruto, float liquido) {
        System.out.println("O funcionário " + cod + " recebeu " + normal + " horas normais e " + extra + " horas extras.");
        System.out.println("Irá receber " + bruto + " reais e terá " + liquido + " reais líquidos.");
    }
}

class Salario {

    private float horasn, horase;

    public Salario(float horasNormais, float horasExtras) {
        this.horasn = horasNormais;
        this.horase = horasExtras;
    }

    public float sal_bruto() {
        float total_normal = this.horasn * 12f;
        float total_extra = this.horase * 15.50f;
        float bruto = total_extra + total_normal;
        return bruto;
    }

    public float sal_liquido() {
        float bruto = sal_bruto();
        float liquido = bruto * 0.1f;
        liquido = bruto - liquido;
        return liquido;
    }
}
