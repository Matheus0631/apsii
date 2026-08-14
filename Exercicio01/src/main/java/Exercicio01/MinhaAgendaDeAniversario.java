package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novoAniversariante = new Aniversariante(nome, dia, mes);
        this.aniversariantes.add(novoAniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomesDoDia = new ArrayList<>();

        for (Aniversariante a : this.aniversariantes) {
            DataAniversario data = a.getDataAniversario();
            if (data.getDia() == dia && data.getMes() == mes) {
                nomesDoDia.add(a.getNome());
            }
        }

        return nomesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = this.aniversariantes.size() - 1; i >= 0; i--) {
            if (this.aniversariantes.get(i).getNome().equalsIgnoreCase(nomeAniversariante)) {
                this.aniversariantes.remove(i);
            }
        }
    }

    public ArrayList<Aniversariante> getAniversariantes() {
        return aniversariantes;
    }
}