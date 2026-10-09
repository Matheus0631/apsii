import java.util.*;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + "\n");

        for (Aluguel aluguel : alugueis) {
            resultado.append("\t")
                    .append(aluguel.getFita().getTitulo())
                    .append("\t")
                    .append(aluguel.getValor())
                    .append("\n");
        }

        resultado.append("Valor total devido: ").append(getValorTotal()).append("\n");
        resultado.append("Você ganhou ").append(getPontosTotais()).append(" pontos de alugador frequente");
        return resultado.toString();
    }

    private double getValorTotal() {
        double total = 0;
        for (Aluguel a : alugueis) {
            total += a.getValor();
        }
        return total;
    }

    private int getPontosTotais() {
        int pontos = 0;
        for (Aluguel a : alugueis) {
            pontos += a.getPontos();
        }
        return pontos;
    }
}