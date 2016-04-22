package unit_07.problem_01;

// Name: Andriy Zasypkin
// Date: 2016-04-19
// Unit: 07
// Problem: 01

/*-
 * Description:
 *   Revisit the Cycle class in Unit 3.10.1.
 *   Modify your application such that the properties, numberOfWheels and
 *     weight are entered as double values interactively (at the keyboard).
 *     Exception handling will be used to determine whether a type mismatch
 *     occurs.
 *
 *   Edit your application such that, in addition to [A], the values
 *     for numberOfWheels and weight, entered interactively, will throw
 *     a new exception “Values cannot be less than or equal to zero” only
 *     If the values are less than or equal to zero.  Add or use the
 *     appropriate try and/or catch blocks.
 *
 *   - Examine your application for the class called Cycle.
 *   - Add Try and Catch blocks appropriately.
 *   - Add the throw statement for the new exception.
 *   - Display an appropriate message if an exception occurs.
 *   - Display the properties of the object.
 *
 *   Note: Verify the contents were written to the text file using notepad
 *         (or any word processor).
 *
 * Assumptions:
 *   - "Word Processor" means Text Editor
 *   - File IO will *NOT* be achieved through piping
 *   - Although I disagree with having numberOfWheels as a
 *     double(what is .4 wheels?), I will assume that it does
 *     need to be a double
 *
 * Pseudocode:
 *   1. Create scanner, and default Cycle
 *   2. ask for numbers
 *   3. read/set numbers
 *   4. [in mutator methods] if number is <= 0, throw exception w/ message
 *   5. print cycle specs
 */

import java.util.Scanner;

public class U7_Problem1 {
  public static void main(String[] args) {
    // step 1
    Scanner scan = new Scanner(System.in);
    Cycle c = new Cycle();

    // step 2a + 3a
    System.out.print("Enter number of wheels on cycle: ");
    c.setNumberOfWheels(scan.nextDouble());
    scan.nextLine();

    // step 2b + 3b
    System.out.print("Enter cycle mass: ");
    c.setWeight(scan.nextDouble());
    scan.nextLine();

    // step 5
    System.out.println(c);

    scan.close();
  }
}
