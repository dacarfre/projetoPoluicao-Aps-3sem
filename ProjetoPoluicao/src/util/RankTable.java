package util;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class RankTable extends JTable {
	public RankTable(DefaultTableModel tableModel) {
		super(tableModel);
		this.createTable();
	}

	public RankTable(Object[][] dados, Object[] colunas) {
		super(dados, colunas);
		this.createTable();
	}
	
	private void createTable() {	
		this.getTableHeader().setReorderingAllowed(false);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

}
