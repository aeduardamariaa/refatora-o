import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class busca1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int qtde = 0;
        
        for(int cont = 0; cont < 10; cont++ ) {
            System.out.println("Informe o " + (cont+1) + "º número: ");
            list.add(sc.nextInt());
        }

        System.out.println("Informe o valor que deseja procutar: ");
        Integer busca = sc.nextInt();

        for (Integer num : list) {
            if (num.equals(busca))
                qtde++;
        }
        
        System.out.println("Número "+busca+ " encontrado "+ qtde + " vezes.");
        
    }
}
