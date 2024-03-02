package ex;

import java.util.Scanner;

public class boletim { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]notas = new int[4];
        boolean notaValida; 
        for (int i = 0; i < 4 ; i++){ 
         notaValida= false;
            while (!notaValida) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int nota =scanner.nextInt();
                if( nota >= 0 && nota <=10){
                    notas[i] = nota; 
                    notaValida = true;}
                  else { 
                    System.out.println("Por favor retorne um número inteiro entre 0 a 10");
                 }
            }
         }
         int soma = 0; 
                
                for ( int nota : notas) { 
              soma+= nota; 
              double mediaFinal = soma / 4.0; {
        
              if (mediaFinal < 6){ 
                System.out.println("REPROVADO");}
              else if (mediaFinal == 6){
              System.out.println("PASSOU NA MÉDIA");}
              else {
                System.out.println("APROVADO");  }
          }
      }
    }
  }
