package za.ac.cput.ticketbookingsystem;

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


import java.util.Scanner;

/**
 *
 * @author Martinez Safari 219325332
 */
public class LoginSystem {
    private String user_email;
    private String password;
    private String name;
    private String surname;
    private String idNumber;
    private String address;
    private long contactNumber;
    
    public void user(){
        Scanner input= new Scanner(System.in);

        System.out.println("Email: ");
        user_email= input.nextLine();
        
        System.out.println("Password: ");
        password= input.nextLine();
        
        int option;
          System.out.println("1: to login");
          System.out.println("2: to register");
          System.out.println("3: to exit");
          option = input.nextInt();
          
        switch(option){
            case 1:
                System.out.println("welcome to your login page"+"\n"+"Complete the requirement to register");
                System.out.println("======================================");
                Register();
                
                
                break;
            case 2:
                Register();
                break;
            case 3: 
                System.out.println("Thank you");
                System.exit(0);
        }
    }
    public void Register(){
        Scanner input= new Scanner(System.in);
   
        System.out.println("Enter name: ");
        name= input.nextLine();
        
        System.out.println("Enter surname: ");
        surname= input.nextLine();
        
        System.out.println("Enter ID: ");
        idNumber= input.nextLine();
        
        System.out.println("Enter Address: ");
        address= input.nextLine();
        
        System.out.println("Enter Contact: ");
        contactNumber= input.nextLong();
        
        System.out.println("Thank you for your time");
        System.exit(0);
        
    }              
    
}
