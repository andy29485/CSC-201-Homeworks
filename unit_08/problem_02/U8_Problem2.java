package unit_08.problem_02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

// Name: Andriy Zasypkin
// Date: 2016-04-25
// Unit: 08
// Problem: 02
/*-
 * Description:
 *   The pledge of Allegiance states, "I pledge allegiance to the Flag of the
 *     United States of America, and to the Republic for which it stands: one
 *     Nation under God, indivisible, With Liberty and Justice for all."
 *     Save the pledge, 174 characters, to a text file. Use the
 *     RandomAccessFile class to access the file. Using Seek method, display
 *     the characters at positions 124 and 135 only.
 *
 *   Directions:
 *     - Create a text file with the pledge of allegiance named
 *         Pledge.txt using notepad.
 *     - Create a reference to the file, Pledge.txt, using the
 *         RandomAccessFile class.
 *     - Use the Seek method to point at positions 124 and 135, then display
 *         the characters represented by the byte streams.
 *     - Use try, catch and finally blocks for exception handling.
 *
 * Assumptions:
 *   - I do not have to use notepad to create the file as GNU/Linux does not
 *       natively run notepad
 *   - Pledge.txt can be lowercase (I prefer lowercase file names)
 *   - "positions 124 AND 135" NOT "positions 124 TO 135"
 *     - so two characters - NOT eleven
 *
 * Pseudocode:
 *   1. create variable for file
 *   2. if command line args are provided
 *     2.1 use first arg as file name
 *   3. instantiate RandomAccessFile object form file name (ro)
 *   4. seek, read, and print - twice
 *   5. add try, catch, and finally blocks to prevent errors
 *     5.1 try around steps 3,4
 *     5.2 catch if file not found - print
 *     5.3 catch if seeking fails - print
 *     5.4 finally close file
 *       5.4.1 but only if instantiation was a success
 */

public class U8_Problem2 {
  public static void main(String[] args) {
    // step 1
    String file = "pledge.txt";
    // step 2
    if(args.length > 0)
      file = args[0];
    // step 3a
    RandomAccessFile raf = null;
    try {// step 5.1
      // step 3b
      raf = new RandomAccessFile(file, "r");

      // step 4a
      raf.seek(124);
      System.out.printf("At pos 124: \'%c\'\n", (char) raf.read());
      // step 4b
      raf.seek(135);
      System.out.printf("At pos 135: \'%c\'\n", (char) raf.read());

    }
    catch(FileNotFoundException e) {// step 5.2
      System.out.printf("%s not found\n", file);

    }
    catch(IOException e) {// step 5.3
      System.out.println("seeking failed");
    }
    finally {// step 5.4
      try {
        if(raf != null)// step 5.4.1
          raf.close();
      }
      catch(final IOException ex) {}
    }
  }
}
