import java.util.Scanner;

public class tabuadaqualquernum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número que deseja ver a tabuada: ");
        Tabuada.tabuada(sc.nextInt());

        sc.close();
    }
}

class Tabuada {
    public static void tabuada(int num) {
        for(int i = 1; i <= 10; i++ ){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
