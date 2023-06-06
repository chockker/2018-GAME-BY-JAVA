package project1;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Project1 {

    public static void main(String[] args) {
           JFrame jf = new playgame();
            jf.setSize(1000,800);
            jf.setTitle("Holy Pizza");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);
    }

}
