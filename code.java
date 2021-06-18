/**This program reads an integer and prints whether it is negative, zero, or
 * positive
 * @author (Fikri Şan Köktaş)
 * @version (28 November 2020)
 */
//I import these libraries no matter they are necessary or not. 
import java.util.Scanner;
import java.util.Random;
import java.lang.Object;
public class KFS_IsInteger_Main
{
    public static void main(String [] args)
        {
           String writing;
           Scanner input = new Scanner(System.in);
           System.out.print("Enter a number: ");
           int number = input.nextInt();
            if (number < 0) 
           {
            System.out.print("negative");
           } 
           else if (number > 0) 
           {
            System.out.print("positive");
           } 
           else {
            System.out.print("zero");
            }
        }
}
