
/**
 * Write a description of class ConvertFromSeconds here.
 *
 * @author Jacob Neiheisel
 * @instructorinfo Professor Posada, CIS162 section 09
 * @version 02 September 2020 edition
 */

    import java.util.Scanner;
    
public class ConvertFromSeconds
{
    public static void main(){
        int seconds;
        int minutes;
        int hours;
        int secondsorig;
    Scanner scnr = new Scanner(System.in);
    
    //System.out.println("Please input seconds.");

        //gets amount of hours recorded and displays to terminal
        seconds = scnr.nextInt();
        secondsorig = seconds;
       // System.out.println("Inputted was " + seconds + " seconds.");
        
        //calculate the amount of hours, 3600 seconds are in one hour as one hour is 60 mins and each minute has 60 seconds
        hours = seconds / 3600;
        
        //get rid of the seconds used in the hours conversion
        seconds = seconds % 3600;
        
        //caltulate the amount of minutes 
        minutes = seconds / 60;
        
        //get rid of the seconds used in the hours conversion
        seconds = seconds % 60;
        
       // System.out.println("From the input of " + secondsorig + " seconds comes " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
        System.out.println("Hours: "+ hours); 
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
