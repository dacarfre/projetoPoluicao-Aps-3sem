package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controller.IndexController;
import controller.RankController;
import enums.Ranks;

import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class RankForm extends JFrame {

	private JPanel contentPane;
	
	private JTable tbRank;
	
	private RankController _rankController;

	/**
	 * Create the frame.
	 */
	public RankForm(Ranks rank) {
		setResizable(false);
		_rankController= new RankController(rank);
		createFrame();
	}
	public void createFrame() {		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		tbRank = _rankController.getTabela();
		tbRank.setVisible(true);
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(tbRank);
        this.getContentPane().add(scroll);
		
		JLabel lblTitulo = new JLabel(_rankController.getTituloRank());
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
	}

}
