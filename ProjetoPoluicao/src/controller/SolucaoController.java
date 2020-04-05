package controller;

import javax.swing.JOptionPane;

import util.LeitorArquivo;

public class SolucaoController {
	
public SolucaoController() {
	try {
		LeitorArquivo leitorArquivo= new LeitorArquivo();
		
		String texto= leitorArquivo.lerTexto("src/assets/solucao.txt");
		
		this.descricao= texto;
		
	} catch (Exception ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
}	
	
private String descricao;

public String getDescricao() {
	return this.descricao;
}


}
