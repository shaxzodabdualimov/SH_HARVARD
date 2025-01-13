import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe() {
        // Frame sozlamalari
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        // Textfield sozlamalari
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        // Title panel
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        // Button panel
        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        // Tugmalarni yaratish
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        // Panellarni qo‘shish
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        // O'yinni kim boshlashini aniqlash
        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i] && buttons[i].getText().equals("")) {
                if (player1_turn) {
                    buttons[i].setForeground(new Color(255, 0, 0));
                    buttons[i].setText("X");
                    player1_turn = false;
                    textfield.setText("O's turn");
                } else {
                    buttons[i].setForeground(new Color(0, 0, 255));
                    buttons[i].setText("O");
                    player1_turn = true;
                    textfield.setText("X's turn");
                }
                check();
            }
        }
    }

    public void firstTurn() {
        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("X's turn");
        } else {
            player1_turn = false;
            textfield.setText("O's turn");
        }
    }

    public void check() {
        // G‘oliblik shartlarini tekshirish
        if (checkCombo("X", 0, 1, 2)) xWins(0, 1, 2);
        else if (checkCombo("X", 3, 4, 5)) xWins(3, 4, 5);
        else if (checkCombo("X", 6, 7, 8)) xWins(6, 7, 8);
        else if (checkCombo("X", 0, 3, 6)) xWins(0, 3, 6);
        else if (checkCombo("X", 1, 4, 7)) xWins(1, 4, 7);
        else if (checkCombo("X", 2, 5, 8)) xWins(2, 5, 8);
        else if (checkCombo("X", 0, 4, 8)) xWins(0, 4, 8);
        else if (checkCombo("X", 2, 4, 6)) xWins(2, 4, 6);

        else if (checkCombo("O", 0, 1, 2)) oWins(0, 1, 2);
        else if (checkCombo("O", 3, 4, 5)) oWins(3, 4, 5);
        else if (checkCombo("O", 6, 7, 8)) oWins(6, 7, 8);
        else if (checkCombo("O", 0, 3, 6)) oWins(0, 3, 6);
        else if (checkCombo("O", 1, 4, 7)) oWins(1, 4, 7);
        else if (checkCombo("O", 2, 5, 8)) oWins(2, 5, 8);
        else if (checkCombo("O", 0, 4, 8)) oWins(0, 4, 8);
        else if (checkCombo("O", 2, 4, 6)) oWins(2, 4, 6);

            // Durangni tekshirish
        else if (isBoardFull()) {
            draw();
        }
    }

    public boolean checkCombo(String player, int a, int b, int c) {
        return buttons[a].getText().equals(player) &&
                buttons[b].getText().equals(player) &&
                buttons[c].getText().equals(player);
    }

    public boolean isBoardFull() {
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                return false;
            }
        }
        return true;
    }

    public void xWins(int a, int b, int c) {
        highlightWinningCombo(a, b, c);
        textfield.setText("X wins!");
        disableButtons();
    }

    public void oWins(int a, int b, int c) {
        highlightWinningCombo(a, b, c);
        textfield.setText("O wins!");
        disableButtons();
    }

    public void draw() {
        textfield.setText("Draw!");
        disableButtons();
    }

    public void disableButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

    public void highlightWinningCombo(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}

