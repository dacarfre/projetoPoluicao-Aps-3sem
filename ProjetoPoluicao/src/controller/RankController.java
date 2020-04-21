package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import enums.Ranks;
import model.Rank;
import model.RankMorte;
import model.RankPoluicao;
import util.LeitorArquivo;
import util.Tables.MorteTableModel;
import util.Tables.PoluicaoTableModel;
import util.Tables.RankTable;
import util.Tables.RankTableModel;
import view.RankForm;

public class RankController {
	private Ranks _rank;

	public RankController(Ranks rank) {
		this._rank = rank;
	}

	public String getTituloRank() {
		return this._rank.getTitulo();
	}

	public JTable getTabela() throws Exception {
		LeitorArquivo leitor = new LeitorArquivo();
		String json = "";

		switch (_rank) {
		case RANK_MORTE:
			json = leitor.lerCSV("/bin/assests/dadosMorte.csv");
			break;
		case RANK_POLUICAO:
			json = leitor.lerCSV("/bin/assests/dadosPoluicao.csv");
			break;
		}

		RankTableModel tableModel = getTableModel();
		
		/* Demonstra��o de uma ideia doq fazer quando pegar os ArrayList >est� incompleto<
		 * ArrayList<Rank> ranksCSV= getDados(json); 
		 * 
		 * for (Rank rank : ranksCSV) {
		 * rank = new RankMorte(1, "Brasil", 20); 
		 * rank = new RankPoluicao(0,"S�o Paulo", 0);
		 * tableModel.addRank(rank); 
		 * }
		 * 
		 */
		
		//ERRO: N�o est� inserindo a posi��o dos ranks
		
		//Parte que ser� retirada depois{
		Rank rank=null;
		switch (_rank) {
		case RANK_MORTE:
			rank = new RankMorte(1, "Brasil", 20);
			break;
		case RANK_POLUICAO:
			rank = new RankPoluicao(1, "S�o Paulo", 0);
			break;
		}
		tableModel.addRank(rank);
		//}

		RankTable rankTable = new RankTable(tableModel);
		return rankTable;
	}

	private RankTableModel getTableModel() {
		RankTableModel rankTableModel = null;
		switch (_rank) {
		case RANK_MORTE:
			rankTableModel = new MorteTableModel();
			break;
		case RANK_POLUICAO:
			rankTableModel = new PoluicaoTableModel();
			break;
		}

		return rankTableModel;
	}

	private ArrayList<Rank> getDados(String json) {
		// **Deserializar json para Lista da classe Rank
		// ArrayList<Rank> ranks= new ArrayList<Rank>();
		// ArrayList<Rank> ranks= new ArrayList<RankMorte>();
		// ArrayList<Rank> ranks= new ArrayList<RankPoluicao>();

		return new ArrayList<Rank>();
	}

}
