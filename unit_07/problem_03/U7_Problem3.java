package unit_07.problem_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Name: Andriy Zasypkin
// Date: 2016-04-19
// Unit: 07
// Problem: 03

/*-
 * Description:
 *   Revisit the Cycle class in Unit 3. Modify your application such that the
 *     properties will be read from a text file called "CycleIn.txt".   
 *
 *   - Examine your application for the class called Cycle.
 *   - Add an appropriate throws statement in the main method.
 *   - Create a reference to a File class with the appropriate name of a text
 *       file (Cycle.txt).
 *       Note: Cycle.txt was created in the previous assignment,
 *             CycleFileOutput.
 *   - In your code, check that the text file does exist.
 *   - Input the values from the file to memory.
 *   - Close the file.
 *
 * Assumptions:
 *   - File IO will *NOT* be achieved through piping
 *   - Essentually the reverse of 7.2
 *   - "CycleIn.txt" can be "cyclein.txt" (since I prefer lowercase filenames)
 *
 * Pseudocode:
 *   1. open file, if exists
 *   2. read line, extract numbers.
 *   3. create Cycle object from numbers
 *   4. print Cycle object
 */

public class U7_Problem3 {
  public static void main(String[] args) {
    // step 1
    File f = new File("cyclein.txt");
    try {
      Scanner scan = new Scanner(f);

      // step 2
      String[] nums = scan.nextLine().split("[^0-9\\.]+");

      // step 3
      Cycle c = new Cycle(Double.valueOf(nums[0]), Double.valueOf(nums[1]));

      // step 4
      System.out.println(c);

      scan.close();
    }
    catch(FileNotFoundException e) {
      System.out.println("The input file does not exist");
      System.exit(1);
    }
  }
}
