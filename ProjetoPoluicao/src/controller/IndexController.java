package controller;

import enums.Ranks;
import view.RankForm;
import view.ResumoForm;
import view.SolucaoForm;

public class IndexController {
public void abrirResumo() {
	ResumoForm frmResumo = new ResumoForm();
	frmResumo.setVisible(true);
}

public void abrirRankPoluicao() {
	RankForm frmRank = new RankForm(Ranks.RANK_POLUICAO);
	frmRank.setVisible(true);
}

public void abrirRankMorte() {
	RankForm frmRank = new RankForm(Ranks.RANK_MORTE);
	frmRank.setVisible(true);
}

public void abrirSolucao() {
	SolucaoForm frmSolucao = new SolucaoForm();
	frmSolucao.setVisible(true);
}

}