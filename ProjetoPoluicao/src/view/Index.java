package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.IndexController;
import util.ContentPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;

public class Index extends JFrame {
	

	public static JPanel contentPane;
	
	public JButton btnResumo;
	public JButton btnRankPoluicao;
	public JButton btnRankMorte;
	public JButton btnSolucao;
	
	public static JFormattedTextField txtDtNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 300);
		contentPane = new ContentPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		

		//Resumo
		
		JLabel lblResumo =  new JLabel("Ler resumo:");
		lblResumo.setForeground(new Color(230, 230, 250));
		lblResumo.setHorizontalAlignment(SwingConstants.CENTER);
		lblResumo.setFont(new Font("Arial", Font.BOLD, 16));
		lblResumo.setBounds(0, 0, 125, 19);
		contentPane.add(lblResumo);
		
		btnResumo = new JButton("Resumo");
		btnResumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		btnResumo.setBounds(130, 0, 223, 30);
		contentPane.add(btnResumo);
		
		//RankMorte
		
		JLabel lblRankMorte =  new JLabel("Rank de mortes:");
		lblRankMorte.setForeground(new Color(230, 230, 250));
		lblRankMorte.setHorizontalAlignment(SwingConstants.CENTER);
		lblRankMorte.setFont(new Font("Arial", Font.BOLD, 16));		
		
		btnRankMorte = new JButton("Rank Morte");
		btnRankMorte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		//Layout
		lblRankMorte.setBounds(0, 30, 125, 19);
		contentPane.add(lblRankMorte);
		
		btnRankMorte.setBounds(130, 30, 223, 30);
		contentPane.add(btnRankMorte);
		
		//RankPoluicao
		
		JLabel lblRankPoluicao =  new JLabel("Rank de poluição:");
		lblRankPoluicao.setForeground(new Color(230, 230, 250));
		lblRankPoluicao.setHorizontalAlignment(SwingConstants.CENTER);
		lblRankPoluicao.setFont(new Font("Arial", Font.BOLD, 16));
		
		
		btnRankPoluicao = new JButton("Rank Poluição");
		btnRankPoluicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		//Layout
		lblRankPoluicao.setBounds(0, 60, 125, 19);
		contentPane.add(lblRankPoluicao);
		
		btnRankPoluicao.setBounds(130, 60, 223, 30);
		contentPane.add(btnRankPoluicao);
		
		
		//Solucao
		
		JLabel lblSolucao =  new JLabel("Soluções:");
		lblSolucao.setForeground(new Color(230, 230, 250));
		lblSolucao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolucao.setFont(new Font("Arial", Font.BOLD, 16));
		
		
		btnSolucao = new JButton("Solução");
		btnSolucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		//Layout
		lblSolucao.setBounds(0, 90, 125, 19);
		contentPane.add(lblSolucao);
		
		btnSolucao.setBounds(130, 90, 223, 30);
		contentPane.add(btnSolucao);
		
		
		
		
	}
}