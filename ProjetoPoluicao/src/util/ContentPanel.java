package util;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ContentPanel extends JPanel {
	 public ContentPanel() {
		super();
		this.setBackground(new Color(72, 61, 139));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
	}
}
