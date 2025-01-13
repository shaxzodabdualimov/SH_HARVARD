import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.AttributedCharacterIterator;
import java.util.Map;


public class AsosiyPanel extends JPanel implements ItemListener {
        private JCheckBox  FirstQuation1,FirstQuation2,FirstQuation3, SecondQuation1,SecondQuation2,SecondQuation3;
        private JLabel lblFirstQuation,lblSecondQuation;
        private JButton button;

        public AsosiyPanel() {

            super();
            setPreferredSize(new Dimension(400, 200));
            setBackground(Color.white);

            setLayout(new FlowLayout());

            Font font = new Font("Arial", Font.PLAIN, 18);


            //Name


            lblFirstQuation = new JLabel("Java was born in ...");
            lblFirstQuation.setFont(font);
            lblFirstQuation.setBounds(80, 100, 180, 40);
            add(lblFirstQuation);
            FirstQuation1 = new JCheckBox("1995-Years");
            FirstQuation2 = new JCheckBox("1984-Years");
            FirstQuation3 = new JCheckBox("1999-Years");
            add(FirstQuation1);
            add(FirstQuation2);
            add(FirstQuation3);

            lblSecondQuation = new JLabel(" is  Eva  Elfie  Teacher or who  ...");
            lblFirstQuation.setFont(font);
            lblSecondQuation.setBounds(80, 200, 180, 40);
            add(lblSecondQuation);
            SecondQuation1 = new JCheckBox("Teacher ");
            SecondQuation2 = new JCheckBox("HouseWife");
            SecondQuation3 = new JCheckBox("Shimara");
            add(SecondQuation1);
            add(SecondQuation2);
            add(SecondQuation3);

            ButtonGroup group=new ButtonGroup();
            group.add(FirstQuation1);
            group.add(FirstQuation2);
            group.add(FirstQuation3);
            group.add(SecondQuation1);
            group.add(SecondQuation2);
            group.add(SecondQuation3);


            button = new JButton("send date");
            button.addActionListener(event-> {



                        String BirinchiSavol = FirstQuation1.getText();
                        String IkkinchiSavol = SecondQuation3.getText();
                        if (FirstQuation1.isSelected() ) {
                            JOptionPane.showMessageDialog(null,"True answer");
                        } else if (SecondQuation3.isSelected()) {
                            JOptionPane.showMessageDialog(null, "True answer");
                        }else {
                            JOptionPane.showMessageDialog(null,"this answer false");
                        }


                    }

            );
            add(button);
        }

            public void itemStateChanged (ItemEvent event){


            }

        }



