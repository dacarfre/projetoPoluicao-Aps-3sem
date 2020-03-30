package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.IndexController;
import controller.SolucaoController;

import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SolucaoForm extends JFrame {

	private final static SolucaoController _solucaoController = new SolucaoController();

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public SolucaoForm() {
		setResizable(false);
		createFrame();
	}

	public void createFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTextPane txtSolucao = new JTextPane();
		txtSolucao.setText(_solucaoController.getDescricao());
		txtSolucao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSolucao.setEditable(false);
		txtSolucao.setBackground(SystemColor.menu);
		contentPane.add(txtSolucao, BorderLayout.CENTER);

		JLabel lblSoluo = new JLabel("Solu\u00E7\u00E3o");
		lblSoluo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoluo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblSoluo, BorderLayout.NORTH);
	}

}
