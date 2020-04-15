package LoginTestApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

class LoginSystem {

    private JFrame frmLoginSystemApp;
    private JTextField emailField;
    private JTextField passwordField;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginSystem window = new LoginSystem();
                    window.frmLoginSystemApp.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public LoginSystem() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmLoginSystemApp = new JFrame();
        frmLoginSystemApp.setTitle("Login system app test");
        frmLoginSystemApp.setBounds(100, 100, 682, 470);
        frmLoginSystemApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmLoginSystemApp.getContentPane().setLayout(null);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(364, 235, 89, 23);
        frmLoginSystemApp.getContentPane().add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(225, 235, 89, 23);
        frmLoginSystemApp.getContentPane().add(registerButton);

        emailField = new JTextField();
        emailField.setBounds(279, 135, 96, 20);
        frmLoginSystemApp.getContentPane().add(emailField);
        emailField.setColumns(10);

        passwordField = new JTextField();
        passwordField.setBounds(279, 184, 96, 20);
        frmLoginSystemApp.getContentPane().add(passwordField);
        passwordField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Insert your email");
        lblNewLabel.setBounds(120, 138, 96, 14);
        frmLoginSystemApp.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Insert your password");
        lblNewLabel_1.setBounds(120, 187, 119, 14);
        frmLoginSystemApp.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Please insert your email and password to log in. If you don't have an account, click \"Register\".");
        lblNewLabel_2.setBounds(125, 345, 455, 45);
        frmLoginSystemApp.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Test login system");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(279, 57, 119, 14);
        frmLoginSystemApp.getContentPane().add(lblNewLabel_3);

        JButton btnNewButton = new JButton("Confirm");
        btnNewButton.setBounds(286, 235, 89, 23);
        frmLoginSystemApp.getContentPane().add(btnNewButton);
        btnNewButton.setVisible(false);

        textField = new JTextField();
        textField.setBounds(500, 184, 96, 20);
        frmLoginSystemApp.getContentPane().add(textField);
        textField.setColumns(10);
        textField.setVisible(false);

        JLabel lblNewLabel_4 = new JLabel("Repeat password");
        lblNewLabel_4.setBounds(405, 187, 85, 14);
        frmLoginSystemApp.getContentPane().add(lblNewLabel_4);
        lblNewLabel_4.setVisible(false);
    }
}
