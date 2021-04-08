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
 * @author Martinez Safari
 */
public class User {

    private String userName;
    private String surname;
    private String userID;
    private String dateOfBirth;
    private String countryOfBirth;
    private String cellNumber;
    
    
    public User(String userName, String surname, String userID,
            String dateOfBirth, String countryOfBirth, String cellNumber) {
        this.userName= userName;
        this.surname= surname;
        this.userID= userID;
        this.dateOfBirth= dateOfBirth;
        this.countryOfBirth= countryOfBirth;
        this.cellNumber= cellNumber;
        
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getSurname() {
           return surname;
       }
    public void setSurname(String surname) {
           this.surname= surname;
       }
    public String getUserID() {
           return userID;
       }
    public void setUserID(String userID) {
           this.userID= userID;
       }
     public String getDateOfBirth() {
           return dateOfBirth;
       }

    public void setDateOfBirth(String dateOfBirth) {
           this.dateOfBirth= dateOfBirth;
       }
    public String getCellNumber() {
           return cellNumber;
       }

    public void setCellNumber(String cellNumber) {
           this.cellNumber= cellNumber;
       }
   
    public String toString()
{
    String details= "userName :"+this.userName+ ",surname: "+this.surname+ ",userID: " +this.userID +" ,"
            + "dateOfBirth: "+ this.dateOfBirth+ ",countryOfBirth: "+this.countryOfBirth+ 
            ",cellNumber: "+this.cellNumber;
    return details;
}
    
}
