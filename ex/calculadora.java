import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação:\n1. Adicionar horas\n2. Subtrair horas\n3. Sair");
            int escolha = scanner.nextInt();

            if (escolha == 3) {
                System.out.println("Encerrando a calculadora de horas. Até mais!");
                break;
            }

            System.out.println("Digite o primeiro horário (hh:mm):");
            String hora1 = scanner.next();

            System.out.println("Digite o segundo horário (hh:mm):");
            String hora2 = scanner.next();

            LocalTime time1 = LocalTime.parse(hora1, DateTimeFormatter.ofPattern("HH:mm")).plusHours(2);
            LocalTime time2 = LocalTime.parse(hora2, DateTimeFormatter.ofPattern("HH:mm"));

            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + time1.plusHours(time2.getHour()).plusMinutes(time2.getMinute()).format(DateTimeFormatter.ofPattern("HH:mm")));
                    break;
                case 2:
                    System.out.println("Resultado: " + time1.minusHours(time2.getHour()).minusMinutes(time2.getMinute()).format(DateTimeFormatter.ofPattern("HH:mm")));
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        }
    }
}