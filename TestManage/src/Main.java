import javax.swing.*;
import java.awt.*;

public class Main extends JFrame  {
    private AsosiyPanel panel;
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        getContentPane().setBackground(Color.decode("#D8BDFF"));
        setLocationRelativeTo(null);
        setVisible(true);

        GridLayout layout = new GridLayout(3, 1);
        layout.setVgap(8);
        setLayout(layout);

        panel = new AsosiyPanel("Nega shimolda qo'ylar yashamaydi", "Sovuq", "Bilmayman"
                , "Hammasi to'g'ri");
        add(panel);
        AsosiyPanel panel1 = new AsosiyPanel("O'zbekistonda gaz,suv hattoki elektr toki tugasa ham Dalbayoplar tugamaydi nega"
                , "Chunki o'zbekiston dalbayoplar davlati", "Bilmayman"
                , "Hammasi to'g'ri");
        add(panel1);


    }







    public static void main(String[] args) {
        new Main();
    }






    }

