import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame;
    JButton submitButton;
    JTextField userField;
    JPasswordField passwordField;
    JTextArea userArea;
    JTextArea passwordArea;

    MyFrame(){
        frame = new JFrame();
        this.setTitle("Panel logowania");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);

        userArea = new JTextArea("User:");
        userArea.setBounds(60,100,50,20);
        userArea.setBackground(new Color(130,220,250));
        userArea.setVisible(true);
        userArea.setEditable(false);
        this.add(userArea);

        userField = new JTextField();
        userField.setBounds(120, 100, 100,20);
        userField.setVisible(true);

        this.add(userField);

        passwordArea = new JTextArea("Password:");
        passwordArea.setBounds(60,130,60,20);
        passwordArea.setBackground(new Color(130,220,250));
        passwordArea.setVisible(true);
        passwordArea.setEditable(false);
        this.add(passwordArea);

        passwordField = new JPasswordField();
        passwordField.setBounds(120,130,100,20);
        passwordField.setVisible(true);
        this.add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        submitButton.setBounds(60,180,100,20);
        submitButton.setVisible(true);
        this.add(submitButton);

        this.getContentPane().setBackground(new Color(130,220,250));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitButton){
            submitButton.setEnabled(false);
            User a = new User(userField.getText(),String.valueOf(passwordField.getPassword()));
            Accounts accounts = new Accounts();
            accounts.creatingAccounts();
            if(accounts.checkingAccounts(a)){
                this.getContentPane().setBackground(Color.green);
                userArea.setBackground(Color.green);
                passwordArea.setBackground(Color.green);
                JOptionPane.showMessageDialog(frame, "Correct login and password", "ACCES PERMITTED", JOptionPane.INFORMATION_MESSAGE);
            } else {
                this.getContentPane().setBackground(Color.red);
                userArea.setBackground(Color.red);
                passwordArea.setBackground(Color.red);
                JOptionPane.showMessageDialog(frame, "Incorrect login or password", "ACCES DENIED", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }
}
