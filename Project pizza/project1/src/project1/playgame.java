package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class playgame extends JFrame implements ActionListener {

    homegame homegame1 = new homegame();
    playstate1 state1 = new playstate1();
    howtoplay htp = new howtoplay();
    gameover over = new gameover();
    public playgame() {
        this.setSize(1000,800);
        this.add(homegame1);
        homegame1.BExit1.addActionListener(this);
        homegame1.BHow.addActionListener(this);
        homegame1.BStart.addActionListener(this);
        htp.BBack.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == homegame1.BStart) {
            this.setLocationRelativeTo(null);
            this.remove(homegame1);
            this.setSize(1000,800);
            this.add(state1);
            state1.requestFocusInWindow();
        } 
        else if(e.getSource()== homegame1.BHow){
            this.setLocationRelativeTo(null);
            this.remove(homegame1);
            this.setSize(1000,800);
            this.add(htp);
            htp.requestFocusInWindow();
        }
        else if (e.getSource() == htp.BBack) 
        {
            this.remove(htp);
            this.setSize(1000,800);
            this.add(homegame1);
        }
        else if (e.getSource() == homegame1.BExit1) {
            System.exit(0);
        }
        this.validate();
        this.repaint();
    }

    public static void main(String[] args) {
        JFrame jf = new playgame();
        jf.setSize(1000,800);
        jf.setTitle("Holy Pizza");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}
