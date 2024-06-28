package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vetmatricula {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matricula mat = new Matricula();
        
        for(int i=0; i < 5 ; i++) {
            System.out.println("DIGITE O NUMERO PARA CADASTRO DA MATRICULA: ");
            mat.realizarMatricula(sc.nextInt());
        }
        
        System.out.println("INFORME A MATRÍCULA PARA CONSULTA:");
        
        if (mat.buscarMatricula(sc.nextInt())) {
            System.out.println("MATRICULA ENCONTRADA");
        } else  {
            System.out.println("MATRICULA NÃO ENCONTRADA");
        }

        sc.close();
    }
}

class Matricula {
    private List<Integer> matriculas = new ArrayList<>();

    public void realizarMatricula(Integer matricula) {
        matriculas.add(matricula);
    }

    public boolean buscarMatricula(Integer matricula) {
        return matriculas.contains(matricula);
    }
}