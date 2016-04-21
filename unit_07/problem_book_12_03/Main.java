package unit_07.problem_book_12_03;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 07
// Problem: 12.03 p.488

/*-
 * Description: ( ArrayIndexOutOfBoundsException )
 *  Write a program that meets the following requirements:
 *    - Creates an array with 100 randomly chosen integers.
 *    - Prompts the user to enter the index of the array, then displays the
 *      corresponding element value. If the specified index is out of bounds,
 *      display the message Out of Bounds.
 *
 * Assumptions:
 *  - Exception handling should be used(not defencive programming)
 *  - The random number interval doesn't really matter, so long as there is one
 *  - Only the ArrayIndexOutOfBoundsException should be checked
 *  - Program will *NOT* ask for more than one input
 *    - even if the first input given is invalid
 *
 * Pseudocode:
 *  1. create an array and a scanner
 *  2. fill array with random numbers using loop
 *  3. ask for an index
 *  4. read index
 *  5. attempt to use index to access array and print
 *  6. if exception, print that input was invalid
 *  7. close stream
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // step 1
    Scanner input = new Scanner(System.in);
    int[] array = new int[100];

    // step 2
    for(int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 10000 - 5000);
    }

    // step 3
    System.out.print("Enter a number between 0 and 99: ");
    try {
      // step 4
      int index = input.nextInt();

      // step 5
      System.out.printf("Value at index %d is: %d\n", index, array[index]);
    }
    catch(ArrayIndexOutOfBoundsException e) {
      // step 6
      System.out.println("You did not enter a valid number");
    }

    // step 7
    input.close();
  }
}
