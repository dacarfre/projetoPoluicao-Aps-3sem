package controller;

import util.LeitorArquivo;

public class SolucaoController {
	
public SolucaoController() {
	try {
		LeitorArquivo leitorArquivo= new LeitorArquivo();
		
		String texto= leitorArquivo.lerTexto("C:\\Users\\Lucas\\Desktop\\Projetcs-master\\projetoPoluicao-Aps-3sem\\ProjetoPoluicao\\src\\assets\\resumo.txt");
		
		this.descricao= texto;
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}	
	
private String descricao;

public String getDescricao() {
	return this.descricao;
}


}
