package ex;

import java.util.Scanner;

public class Naruto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;

        System.out.println("Bem-vindo ao Quiz do Naruto!\n");

        // Pergunta 1
        System.out.println("1. Qual é o nome do protagonista de Naruto?");
        System.out.println("a) Sasuke Uchiha");
        System.out.println("b) Kakashi Hatake");
        System.out.println("c) Naruto Uzumaki");
        System.out.println("d) Sakura Haruno");
        System.out.println("e) Itachi Uchiha");
        System.out.print("Resposta: ");// ira imprimir a pergunta e as alternativas de uma vez
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("c")) {
            pontos++;
        }// Se responder c ira ganhar um ponto guardado em pontos

        // Pergunta 2
        System.out.println("\n2. Quem é o sensei da Equipe 7?");
        System.out.println("a) Tsunade");
        System.out.println("b) Jiraiya");
        System.out.println("c) Hiruzen Sarutobi");
        System.out.println("d) Minato Namikaze");
        System.out.println("e) Kakashi Hatake");
        System.out.print("Resposta: ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("e")) {
            pontos++;
        }// respondeu certo ganha mais um ponto guardando em pontos  

        // Pergunta 3
        System.out.println("\n3. Qual é o nome do vilão principal na série Naruto?");
        System.out.println("a) Orochimaru");
        System.out.println("b) Madara Uchiha");
        System.out.println("c) Pain");
        System.out.println("d) Kaguya Otsutsuki");
        System.out.println("e) Obito Uchiha");
        System.out.print("Resposta: ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("b")) {
            pontos++;
        }

        // Pergunta 4
        System.out.println("\n4. Qual é o nome da aldeia natal de Naruto?");
        System.out.println("a) Aldeia da Folha");
        System.out.println("b) Aldeia da Areia");
        System.out.println("c) Aldeia da Nuvem");
        System.out.println("d) Aldeia da Pedra");
        System.out.println("e) Aldeia da Cascata");
        System.out.print("Resposta: ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("a")) {
            pontos++;
        }

        // Pergunta 5
        System.out.println("\n5. Qual é o nome do Jutsu utilizado por Naruto que o transforma em uma raposa de nove caudas?");
        System.out.println("a) Rasengan");
        System.out.println("b) Chidori");
        System.out.println("c) Sharingan");
        System.out.println("d) Amaterasu");
        System.out.println("e) Bijuu Dama");
        System.out.print("Resposta: ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("e")) {
            pontos++;
        }

        // Pontuação final
        System.out.println("\nPontuação final: " + pontos + "/5");// somou os pontos e dividiu por 5 pois são 5 perguntas 

        // Resultado
        System.out.println("\nResultado:");
        if (pontos >= 0 && pontos <= 2) {
            System.out.println("Você precisa assistir mais Naruto!"); //de 0 a 2
        } else if (pontos == 3) {
            System.out.println("Você conhece algumas coisas sobre Naruto."); //3
        } else if (pontos == 4) {
            System.out.println("Quase um ninja experiente!"); //4
        } else {
            System.out.println("Parabéns! Você é um verdadeiro fã de Naruto!"); //acertou tudo
        }
    }
}