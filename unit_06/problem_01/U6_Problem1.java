package unit_06.problem_01;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 01

/*-
 * Description:
 *   Create an abstract class PayCalculator that has an attribute
 *     payRate given in dollars per hour. The class should also have a method
 *     computePay(hours) that returns the pay for a given amount of time.
 *
 *   Derive a class RegularPay from PayCalculator, as described above. It
 *     should have a constructor that has a parameter for the pay rate. It
 *     should not override any of the methods. Then derive a class HazardPay
 *     from PayCalculator that overrides the computePay method. The new method
 *     should return the amount returned by the base class method
 *     multiplied by 1.5.
 *
 * Assumptions:
 *   - payRate is a double
 *   - computePay returns a double
 *   - no need for accessor/modifier methods for payRate
 *
 * Pseudocode:
 *   1. create an abstract class with a single method
 *       that returns num_hours*pay_rate
 *   2. extend that class provide constructors
 *   3. extend again but now have that method return the original
 *       value * 1.5
 */

public class U6_Problem1 {
  public static void main(String[] args) {
    PayCalculator a = new RegularPay(10);
    PayCalculator b = new HazardPay(10);

    System.out.printf("5h RegularPay: %f\n", a.computePay(5));
    System.out.printf("5h HazardPay:  %f\n", b.computePay(5));

    System.exit(0);
  }
}
