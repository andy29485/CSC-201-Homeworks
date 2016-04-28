package unit_08.problem_03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Name: Andriy Zasypkin
// Date: 2016-04-25
// Unit: 08
// Problem: 03

/*-
 * Description:
 *   Write an application which will write five student ID numbers and GPAs
 *     to a "rw" file called "Stu.dat" and then allow you to display the GPA
 *     of any student upon entering their ID number, for any number
 *     of students.
 *
 *   Directions
 *     - Import the classes necessary to support your application.
 *     - Create a class called ReadWrite.  This class has no properties or
 *         behaviours.
 *     - Create a main method which will include the following:
 *       - Add an appropriate throws statement in the main method.
 *       - Create a reference to a text file called "Stu.dat" with "rw" access.
 *       - Include try and catch blocks for exception handling.
 *       - Use a loop to interactively assign student ID numbers and their GPA
 *           scores.
 *       - With the use of a second loop, display the GPA for specific student
 *           ID numbers.
 *       - Use a sentinel to determine when you wish to stop the program.
 *       - Include a finally block within your program.
 *
 * Assumptions:
 *   - Stu.dat can be lowercase (I prefer lowercase filenames)
 *   - What's the point of try..catch if main already throws exceptions?
 *     - main will not throw exceptions(that would be the easy way out)
 *     - however, it will be included as a comment
 *   - ReadWrite will be included as a utterly pointless anon class within
 *     the main class
 *   - There is not need to add a check so that no two students have the same
 *     ids
 *   - "specific student ID numbers" means id numbers specified by the user
 *   - stuff gets saved to stu.dat
 *     - BUT NEVER READ
 *   - since creating a class called Student was not part of the requirement
 *     I'll just use a Map - will make the finding of students by id easier
 *
 * Pseudocode:
 *   1. create reference to "stu.dat"
 *     1.1 add catch for file not found
 *     1.2 add finally to close
 *   2. create list of students and an input object
 *   3. loop until user not longer wants to input stuff
 *     3.1 read 2 numbers
 *       3.1.1 if first number is <= 0 leave loop from step 3
 *     3.2 add to list(map actually)
 *     3.3 save to stu.dat
 *   4. a loop similar to step 3 but only asks for id numbers and prints gpas
 */

public class U8_Problem3 {
  public static void main(String[] args) /* throws IOException */ {
    // step 1a
    String file_name = "stu.dat";
    RandomAccessFile raf = null;

    // step 2
    Map<Integer, Double> students = new HashMap<Integer, Double>();
    Scanner scan = new Scanner(System.in);

    try {
      // step 1b
      raf = new RandomAccessFile(file_name, "rw");

      // step 3
      System.out.println("Add students");
      System.out.println("Enter id <= 0 to fininsh input");
      do {
        try {
          // step 3.1
          System.out.print("Enter an id(int) and a gpa(double): ");
          int id = scan.nextInt();
          // step 3.1.1
          if(id <= 0)
            break;
          double gpa = scan.nextDouble();
          // step 3.2
          students.put(id, gpa);
          // step 3.3
          raf.writeInt(id);
          raf.writeDouble(gpa);
        }
        catch(Exception e) {
          System.out.println("please enter 2 numbers(space seperated)");
        }
        finally {
          scan.nextLine();
        }
      } while(true);

      // step 4
      do {
        try {
          System.out.print("Enter a student ID(<=0 to quit): ");
          int id = Integer.valueOf(scan.nextLine());
          if(id <= 0)
            break;
          Double gpa = students.get(id);
          if(gpa == null)
            System.out.printf("no student with id %d exists\n", id);
          else
            System.out.printf("gpa for student with id %d: %.2f\n", id, gpa);
        }
        catch(Exception e) {
          System.out.println("please enter an integer");
        }
      } while(true);
    }
    catch(FileNotFoundException e) { // step 1.1
      System.out.printf("File \"%s\" does not exist and cannot be created\n",
          file_name);
    }
    finally {// step 1.2
      try {
        if(raf != null)
          raf.close();
      }
      catch(IOException e) {} // should never happen
    }

    scan.close();
  }

  @SuppressWarnings("unused")
  private static class ReadWrite {}
}
