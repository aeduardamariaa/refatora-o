public class EX4 {
    public static void main(String[] args) {
        Integer[][] mat1 = new Integer[4][4];
        Integer l, c, soma = 0, valor = 1;  
        
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                mat1[l][c] = valor;
                valor *=2;

                soma+=mat1[l][c];
            }
        }

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
               System.out.print("| " + mat1[l][c] + " |");
            }
            System.out.println();
        }

        System.out.println("A soma da matriz é: " + soma);
    }
}
