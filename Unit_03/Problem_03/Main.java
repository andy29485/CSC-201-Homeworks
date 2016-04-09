package Unit_03.Problem_03;

// Name: Andriy Zasypkin
// Date: 2016-02-08
// Unit: 03
// Problem: 03

/*
 * Description: [A] Create a class called "Cycle" which has two instance integer
 * variables as properties, "numberOfWheels" and "weight."  Create a constructor
 * with two parameters, using the same variable names in the parameter list.
 * Assign each variable to "numberOfWheels" and "weight" respectively. Write a
 * separate application to test the class and display its properties. Note: Do
 * not change the names of the instance variables or the variables listed in the
 * constructor’s parameter list. 1 Declare integer instance variables
 * numberOfWheels and weight as private. 2 Include a toString() method in the
 * Cycle class.  No set or get methods are included. 3 Create a constructor with
 * two parameters, using the same variable names numberOfWheels and weight in
 * the parameter list. Complete the constructor as necessary. 4 Create a
 * separate application to test the class. 4.1 Create an object of the Cycle
 * class. 4.2 Display the properties of the object.
 *
 * [B] Edit your class Cycle by adding a default constructor which will assign
 * the default values of 100 to represent the numberOfWheels, and 1000 to
 * represent the weight, by invoking a call to the other constructor. Modify
 * your application created in [A] to test the class. 1 Edit the default
 * constructor such that the default constructor will invoke the existing
 * constructor with the default values of 100 to represent the numberOfWheels,
 * and 1000 to represent the weight. Invoke the constructor using the "this"
 * reference. 1.1 Create the second constructor which will receive the two
 * arguments. 2 Create a separate application to test the class. 2.1 Create an
 * object of the Cycle class. 2.2 Display the properties of the object.
 *
 * Assumptions: - The directions are fairly specific(more so than my usual
 * pseudocode) - so see directions for pseudocode - on this note, insted of
 * commenting "step x", I'll use "[A]x" or "[B]x" - No input is inputted - Both
 * parts A and B reffrence a class called Cycle - therefore, only 2 classes need
 * to be witen - Main - Cycle - by this I mean there are *not* 2 classes that
 * are Cycle[AB]
 *
 * Pseudocode: Um... see assumptions?
 */

public class Main {
  public static void main(String[] args) {

    // [A] 4.1
    Cycle cycle1 = new Cycle(2, 40);
    // [A] 4.2
    System.out.printf("Testing Part A: Cycle(2, 40):\n%s\n\n",
        cycle1.toString());

    // [B] 2.1
    Cycle cycle2 = new Cycle();
    // [B] 2.2
    System.out.printf("Testing Part A: Cycle():\n%s\n\n", cycle2.toString());

    System.exit(0);
  }
}
