package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ResumoController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.GridLayout;

public class ResumoForm extends JFrame {

	private final static ResumoController _resumoController = new ResumoController();

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ResumoForm() {
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

		JLabel lblNewLabel = new JLabel("Resumo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 153, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 204));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JTextPane txtpnPorPoluioEntendese = new JTextPane();
		txtpnPorPoluioEntendese.setForeground(new Color(255, 255, 255));
		txtpnPorPoluioEntendese.setEditable(false);
		txtpnPorPoluioEntendese.setBackground(new Color(0, 153, 204));
		txtpnPorPoluioEntendese.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnPorPoluioEntendese.setText(_resumoController.getDescricao());
		panel.add(txtpnPorPoluioEntendese);
	}
}
