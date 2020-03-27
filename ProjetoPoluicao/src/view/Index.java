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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Index extends JFrame {
	

	public static JPanel contentPane;
	
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
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane);
		
		JPanel pnMenu = new JPanel();
		splitPane.setLeftComponent(pnMenu);
		pnMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Resumo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resumo frmResumo = new Resumo();
				frmResumo.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		pnMenu.add(btnNewButton);
		
		JLabel label_1 = new JLabel("");
		pnMenu.add(label_1);
		
		JButton btnNewButton_3 = new JButton("Rank de Mortes");
		pnMenu.add(btnNewButton_3);
		
		JLabel label = new JLabel("");
		pnMenu.add(label);
		
		JButton btnNewButton_2 = new JButton("Rank de Polui\u00E7\u00E3o");
		pnMenu.add(btnNewButton_2);
		
		JLabel label_2 = new JLabel("");
		pnMenu.add(label_2);
		
		JButton btnNewButton_1 = new JButton("Solu\u00E7\u00F5es");
		pnMenu.add(btnNewButton_1);
		
		JPanel pnHome = new JPanel();
		pnHome.setBackground(SystemColor.controlHighlight);
		splitPane.setRightComponent(pnHome);
		pnHome.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Polui\u00E7\u00E3o Mundial");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 43));
		pnHome.add(lblNewLabel, BorderLayout.CENTER);
		
		
      
		ImageIcon imgIcon = new ImageIcon(Index.class.getResource("/assets/img/Polui\u00E7\u00E3oBackground.jpg"));
		Image image = imgIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(349, 222,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
		imgIcon = new ImageIcon(newimg);
		
		
		
		
		
	}
}