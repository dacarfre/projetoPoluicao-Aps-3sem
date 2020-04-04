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
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblSoluo = new JLabel("Solu\u00E7\u00E3o");
		lblSoluo.setBackground(new Color(0, 153, 204));
		lblSoluo.setForeground(new Color(255, 255, 255));
		lblSoluo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoluo.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblSoluo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextPane txtSolucao = new JTextPane();
		txtSolucao.setForeground(new Color(255, 255, 255));
		txtSolucao.setText(_solucaoController.getDescricao());
		txtSolucao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSolucao.setEditable(false);
		txtSolucao.setBackground(new Color(0, 153, 204));
		panel.add(txtSolucao);
	}

}
