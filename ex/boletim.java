package ex;

import java.util.Scanner;

public class boletim { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //permite a leitura de entrada do usuário a partir do console 
        int[]notas = new int[4];//notas armazena 5 valores inteiros 
        boolean notaValida; // declarar ea variavel como verdadeira ou falso 
        for (int i = 0; i < 4 ; i++){ //define no inicio que o i=0, serão 5 e a cada i que for adicionado ele somara 
         notaValida= false;// em primeiro instante a notaValida e declarada como falsa
            while (!notaValida) {// while  utilizada para criar um loo, aqui a notaValida passa a ser verdadeiora pois o ! inverte o valor  boleano
            System.out.print("Digite o " + (i + 1) + "º número: "); //ex: digite o 1º numero]
            int nota =scanner.nextInt();//analisa os dados de entrada para encontrar um valor inteiro válido e retorna esse valor.
                if( nota >= 0 && nota <=10){// se nota for = ou maior que  e menor ou igual fara o  seguinte.
                    notas[i] = nota; //atribui o valor nota ao elemento indice da arrey notas
                    notaValida = true;  // então retorna verdadeiro 
                 }
                  else { //se a condição do if não for verdadeira ele se torna falsa e retorna a seguinte mensagem 
                    System.out.println("Por favor retorne um número inteiro entre 0 a 10");
                 }
            }
         }
         int soma = 0; //valor inicial do somar é 0
                
                for ( int nota : notas) { //aprimorou o loop que itera sobre cada elemento de um array (ou coleção) e atribui o valor de cada elemento a uma variável temporária definida na declaração do loop.
              soma+= nota; // a variavel nota agora é soma
              double mediaFinal = soma / 4.0; //calculo da media final
        
              if (mediaFinal < 6){ //primeiro caso
                System.out.println("REPROVADO");}
              else if (mediaFinal == 6){//segundo caso
              System.out.println("PASSOU NA MÉDIA");}
              else {//terceorp caso
                System.out.println("APROVADO");  }
          }
      }
    }
