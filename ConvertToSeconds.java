
/**
 * Write a description of class ConvertToSeconds here.
 *
 * @author Jacob Neiheisel
 * @instructorinfo Professor Posada, CIS162 section 09
 * @version 02 September 2020 edition
 */

    import java.util.Scanner;

public class ConvertToSeconds
{
    public static void main(){
        int hours;
        int minutes;
        int seconds;
        int totalSeconds;
        
        //get something to hold numbers to be typed in
        Scanner scnr = new Scanner(System.in);
        
           System.out.println("Please input hours.");

        //gets amount of hours recorded and displays to terminal
        hours = scnr.nextInt();
        System.out.println("Inputted was " + hours + " hours.");
        
        System.out.println("Please input minutes.");

        //gets amount of minutes recorded and displays to terminal
        minutes = scnr.nextInt();
        System.out.println("Inputted was " + minutes + " minutes.");

         System.out.println("Please input seconds.");
        
        //gets amount of seconds recorded and displays to terminal
        seconds = scnr.nextInt();
        System.out.println("Inputted was " + seconds + " seconds.");

        //calculate total amount of seconds
        //60 minutes per hour at 60 seconds per minute produces the 3600 number for hours*3600
        //60 seconds are in one minute, so 60* minutes produces seconds, seconds can just be added
        totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("\nThe total number of seconds is " + totalSeconds);
    }
}
