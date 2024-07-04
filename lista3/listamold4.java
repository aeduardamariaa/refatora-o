import java.util.Scanner;

public class listamold4 {
    public static void main(String[] args) {
        float alt = 0, base = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME A MEDIDA LATERAL DO TERRENO: ");
        alt = sc.nextFloat();

        System.out.println("INFORME A BASE DO TERRENO: ");
         base = sc.nextFloat();

        System.out.println("Area = " + calculo(alt, base) + ", referente as medidas: " + alt + " e " + base);

        sc.close();
    }

    static float calculo(float p_alt, float p_base) {
        return p_alt * p_base;
    }
}
