package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import enums.Ranks;
import util.ContentPanel;

public class Rank extends JFrame {
	public static JPanel contentPane;
	public static JButton btnVoltar;
	
	/**
	 * Create the frame.
	 */
	public Rank(Ranks rank) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 300);
		contentPane = new ContentPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(230, 230, 250));
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Arial", Font.BOLD, 16));
		lblNome.setBounds(12, 48, 116, 19);
		contentPane.add(lblNome);
		
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		
		btnVoltar.setBounds(49, 209, 223, 30);
		contentPane.add(btnVoltar);
		
	
	}
}
