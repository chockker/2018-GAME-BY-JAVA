package project1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class howtoplay extends JPanel {

    private ImageIcon ff = new ImageIcon(this.getClass().getResource("howto.jpg"));
    private ImageIcon back = new ImageIcon(this.getClass().getResource("back.png"));
    private ImageIcon back1 = new ImageIcon(this.getClass().getResource("back1.png"));
    public JButton BBack = new JButton(back);

    howtoplay() {
        setLayout(null);
        BBack.setOpaque(false);
        BBack.setContentAreaFilled(false);
        BBack.setBorderPainted(false);
        BBack.setBounds(350, 650, 300, 75);
        add(BBack);
        BBack.setRolloverIcon(back1);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(ff.getImage(), 0, 0, 1000, 800, this);
    }
}
