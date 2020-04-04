package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import enums.Ranks;
import model.Rank;
import model.RankMorte;
import util.LeitorArquivo;
import util.RankTable;
import view.RankForm;

public class RankController {
	private Ranks rank;

	public RankController(Ranks rank) {
		this.rank = rank;
	}

	public String getTituloRank() {
		return this.rank.getTitulo();
	}

	public JTable getTabela() {
		LeitorArquivo leitor = new LeitorArquivo();
		String json = "";

		switch (rank) {
		case RANK_MORTE: {
			json = leitor.lerCSV("Localização do .csv com dados de Morte");
		}
		case RANK_POLUICAO: {
			json = leitor.lerCSV("Localização do .csv com dados de Poluição");
		}
		}
						
		DefaultTableModel tableModel = getTableModel("");
		RankTable rankTable = new RankTable(tableModel);
		
		return rankTable;
	}

	private DefaultTableModel getTableModel(String json) {
		// Deserializar json para Lista da classe Rank	
		
		List<Rank> ranks= new ArrayList<Rank>();
		
		
		Object colunas[] = { "posicao", "pais", "mortes" };
		
		String dados[][] = Arrays.stream(colunas)
				.toArray(String[][]::new);
		
		//Object dados[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
		//{ "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
		
		DefaultTableModel tableModel = new DefaultTableModel(dados, colunas);
		
		return tableModel;

	}

}
