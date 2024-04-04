import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Agenda> compromissos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("Informe a data do compromisso: ");
            String data = scanner.nextLine();
            System.out.println("Informe a hora do compromisso: ");
            int hora = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe a descrição do compromisso: ");
            String descricao = scanner.nextLine();

            compromissos.add(new Agenda(data, hora, descricao));

            System.out.println("Deseja adicionar mais compromissos? 0 - Sim | 1 - Não");
            opcao = scanner.nextInt();
            scanner.nextLine();
        } while (opcao == 0);

        System.out.println("Verificar data:");
        String data = scanner.nextLine();

        boolean encontrou = false;
        System.out.println("Compromissos encontrados na data:");
        for (Agenda compromisso : compromissos) {
            if (compromisso.getData().equals(data)) {
                System.out.println(compromisso);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum compromisso encontrado para a data informada.");
        }

        scanner.close();
    }
}