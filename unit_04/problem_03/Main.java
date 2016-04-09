package unit_04.problem_03;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 03

/*
 * Description: Design and implement a set of classes that define various
 * courses in your curriculum. Include information about each course such as the
 * title, number, description, and department that teaches the course. Consider
 * the categories of classes that constitutes your curriculum when designing
 * your inheritance structure. Create a main driver class to instantiate and
 * exercise several of the classes.
 *
 * Assumptions: - hard-coded - Only a few classes needed - Inhereted classes
 * don't really differ - imho, only one reasource class should be used for this
 * assignment
 *
 * Pseudocode: 1. mutator/accessor methods(nothing intresting) 2. a bunch of
 * classes 3. toString returs simple output
 */
public class Main {
  public static void main(String[] args) {

    Course a = new Language();
    Course b = new LiberalArts();
    Course c = new Stem();
    Course d = new Business();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    System.exit(0);
  }
}
