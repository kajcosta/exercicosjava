import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação:\n1. Adicionar horas\n2. Subtrair horas\n3. Sair");
            int escolha = scanner.nextInt();// multipla escolha

            if (escolha == 3) {
                System.out.println("Encerrando a calculadora de horas. Até mais!"); /*Essan opção foi colocada primeira pois é a mais curta */
                break; //fim
            }

            System.out.println("Digite o primeiro horário (hh:mm):");
            String hora1 = scanner.next(); //guarda o primeiro horario em hora 1

            System.out.println("Digite o segundo horário (hh:mm):");
            String hora2 = scanner.next(); // guarda em hora 2

            LocalTime time1 = LocalTime.parse(hora1, DateTimeFormatter.ofPattern("HH:mm")).plusHours(2); /*para analisar uma string de tempo (hora1) em um formato específico ("HH:mm") e então adicionar duas horas a ela. */
            LocalTime time2 = LocalTime.parse(hora2, DateTimeFormatter.ofPattern("HH:mm"));

            switch (escolha)  /*O switch em Java é uma estrutura de controle que permite tomar decisões com base no valor de uma expressão*/{
                case 1:
                    System.out.println("Resultado: " + time1.plusHours(time2.getHour()).plusMinutes(time2.getMinute()).format(DateTimeFormatter.ofPattern("HH:mm"))); /* Se a opção escolhida for 1, o programa calculará a soma de time1 e time2 (representando horas e minutos), depois formatará o resultado para exibir apenas as horas e os minutos e o imprimirá na tela. */
                    break;
                case 2:
                    System.out.println("Resultado: " + time1.minusHours(time2.getHour()).minusMinutes(time2.getMinute()).format(DateTimeFormatter.ofPattern("HH:mm"))); /*e a opção escolhida for 2, o programa calculará a subtração de time2 de time1 (representando horas e minutos), depois formatará o resultado para exibir apenas as horas e os minutos e o imprimirá na tela. */
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente."); /*Se a opção escolhida não for nem 1 nem 2, o programa imprimirá uma mensagem dizendo que a opção é inválida e pedirá ao usuário para escolher novamente. */
            }
        }
    }
}