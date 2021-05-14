/**
 * HEADER
 * Ticket Booking System
 * Course: Project 2 - PRT262S
 * Authors: Group 36 ->
 *          CAMERON ROSE_220263159
 *          CURSTIN JADE ROSE_220275408
 *          MVELISO ROTO_214211983
 *          MARTINEZ SAFARI_219325332
 *          MOGAMMAD YAASEEN SAFODIEN_218336950
 *          NUSSAYR EL-BAGHDADI SAIDI_220425477
 * 
 * Initialized
 * JDK: 11
 * JUnit: 5.7.0
 */
package za.ac.cput.ticketbookingsystem;

/**
 *
 * @author Martinez Safari 219325332
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class Login extends JFrame {
    private JLabel user;
    private JLabel errorUser;
    private JLabel example;
    private JLabel pass;
    private JLabel errorPass;
    private JTextField userText;
    private JPasswordField Password;
    
    
public static void main(String[] args) {
    
    Login frameTabel = new Login();
}

JButton blogin = new JButton("Login");
JButton bclear = new JButton("Clear");
JPanel panel = new JPanel();

Login(){ 
    super("Login");
    setSize(460,300);
    setLocation(500,280);
    panel.setLayout (null);
    panel.setBackground(Color.LIGHT_GRAY);
    
    panel.setBorder(BorderFactory.createTitledBorder(
    BorderFactory.createEtchedBorder(), "Login here", TitledBorder.CENTER,
    TitledBorder.TOP)); 
    
    user= new JLabel("Email:");
    user.setBounds(15, 50, 90, 25);
    panel.add(user);
    
    userText= new JTextField();
    userText.setBounds(100, 50, 170, 25);   
    panel.add(userText);
    
    errorUser = new JLabel("*user@gmail.com");
    errorUser.setForeground(Color.red);
    errorUser.setBounds(275, 50, 170, 25);
    errorUser.setVisible(false);
    panel.add(errorUser);
    
    //example= new JLabel("Example@gmail.com");
    //example.setBounds(275, 50, 170, 25);
    //example.setForeground(Color.gray);
    //panel.add(example);
    
    pass= new JLabel("Password:");
    pass.setBounds(15, 95, 90, 25); 
    panel.add(pass);
    
    Password= new JPasswordField(10);
    Password.setBounds(100, 95, 170, 25);
    panel.add(Password);
    
    errorPass = new JLabel("*required");
    errorPass.setForeground(Color.red);
    errorPass.setBounds(275, 95, 170, 25);
    errorPass.setVisible(false);
    panel.add(errorPass);
         
    blogin.setBounds(40,185,90,20);
    bclear.setBounds(210,185,90,20);

    panel.add(blogin);
    panel.add(bclear);
    panel.add(userText);
    panel.add(pass);

    getContentPane().add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    setVisible(true);
    actionlogin();   
}
public boolean isInputValid() {
        boolean valid = true;
        
        if (userText.getText().equals("")) {
            valid = false;
             errorUser.setVisible(true);
        } else
             errorUser.setVisible(false);
        
        if (Password.getText().equals("")) {
            valid = false;
            errorPass.setVisible(true);
        } else
            errorPass.setVisible(false);
         return valid;
    }

public void actionlogin(){
    
    blogin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
   
             if (isInputValid()) {
            
                dispose();
                new Register().setVisible(true);
            }  
        }
      });
    bclear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        userText.setText("");
        Password.setText("");
        
    }
         });
 }
}


