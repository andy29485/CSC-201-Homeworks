package unit_08.problem_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Name: Andriy Zasypkin
// Date: 2016-04-25
// Unit: 08
// Problem: 01

/*-
 * Description:
 *   Consider the following class:
 *     public  class Fraction{
 *       private int numerator;
 *       private int denominator;
 *       private static char slash = ‘/’, 
 *     }
 *
 *   Write a program to instantiate an object of the Fraction class to test
 *     the class... Add a constructor(s), set and get methods to the Fraction
 *     class appropriately.  Using the Serializable Interface, instantiate and
 *     write three Fraction objects to a file called “SerialF.dat.”  A loop
 *     must be used when creating and writing the three objects to the file.
 *     You can select the values you wish to use for the denominator and
 *     numerator.
 *
 *   Directions:
 *   - Create the Fraction Class.
 *     - Add a constructor(s), set and get methods to the Fraction class appropriately.
 *     - Ensure the class is Serializable.
 *   - Use a loop to create three Fraction objects.
 *     - Initialise the three objects,
 *     - Write each object to the file "SerialF.dat"
 *     - Display an appropriate message if an exception occurs.
 *
 * Assumptions:
 *   - TODO
 *
 * Pseudocode:
 *   1. same as directions
 *   2. Although I also created read method(not that it's needed)
 *     2.1 open file
 *     2.2 read obj
 *     2.3 close file
 *     2.4 return obj
 *   3. and the write method
 *     3.1 open file
 *     3.2 write obj
 *     3.3 close file
 *
 */

public class U8_Problem1 {
  public static Fraction read(String fileName) throws IOException,
                                               ClassNotFoundException {
    FileInputStream f = new FileInputStream(fileName);
    ObjectInputStream o = new ObjectInputStream(f);
    Fraction obj = (Fraction) o.readObject();
    o.close();
    return obj;
  }

  public static void write(Fraction obj, String fileName) throws IOException {
    FileOutputStream f = new FileOutputStream(fileName);
    ObjectOutputStream o = new ObjectOutputStream(f);
    o.writeObject(obj);
    o.close();
  }

  public static void main(String[] args) {
    for(int i = 0; i < 3; i++) {
      Fraction tmp = new Fraction();
      try {
        write(tmp, "SerialF.dat");
      }
      catch(IOException e) {
        System.out.printf("unable to save obj %d: %s\n", i + 1, e.getMessage());
      }
    }
  }
}
