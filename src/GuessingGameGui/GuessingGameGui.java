// made with eclipse's window builder

package GuessingGameGui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGameGui extends JFrame {
    private JTextField txtGuess;
    private JLabel lblOutput;
    private JButton btnPlayAgain;
    private JButton btnNewButton;
    private int theNumber;
    private int tryCounter;
    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);
            if (guess < theNumber) {
                message = guess + " is too low. Try again. Current try counter is: " + tryCounter;
                tryCounter ++;
            }
            else if (guess > theNumber) {
                message = guess + " is too High. Try again. Current try counter is: " + tryCounter;
                tryCounter ++;
            }
            else {
                message = guess + " is correct! Congradulations! Let's play again! It took you: " + tryCounter + " tries to win.";
                btnPlayAgain.setVisible(true);
                btnNewButton.setVisible(false);
            }

        } catch (Exception e) {
            message = "Enter a whole number between 1 and 100.";
        } finally {
            lblOutput.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
            txtGuess.replaceSelection("");
        }
    }

    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
        tryCounter = 1;
        lblOutput.setText("Enter a number above and click Guess!");
        txtGuess.requestFocus();
        txtGuess.selectAll();
        txtGuess.replaceSelection("");
        btnPlayAgain.setVisible(false);
        btnNewButton.setVisible(true);
    }
    public GuessingGameGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Matt's window");
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Matt's guessing game");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        lblNewLabel.setBounds(186, 60, 246, 30);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 and 100");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1.setBounds(176, 150, 266, 16);
        getContentPane().add(lblNewLabel_1);

        txtGuess = new JTextField();
        txtGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGuess.setBounds(446, 148, 59, 22);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);

        btnNewButton = new JButton("Guess!");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(253, 226, 112, 40);
        getContentPane().add(btnNewButton);

        lblOutput = new JLabel("Enter a number above and click Guess!");
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblOutput.setBounds(78, 325, 462, 30);
        getContentPane().add(lblOutput);

        btnPlayAgain = new JButton("Play again?");
        btnPlayAgain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newGame();
            }
        });
        btnPlayAgain.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnPlayAgain.setBounds(396, 226, 144, 40);
        btnPlayAgain.setVisible(false);
        getContentPane().add(btnPlayAgain);
    }

    public static void main(String[] args) {
        GuessingGameGui theGame = new GuessingGameGui();
        theGame.newGame();
        theGame.setSize(new Dimension(600, 450));
        theGame.setVisible(true);

    }
}