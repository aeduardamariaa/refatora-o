
import java.util.Scanner;

public class listamold1 {
    public static void main(String[] args) {
        Float precolitro = 0f, valorpgto = 0f, res = 0f;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = sc.next();

        System.out.println("Informe o valor por litro da gasolina:");
        precolitro = sc.nextFloat();

        System.out.println("Informe o valor de pagamento:");
        valorpgto = sc.nextFloat();

        sc.close();

        res = calculo(precolitro, valorpgto);

        System.out.println(nome + " você vai abastecer " + String.format("%.3f", res) + " litros de gasolina.");
    }

    static Float calculo(Float p_precolitro, Float p_valorpgto) {
        Float res = 0f;
        res = p_valorpgto / p_precolitro;
        
        return res;
    }
}
    

