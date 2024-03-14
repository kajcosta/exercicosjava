package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class quiz
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, String> respostas = new HashMap<>();// um mapa que ja define de inicio 0 resultado da pergunta que vira 
        respostas.put("1", "Haikyuu");
        respostas.put("2", "Horymiya");
        respostas.put("3", "Romantic Killer");
        respostas.put("4", "Spy X family");
        respostas.put("5", "Tokyo Revenger");
        
        // Faz a pergunta e exibe o resultado associado à resposta
        System.out.println("Qual desses generos te chama mais atenção? (Coloque apenas o numero)");
        System.out.println("Escolha uma das opções:  1)esportes , 2)romance escolar, 3)comedia romantica, 4)espionagem ou 5)Viagem no tempo");// as alternativas
        String resposta = scanner.nextLine().toLowerCase();// lê a próxima linha de texto inserida pelo usuário no console. Esta linha de texto é armazenada na variável resposta.
        String resultado = respostas.get(resposta); // utiliza a resposta fornecida pelo usuário como chave para acessar o valor correspondente no mapa
        
        if (resultado != null) {//Se resultado não for nulo, o bloco de código dentro do if será executado. 
            System.out.println("Anime recomendado: " + resultado);
        } else {//Se não
            System.out.println("Opção inválida.");
        }
        
        scanner.close();// fecha o scanner
    }
}

 