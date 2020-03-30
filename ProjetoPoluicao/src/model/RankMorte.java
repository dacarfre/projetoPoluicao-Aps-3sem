package model;

public class RankMorte extends Rank {
	public RankMorte(int posicao,float quantidade,String pais, int mortes) {
		// TODO Auto-generated constructor stub
	}
	
	private String pais;
	private int mortes;
	
	//Getters e Setters
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getMortes() {
		return mortes;
	}
	public void setMortes(int mortes) {
		this.mortes = mortes;
	}
}
