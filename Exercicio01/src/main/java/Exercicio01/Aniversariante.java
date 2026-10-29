package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;
	
	//gets e sets...

	public Aniversariante(String nome, int dia, int mes){
		this.nome = nome;
		this.dataAniversari = new DataAniversario(dia, mes);
	}

	public Anivesariante(String nome, DataAniversario dataAniversario){
		this.nome = nome;
		this.dataAniversario = dataAniversari;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Aniversariante outro = (Aniversariante) obj;

		return Objects.equals(this.nome, outro.nome) &&
				Objects.equals(this.dataAniversario, outro.dataAniversario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		return dataAniversario;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

}
