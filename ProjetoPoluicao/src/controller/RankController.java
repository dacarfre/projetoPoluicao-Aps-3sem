package controller;

import javax.swing.JTable;

import enums.Ranks;
import util.LeitorArquivo;
import util.RankTable;
import view.Rank;

public class RankController {
	public static JTable criarTabela(Ranks rank) {
		RankTable rankTable= new RankTable();
		LeitorArquivo leitor= new LeitorArquivo();
		
		switch (rank) {
		case RankMorte:{
			leitor.lerCSV("Localização do .csv com dados de Morte");
		}
		case RankPoluicao:{
			leitor.lerCSV("Localização do .csv com dados de Poluição");
		}
		}
		
		Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
		        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
		    Object columnNames[] = { "Column One", "Column Two", "Column Three" };
		    
		return rankTable;
	}
}
