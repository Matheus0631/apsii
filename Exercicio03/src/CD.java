package src;

public class CD extends Produto implements InfoGerais {
    private int numFaixas;

    public int getNumFaixas(){
        return numFaixas;
    }

    public void setNumFaixas(int num) {
        this.numFaixas = num;
    }

    @Override
    public void exibeInformacoes() {
        System.out.println("\n--- Informações do CD ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Número de faixas: " + numFaixas);    }
}
