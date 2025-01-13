import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AsosiyOyna extends JFrame implements ItemListener {
    public AsosiyOyna(){
        setDefaultCloseOperation(3);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);
        AsosiyPanel panel=new AsosiyPanel();
        setContentPane(panel);

    }




    public void itemStateChanged(ItemEvent e) {

    }
}
