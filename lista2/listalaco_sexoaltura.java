import java.util.Scanner;

public class listalaco_sexoaltura {
    public static void main(String[] args) {
        Integer i, qttmulher = 0;
        Integer[] genero = new Integer[4];
        Float maioralt = 0f, somaaltura = 0f, menoralt = 999f, mediaaltmulher, medaltturma, somamulher = 0f;
        Float[] altura = new Float[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("######################");
        System.out.println("       Análise de fichas");
        System.out.println("######################");

        for (i = 0; i < 4; i++) {
            System.out.println("--------------------");
            System.out.println((i + 1) + "- Qual seu gênero (1 - Masculino / 2 - Feminino):");
            genero[i] = sc.nextInt();

            System.out.println((i + 1) + " - Insira sua altura:");
            altura[i] = sc.nextFloat();
            somaaltura+= altura[i];

            if(genero[i] == 2) {
                somamulher += altura[i];
                qttmulher++;
            }
        }

        sc.close();

        //Média altura apenas das mulheres
        mediaaltmulher = somamulher / qttmulher;

        //Verifica qual a maior altura
        for(i = 0; i < 4; i++) {
            if(altura[i] > maioralt) {
                maioralt = altura[i];
            }
        }

        //Verifica qual a menor altura
        for(i = 0; i < 4; i++) {
            if(altura[i] < menoralt) {
                menoralt = altura[i];
            }
        }

        medaltturma = somaaltura / 4;

        System.out.println("######################");
        System.out.println("       RESULTADOS");
        System.out.println("######################");
        System.out.println("A média de altura das mulheres é: " + String.format("%.2f", mediaaltmulher));
        System.out.println("A menor altura é: " + String.format("%.2f", menoralt));
        System.out.println("A maior altura é: " + String.format("%.2f", maioralt));
        System.out.println("A média de altura é: " + String.format("%.2f", medaltturma));

    }
}
