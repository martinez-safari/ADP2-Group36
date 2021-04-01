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

public class Time {
    private int hour;
    private String fixTime;
    
    public Time (int hour, String fixTime ){
        this.fixTime= fixTime;
        this.hour= hour; 
    }
    public String timing(){
        switch(fixTime){
            case "minute":
                return "Hour = "+ (hour*60) + "minute";
            case "second":
                return "Hour = "+ (hour*3600)+ "seconds";
            default:
                return "The hour must be fixed in minute or second, pls try again";
        }
    }
        public void setHour(int hour) {
        this.hour = hour;
    }

    public void setFixTime(String fixTime) {
        this.fixTime = fixTime;
    }

    public String getFixTime() {
        return fixTime;
    }
     @Override
    public String toString() {
        return "Time is "+ hour+ fixTime; 
    }
    public static void main(String[] args){
        Time fixTime1= new Time(1, "minute");
        System.out.println("fixTime1 "+fixTime1);
        
        System.out.println(fixTime1.timing());
        
    }
    
}
