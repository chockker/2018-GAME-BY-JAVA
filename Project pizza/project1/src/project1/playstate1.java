package project1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class playstate1 extends JPanel implements ActionListener {

    private final ImageIcon stage = new ImageIcon(this.getClass().getResource("pizzahut.jpg"));

    homegame hg = new homegame();
    ImageIcon feildover = new ImageIcon(this.getClass().getResource("pizzahut.jpg"));

    playstate1() {
        this.setFocusable(true);
        this.setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setLayout(null);
        g.drawImage(feildover.getImage(), 0, 0, 1000, 800, this);
        g.setColor(Color.orange);
        g.setFont(new Font("Blisk Rhythm - Personal Use", Font.CENTER_BASELINE, 200));
        g.drawString("HOLY PIZZA", 250, 90);
    }
}
