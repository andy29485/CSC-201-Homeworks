package unit_01.problem_05;

// Name: Andriy Zasypkin
// Date: 2016-01-13
// Unit: 01
// Problem: 05

/*
 * Description: - A complex number is defined as z=a+i*b, where a is the real
 * part, and b is the imaginary part. In other words, in order to define a
 * complex number, we need the two floating numbers a and b. - Write methods
 * that perform for each of the following operations with complex numbers z1 =
 * a1 + i*b1, and z2 = a2 + i*b2: - z1+z2=(a1+a2) + i*(b1+b2) - z1-z2=(a1-a2) +
 * i*(b1-b2) - z1*z2=(a1*a2 – b1*b2) + i*(a1*b2 + b1*a2) -
 * z1/z2=(a1*a2+b1*b2)/(a2^2+b2^2) + i*(b1*a2–a1*b2)/(a2^2+b2^2) - Create a test
 * program that asks for the real and imaginary parts of two complex numbers
 * from the user, and displays the results of the four operations, writing the
 * formula as shown above, and replacing the a1, a2, b1 and b2 with the numbers
 * entered by the user.
 *
 * Assumptions - formulas are correct - only 4 numbers are entered (2 for z1,
 * and 2 for z2)
 *
 * Pseudocode: Main.main: 1. ask user for real and imaginary parts of 2 complex
 * numbers 2. create 2 Complex objects from input 3. print out the numbers
 * added/subtracted/multiplied/divided in a table
 *
 * Complex: - store 2 doubles for real/imaginary parts
 *
 * Complex.toString: 1. retrun string represination of complex number in format:
 * a+b*i
 *
 * Complex.add: 1. add the real parts(store) 2. add the imaginary parts(store)
 * 3. create new object from these 2 parts(retrun)
 *
 * Complex.sub: 1. subtract the real parts from each other(store) 2. subtract
 * the imaginary parts from each other(store) 3. create new object from these 2
 * parts(retrun)
 *
 * Complex.mult: 1. compute the real parts using formula: (a1*a2 – b1*b2) 2.
 * compute the imaginary parts using formula: (a1*b2 + b1*a2) 3. create new
 * object from computed parts(retrun)
 *
 * Complex.divide: 1. compute the real parts using formula:
 * (a1*a2+b1*b2)/(a2^2+b2^2) 2. compute the imaginary parts using formula:
 * (b1*a2–a1*b2)/(a2^2+b2^2) 3. create new object from computed parts(retrun)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // get input from user
    System.out.printf("Enter z1 real part: ");
    double z1_real = Double.valueOf(input.readLine());
    System.out.printf("Enter z1 imaginary part: ");
    double z1_imag = Double.valueOf(input.readLine());

    System.out.printf("Enter z2 real part: ");
    double z2_real = Double.valueOf(input.readLine());
    System.out.printf("Enter z2 imaginary part: ");
    double z2_imag = Double.valueOf(input.readLine());

    // create Complex objects
    Complex z1 = new Complex(z1_real, z1_imag);
    Complex z2 = new Complex(z2_real, z2_imag);

    // Print out output as specified
    System.out.println();// for aesthetics

    // add
    System.out.printf("%s + %s = %s\n", z1.toString(), z2.toString(),
        z1.add(z2).toString());
    // subtract
    System.out.printf("%s - %s = %s\n", z1.toString(), z2.toString(),
        z1.sub(z2).toString());
    // multiply
    System.out.printf("%s * %s = %s\n", z1.toString(), z2.toString(),
        z1.mult(z2).toString());
    // divide
    System.out.printf("%s / %s = %s\n", z1.toString(), z2.toString(),
        z1.divide(z2).toString());

    // close stream
    input.close();
    System.exit(0);
  }
}
