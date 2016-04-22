package unit_07.problem_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Name: Andriy Zasypkin
// Date: 2016-04-19
// Unit: 07
// Problem: 02
/*-
 * Description:
 *   Revisit the Cycle class in Unit 3.
 *   Modify your application such that the properties will
 *     be written to a text file called "CycleOut.txt" instead of
 *     to the screen.   
 *
 *   - Examine your application for the class called Cycle.
 *   - Add an appropriate throws statement in the main method.
 *   - Create a reference to a File class with the appropriate name of a text
 *     file (Cycle.txt).
 *   - Use appropriate code to ensure that the text file exist.
 *   - Output the values of the variables to the text file.
 *   - Close the file.
 *
 *   Note: Verify the contents were written to the text file using notepad
 *         (or any word processor).
 *
 * Assumptions:
 *   - "Word Processor" means Text Editor
 *   - File IO will *NOT* be achieved through piping
 *   - Will overwrite data if any(not append)
 *   - Basically the same as the 7.1 but final print is a write to file
 *   - Assuming "ensure that the text file exist" is post-write to file
 *     (what the point of only writing to a file if overwriting contents)
 *   - "Cycle.txt" can start with a lowercase 'c'
 *     FAT file systems shouldn't care about case
 *
 * Pseudocode:
 *   1. same as 7.1
 *   2. same as 7.1
 *   3. same as 7.1
 *   4. same as 7.1
 *   5. same as 7.1 but writes to file using PrintWriter
 *   6. check that file exists(print message if dose not)
 */

public class U7_Problem2 {
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
    try {
      PrintWriter p = new PrintWriter("cycle.txt");
      p.println(c);
      p.close();
    }
    catch(FileNotFoundException e) {
      e.printStackTrace();
    }

    // step 6
    File f = new File("cycle.txt");
    if(!f.exists())
      System.out.println("Somehow the file did not get created");

    scan.close();
  }
}
