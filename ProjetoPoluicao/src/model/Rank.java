package model;

public abstract class Rank {
	public Rank(int posicao) {
		this.setPosicao(posicao);
	}

	private int posicao;

	// Getters e Setters
	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
}
