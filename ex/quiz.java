package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class quiz
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, String> respostas = new HashMap<>();
        respostas.put("volei", "Haikyuu");
        respostas.put("romance", "Horymiya");
        respostas.put("comedia romantica", "Romantic Killer");
        respostas.put("familiar", "Spy X family");
        respostas.put("luta", "Tokyo Revenger");
        
        // Faz a pergunta e exibe o resultado associado à resposta
        System.out.println("Escolha uma das opções: volei, romance, comedia romantica, familiar, luta");
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

 