package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class Resumo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resumo frame = new Resumo();
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
	public Resumo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Resumo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane txtpnPorPoluioEntendese = new JTextPane();
		txtpnPorPoluioEntendese.setEditable(false);
		txtpnPorPoluioEntendese.setBackground(SystemColor.control);
		txtpnPorPoluioEntendese.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnPorPoluioEntendese.setText("Por polui\u00E7\u00E3o entende-se a introdu\u00E7\u00E3o pelo homem, direta ou indiretamente, de subst\u00E2ncias ou energia no ambiente, provocando um efeito negativo no seu equil\u00EDbrio, causando assim danos \u00E0 sa\u00FAde humana, aos seres vivos e aos ecossistemas.[1]");
		txtpnPorPoluioEntendese.setBounds(61, 21, 250, 227);
		panel.add(txtpnPorPoluioEntendese);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("Por polui\u00E7\u00E3o entende-se a introdu\u00E7\u00E3o pelo homem, direta ou indiretamente, de subst\u00E2ncias ou energia no ambiente, provocando um efeito negativo no seu equil\u00EDbrio, causando assim danos \u00E0 sa\u00FAde humana, aos seres vivos e aos ecossistemas.[1]");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(353, 21, 250, 227);
		panel.add(textPane);
	}
}
