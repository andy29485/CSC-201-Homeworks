package Unit_04.Problem_04;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 04

/*
 * Description: Design and implement a set of classes that define various types
 * of electronics equipment (computers, cell phones, pagers, digital cameras,
 * etc.). Include data values that describe various attributes of the
 * electronics, such as the weight, cost, power usage, and the names of the
 * manufacturers. Include methods that are named appropriately for each class
 * and that print an appropriate message. Create a main driver class to
 * instantiate and exercise several of the classes.
 *
 * Assumptions: - will be hard-coded - only need to make specified classes
 *
 * Pseudocode: 1. get/set methods 2. toString with concatination using '+' and
 * String.format
 */

public class Main {
  public static void main(String[] args) {
    Computer c = new Computer();
    DigitalCamera d = new DigitalCamera();
    Pager p = new Pager();
    CellPhone cp = new CellPhone();

    System.out.println(c);
    System.out.println(d);
    System.out.println(p);
    System.out.println(cp);

    System.exit(0);
  }
}
