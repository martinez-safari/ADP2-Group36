/**
 *
 * @author Martinez safari
 */
package za.ac.cput.ticketbookingsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Register extends JFrame { 
    private JLabel name;
    private JLabel errorName;
    private JTextField nameTxt;
    
    private JLabel surname;
    private JLabel errorSurname;
    private JTextField surnameTxt;
    
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup group;
    
    private JLabel id;
    private JLabel errorId;
    private JTextField idTxt;
    
    private JLabel contact;
    private JLabel errorContact;
    private JTextField contactTxt;
    
    private JLabel address;
    private JLabel errorAddress;
    private JTextField addressTxt;
    
    public static void main(String[] args) {
    
    Register frameTabel = new Register();
}
   

    JButton bback = new JButton("Back");
    JButton bnext = new JButton("Next");
    JButton bsubmit = new JButton("Submit");
    
    JPanel panel = new JPanel();

    Register(){

        super("Register");
        setSize(500,400);
        setLocation(300,180);
        panel.setLayout (null);
        panel.setBackground(Color.LIGHT_GRAY);

        panel.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "Sign up", TitledBorder.CENTER,
        TitledBorder.TOP));

        name= new JLabel("Name");
        name.setBounds(15, 30, 85, 30);
        panel.add(name);
        
        nameTxt= new JTextField();
        nameTxt.setBounds(150, 30, 175, 30);
        panel.add(nameTxt);
      
        errorName = new JLabel("*required");
        errorName.setForeground(Color.red);
        errorName.setBounds(325, 30, 85, 30);
        errorName.setVisible(false);
        panel.add(errorName);

        surname= new JLabel("Surname");
        surname.setBounds(15, 75, 85, 30);
        panel.add(surname);

        surnameTxt= new JTextField();
        surnameTxt.setBounds(150, 75, 175, 30);
        panel.add(surnameTxt);
        
        errorSurname = new JLabel("*required");
        errorSurname.setForeground(Color.red);
        errorSurname.setBounds(325, 75, 85, 30);
        errorSurname.setVisible(false);
        panel.add(errorSurname);

        gender= new JLabel("Gender");
        gender.setBounds(15, 115, 85, 30);
        panel.add(gender);

        male = new JRadioButton("male", true);
        female = new JRadioButton("female");

        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        panel.add(male);
        panel.add(female);

        male.setBounds(150, 115, 65, 30);    
        female.setBounds(260, 115, 65, 30);  

        id= new JLabel("ID Number");
        id.setBounds(15, 155, 85, 30);
        panel.add(id);

        idTxt= new JTextField();
        idTxt.setBounds(150, 155, 175, 35);
        panel.add(idTxt);
        
        errorId = new JLabel("*required");
        errorId.setForeground(Color.red);
        errorId.setBounds(325, 155, 85, 30);
        errorId.setVisible(false);
        panel.add(errorId);

        contact= new JLabel("Phone Number");
        contact.setBounds(15, 205, 85, 30);
        panel.add(contact);

        contactTxt= new JTextField();
        contactTxt.setBounds(150, 205, 175, 30);
        panel.add(contactTxt);
        
        errorContact = new JLabel("*required");
        errorContact.setForeground(Color.red);
        errorContact.setBounds(325, 205, 85, 30);
        errorContact.setVisible(false);
        panel.add(errorContact);

        address= new JLabel("Address");
        address.setBounds(15, 255, 85, 30);
        panel.add(address);

        addressTxt= new JTextField();
        addressTxt.setBounds(150, 255, 175, 30);
        panel.add(addressTxt);
        
        errorAddress = new JLabel("*required");
        errorAddress.setForeground(Color.red);
        errorAddress.setBounds(325, 255, 85, 30);
        errorAddress.setVisible(false);
        panel.add(errorAddress);
        
        bback.setBounds(15,320,100,20);
        bnext.setBounds(375,320,100,20);
        bsubmit.setBounds(200,320,100,20);

        panel.add(bback);
        panel.add(bnext);
        panel.add(bsubmit);


        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionRegister();
    }
    public boolean isInputValid() {
        boolean valid = true;
        
        if (nameTxt.getText().equals("")) {
            valid = false;
             errorName.setVisible(true);
        } else
             errorName.setVisible(false);
        
        if (surnameTxt.getText().equals("")) {
            valid = false;
            errorSurname.setVisible(true);
        } else
            errorSurname.setVisible(false);
        
        if (idTxt.getText().equals("")) {
            valid = false;
            errorId.setVisible(true);
        } else
            errorId.setVisible(false);
         
        if (contactTxt.getText().equals("")) {
            valid = false;
            errorContact.setVisible(true);
        } else
            errorContact.setVisible(false);
        
        if (addressTxt.getText().equals("")) {
            valid = false;
            errorAddress.setVisible(true);
        } else
            errorAddress.setVisible(false);
  
         return valid;
    }
 

    private void actionRegister() {
        bback.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
              dispose();
               new Login().setVisible(true);
        }
      });
      bnext.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isInputValid()) {
              dispose();
               //new page().setVisible(true);
            }
        }
      });
      bsubmit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isInputValid()) {
   
             JOptionPane.showMessageDialog(null,"Thank you for submitting!",  " MsgBox",JOptionPane.PLAIN_MESSAGE);
             
            }
        }
      });
    }
 }      