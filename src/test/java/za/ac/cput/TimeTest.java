/**
 * HEADER
 * Course: Application Development Practice 2 - ADP262S
 * Assignment 1
 * Authors: Group 36 ->
 *          CAMERON ROSE_220263159
 *          CURSTIN JADE ROSE_220275408
 *          MVELISO ROTO_214211983
 *          MARTINEZ SAFARI_219325332
 *          MOGAMMAD YAASEEN SAFODIEN_218336950
 *          NUSSAYR EL-BAGHDADI SAIDI_220425477
 * 
 * Initialized
 * JDK: 12
 * JUnit: 5.7.0
 */
package za.ac.cput;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;


public class TimeTest {

   
    private Time fixTime1;
    private Time fixTime2;
    private Time fixTime3;

     @Before
    public void setUp() throws Exception {
       fixTime1 = new Time(2,"minute");
       fixTime2 = fixTime1;
       fixTime3 = new Time(1,"second");
        
    }
    @Test
    public void testEquality(){
        assertEquals(fixTime1, fixTime2);
    }
    @Test 
    public void testIdentity(){
        assertSame(fixTime1, fixTime2);
    }
    @Test
    public void failingTest(){
        String a= fixTime1.timing();
        String b= fixTime3.timing();
        assertEquals(a,b);
        fail("Failing the test method");
        
    }
    @Test
    @Timeout(value= 100)
    public void timeoutTest(){
     String c= fixTime2.timing();
     String a= fixTime1.timing();
     assertEquals(c,a);
     
    }
    @Test
    @Disabled
    public void disabledTest(){
        assertEquals(fixTime1, fixTime2);
    }
 
}
