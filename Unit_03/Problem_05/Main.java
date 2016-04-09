package Unit_03.Problem_05;

// Name: Andriy Zasypkin
// Date: 2016-02-08
// Unit: 03
// Problem: 05

/*
 * Description: Write a program which will accept a string from the keyboard,
 * "Java is fun!" Your program must determine the capacity of the string. Then,
 * append a second string, "I love it!" to the first string. At this point you
 * will enter a string "Yes, " and insert this string so that the output of the
 * entire string will display "Java is fun. Yes, I love it!" Directions: -
 * Create a class called Builder. - Using the StringBuilder class, write a
 * program which will accept a string from the keyboard, "Java is fun!" - Your
 * program must determine and display the capacity of the string. - Append a
 * second string, "I love it!" to the first string. - Require the user to enter
 * a string "Yes, " - Insert the string, "Yes " at the correct location, such
 * that the output of the entire string will be "Java is fun. Yes, I love it!" -
 * Display your output using clear and appropriate messages.
 *
 * Assumptions: - I see no point in creating a class called Builder - but it is
 * required... - but not described... so I guess I'll have to assume stuff -
 * builder will contain a StringBuilder and an int(original string len) -
 * bulider will have method append(see steps) - assuming "Java is fun!" was
 * actually supposed to be "Java is fun. " - assumption based upon later part of
 * directions - Note there is now a period and a space - The strings that should
 * be inputed are always the same...
 *
 * Pseudocode: Builder.append(see assumptions - recursion[sort of]): 1. 1 arg -
 * string 2. insert arg into instance var string
 *
 * Main.main: 1. create builder from keyboard 2. builder.append("I Love it!") 3.
 * builder.append(input line) 4. print builders string
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // step 1 - PLEASE READ THE ASSUMPUTIONS
    System.out.print("Please enter the string \"Java is fun. \": ");
    Builder builder = new Builder(input.readLine());

    // step 2 - no need to read assuptions, but this was a weird problem
    builder.append("I Love it!");

    // step 3 - PLEASE READ THE ASSUMPUTIONS
    System.out.print("Please enter the string \"Yes, \": ");
    builder.append(input.readLine());

    // step 4 - PLEASE READ THE ASSUMPUTIONS
    System.out.printf("The end result is:\n%s\n", builder.toString());

    // close stream
    input.close();

    System.exit(0);
  }
}
