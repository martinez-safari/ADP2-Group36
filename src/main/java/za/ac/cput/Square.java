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

public class Square {
    private double sidelength;
    
    public Square (double len){
    sidelength= len;
    }
    public double area(){
        return sidelength*sidelength ;
    }
    
}
