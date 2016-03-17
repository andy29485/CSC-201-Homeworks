//Name:    Andriy Zasypkin
//Date:    2016-01-10
//Unit:    01
//Problem: 2.3

import java.io.*;

/* Directions:
 *   (Convert feet into meters) Write a program that reads a number in feet,
 *   converts it to meters, and displays the result. One foot is 0.305 meter.
 *
 * Pseudocode:
 *   number = input()
 *   number *= .305
 *   output(number)
 */
public class Problem_2_3 {
  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    //ask user for, and read, input
    System.out.print("Enter a value for feet: ");
    double dFeet = Double.valueOf(input.readLine());

    //convert input to meters and display output
    System.out.println(dFeet+" feet is "+(dFeet*.305)+" meters");

    //close stream
    input.close();
    System.exit(0);
  }
}
