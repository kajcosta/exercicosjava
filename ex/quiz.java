package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class quiz
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, String> respostas = new HashMap<>();
        respostas.put("1", "Haikyuu");
        respostas.put("2", "Horymiya");
        respostas.put("3", "Romantic Killer");
        respostas.put("4", "Spy X family");
        respostas.put("5", "Tokyo Revenger");
        
        // Faz a pergunta e exibe o resultado associado à resposta
        System.out.println("Escolha uma das opções:  1 volei, 2 romance, 3 comedia romantica, 4 familiar,5  luta");
        String resposta = scanner.nextLine().toLowerCase();
        String resultado = respostas.get(resposta);
        
        if (resultado != null) {
            System.out.println("Anime recomendado: " + resultado);
        } else {
            System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
}

 