
/**
 * Write a description of class ConvertFromSeconds here.
 *
 * @author Jacob Neiheisel
 * @instructorinfo Professor Posada, CIS162 section 09
 * @version 02 September 2020 edition
 */

    import java.util.Scanner;

public class ConvertToDollars
{
    public static void main(){
        int pennies;
        int nickels;
        int dimes;
        int quarters;
        double totalAmntMoney;

        Scanner scnr = new Scanner(System.in);

        //System.out.println("Please input quarters.");

        //gets amount of quarters recorded and displays to terminal
        quarters = scnr.nextInt();

        System.out.println("Quarters: " + quarters);

        //System.out.println("Please input dimes.");

        //gets amount of dimes recorded and displays to terminal
        dimes = scnr.nextInt();

        System.out.println("Dimes: " + dimes);

        //System.out.println("Please input nickels.");

        //gets amount of nickels recorded and displays to terminal
        nickels = scnr.nextInt();

        System.out.println("Nickels: " + nickels);

        //System.out.println("Please input pennies.");

        //gets amount of nickels recorded and displays to terminal
        pennies = scnr.nextInt();

        System.out.println("Pennies: " + pennies);

        totalAmntMoney = ((quarters * 25) + (dimes * 10) + (nickels * 5) + pennies) / 100.0;

        System.out.println("Dollars: $" + totalAmntMoney);

    }
}
