public class Aluguel {
	private int diasAlugada;
	private Fita fita;

	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}

	public Fita getFita() {
		return fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}

	public double getValor() {
		double valor = 0;
		switch (fita.getCodigoDePreco()) {
			case Fita.NORMAL:
				valor += 2;
				if (diasAlugada > 2)
					valor += (diasAlugada - 2) * 1.5;
				break;
			case Fita.LANCAMENTO:
				valor += diasAlugada * 3;
				break;
			case Fita.INFANTIL:
				valor += 1.5;
				if (diasAlugada > 3)
					valor += (diasAlugada - 3) * 1.5;
				break;
		}
		return valor;
	}

	public int getPontos() {
		if ((fita.getCodigoDePreco() == Fita.LANCAMENTO) && diasAlugada > 1) {
			return 2;
		}
		return 1;
	}
}