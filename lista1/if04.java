import java.util.Scanner;

public class if04 {

    private static String calculate(Integer value, Integer time) {
        if (time >= 5) {
            if (value > 5000) {
                return "20%%.";
            } else {
                if (value > 1000) {
                    return "10%%.";
                } else {
                    return "SEM DESCONTO";
                }
            }
        } else {
            return "SEM DESCONTO";
        }
    }
    public static void main(String[] args) { 
        Integer time;
        Integer value;

        System.out.println("INFORME O TEMPO DE FIDELIDADE:");
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();

        System.out.println("INFORME O VALOR GASTO NA COMPRA:");
        value = sc.nextInt();

        System.out.println(calculate(value, time));

        sc.close();
    }
}
