import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Agenda> compromissos;
    private int hora;
    private String data, descricao;

    public Agenda(String data, int hora, String descricao) {
        this.compromissos = new ArrayList<>();
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public void adicionarCompromisso(Agenda compromisso) {
        compromissos.add(compromisso);
    }

    public String getData() {
        return data;
    }

    public boolean verCompromissos(String data) {
        for (Agenda compromisso : compromissos) {
            if (compromisso.getData().equals(data)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Data: " + data + ", Hora: " + hora + ", Descrição: " + descricao;
    }
}