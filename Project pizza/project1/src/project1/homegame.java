package project1;

import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class homegame extends JPanel {

    private ImageIcon feild = new ImageIcon(this.getClass().getResource("pizzahut.jpg"));
    private ImageIcon exit = new ImageIcon(this.getClass().getResource("exit.png"));
    private ImageIcon exit1 = new ImageIcon(this.getClass().getResource("exit1.png"));
    private ImageIcon starts = new ImageIcon(this.getClass().getResource("start.png"));
    private ImageIcon starts1 = new ImageIcon(this.getClass().getResource("start1.png"));
    private ImageIcon how = new ImageIcon(this.getClass().getResource("how.png"));
    private ImageIcon how1 = new ImageIcon(this.getClass().getResource("how1.png"));
    public JButton BStart = new JButton(starts);
    public JButton BExit1 = new JButton(exit);
    public JButton BHow = new JButton(how);

    homegame() {
        setLayout(null);
        BExit1.setOpaque(false);
        BExit1.setContentAreaFilled(false);
        BExit1.setBorderPainted(false);
        BExit1.setBounds(20, 500, 300, 75);
        add(BExit1);
        BExit1.setRolloverIcon(exit1);
        
        BHow.setOpaque(false);
        BHow.setContentAreaFilled(false);
        BHow.setBorderPainted(false);
        BHow.setBounds(20, 400, 300, 75);
        add(BHow);
        BHow.setRolloverIcon(how1);
        
        BStart.setOpaque(false);
        BStart.setContentAreaFilled(false);
        BStart.setBorderPainted(false);
        BStart.setBounds(20, 300, 300, 75);
        add(BStart);
        BStart.setRolloverIcon(starts1);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(feild.getImage(), 0, 0, 1000,800, this);
        g.setColor(Color.orange);
        g.setFont(new Font("Blisk Rhythm - Personal Use", Font.CENTER_BASELINE, 200));
        g.drawString("HOLY PIZZA", 250, 90);
    }
}
