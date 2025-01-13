import javax.swing.*;
import java.awt.*;

public class AsosiyOyna extends JFrame {
private JButton []buttons=new JButton[10];
    public AsosiyOyna(){
        JFrame jFrame=new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,900);
        setLocationRelativeTo(null);
        setVisible(true);

        GridLayout layout=new GridLayout();
        layout.setColumns(4);
        layout.setRows(2);
        layout.setVgap(5);
        layout.setHgap(5);

        setLayout(layout);
        for (int i = 0; i <buttons.length ; i++) {
            buttons[i]=new JButton(String.valueOf(i));
add(buttons[i]);
            
        }
    }

}
