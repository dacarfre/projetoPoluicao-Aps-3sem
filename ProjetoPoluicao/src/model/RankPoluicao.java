package model;

public class RankPoluicao extends Rank {
	public String cidade;
	public float poluicao;
	
	//Getters e Setters
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public float getPoluicao() {
		return poluicao;
	}
	public void setPoluicao(float poluicao) {
		this.poluicao = poluicao;
	}
}
