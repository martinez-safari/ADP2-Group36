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

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author msaidi
 */
public class MainTest {
                
    
    public MainTest() {

    }
    
     @Before
    public void setUp() throws Exception {
        String userName;
        String surname;
        String userID;
        String dateOfBirth;
        String countryOfBirth;
        String cellNumber; 
    }
    @Test
    public void testUser() {
        System.out.println("main");
        //Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
        fail("The test case is a prototype.");
        User us=new User("name","surname","id","date of birth","country of birth","cell no");
        System.out.println(us.toString());
       
    }
   
    
}
