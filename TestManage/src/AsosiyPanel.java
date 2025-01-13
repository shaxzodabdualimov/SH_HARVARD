import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AsosiyPanel extends JPanel implements ItemListener , ActionListener {

    private String question;
    private String answerA;
    private String answerB;


    private String answerC;

    private JRadioButton aJavob;
    private JRadioButton bJavob;
    private JRadioButton cJavob;

    private JLabel savol;

    private JButton nextQues,finishQues;

    public AsosiyPanel(String question,String answerA,String answerB,String answerC){
        setPreferredSize(new Dimension(700,150));
        setBackground(Color.white);

        GridLayout layout=new GridLayout(5,1);
//        layout.setVgap(10);
        setLayout(layout);

        savol=new JLabel(question);
        savol.setFont(new Font("Serif",Font.PLAIN,16));
        add(savol);

        aJavob=new JRadioButton(answerA);
        aJavob.setPreferredSize(new Dimension(300,40));
        aJavob.setFont(new Font("Arial",Font.PLAIN,13));
        add(aJavob);
        bJavob=new JRadioButton(answerB);
        bJavob.setFont(new Font("Arial",Font.PLAIN,13));
        add(bJavob);
        cJavob=new JRadioButton(answerC);
        cJavob.setFont(new Font("Arial",Font.PLAIN,13));
        add(cJavob);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(aJavob);
        buttonGroup.add(bJavob);
        buttonGroup.add(cJavob);

        nextQues=new JButton("nextQuestion");
        finishQues=new JButton("Finish test");

       JPanel panel=new JPanel();
       GridLayout gridLayout=new GridLayout(1,2);
       panel.setLayout(gridLayout);
       panel.setPreferredSize(new Dimension(700,60));
       panel.setBackground(Color.white);

       panel.add(nextQues);
       panel.add(finishQues);
       add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }


    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
