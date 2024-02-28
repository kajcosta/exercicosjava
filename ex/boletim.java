package ex;

import java.util.Scanner;

public class boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a nota do primeiro bimestre?");
        int nota1 = scanner.nextInt();
        System.out.println("Qual a nota do segundo bimestre?");
        int nota2 = scanner.nextInt();
        System.out.println("Qual a nota do terceiro bimestre?");
        int nota3 = scanner.nextInt();
        System.out.println("Qual a nota do quarto bimestre?");
        int nota4 = scanner.nextInt();

        int mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");

    }
}