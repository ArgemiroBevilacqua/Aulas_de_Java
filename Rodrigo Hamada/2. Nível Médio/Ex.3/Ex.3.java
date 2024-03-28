import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Compromisso> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        this.compromissos.add(compromisso);
    }

    public List<Compromisso> getCompromissosPorData(LocalDateTime data) {
        List<Compromisso> compromissosDoDia = new ArrayList<>();
        for (Compromisso compromisso : compromissos) {
            if (compromisso.getDataHora().toLocalDate().equals(data.toLocalDate())) {
                compromissosDoDia.add(compromisso);
            }
        }
        return compromissosDoDia;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();


        Compromisso compromisso1 = new Compromisso(LocalDateTime.of(2023, 12, 1, 10, 0), "Reunião com equipe");
        Compromisso compromisso2 = new Compromisso(LocalDateTime.of(2023, 12, 2, 14, 0), "Consulta médica");
        Compromisso compromisso3 = new Compromisso(LocalDateTime.of(2023, 12, 1, 15, 0), "Aula de yoga");


        agenda.adicionarCompromisso(compromisso1);
        agenda.adicionarCompromisso(compromisso2);
        agenda.adicionarCompromisso(compromisso3);


        LocalDateTime dataEspecifica = LocalDateTime.of(2023, 12, 1);
        List<Compromisso> compromissosDoDia = agenda.getCompromissosPorData(dataEspecifica);


        System.out.println("Compromissos para " + dataEspecifica.toLocalDate() + ":");
        for (Compromisso compromisso : compromissosDoDia) {
            System.out.println("- " + compromisso.getDescricao() + " (" + compromisso.getDataHora().toLocalTime() + ")");
        }
    }
}

public class Compromisso {

    private LocalDateTime dataHora;
    private String descricao;

    public Compromisso(LocalDateTime dataHora, String descricao) {
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }
}
