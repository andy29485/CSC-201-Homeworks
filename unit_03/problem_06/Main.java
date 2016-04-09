package unit_03.problem_06;

// Name: Andriy Zasypkin
// Date: 2016-02-08
// Unit: 03
// Problem: 06

/*
 * Description: Your program will display each original character, determine and
 * display whether the character is a digit or a letter, and redisplay the
 * character according to the directions below. Directions: - Create a class
 * called CharacterArray. - The scanner class is not required - Write a program
 * which will accept an alpha numeric string at the keyboard. - Store the
 * string, of any length, into a character array, for example: - NVCC Manassas
 * Campus 6901 Sudley Road Manassas VA 20109 - For each visible character: -
 * Display the original character - Determine and display whether the character
 * is a digit or a letter - If the character is a lower case letter, redisplay
 * the character in upper case - If the character is a upper case letter,
 * redisplay the character in lower case - If the character is a digit, display
 * it as an * (asterisk) - Display your output using clear and appropriate
 * messages.
 *
 * Assumptions: - The program will work character by character rather than
 * across the whole string(which would be easier in this case - Non-alpha
 * numeric chars will be ignored(with the exception of space(' ') - End of
 * string will be denoted by a new line('\n') - As in, the string will not span
 * multiple lines - Java uses Unicode(not so much an assumption as a fact but
 * important) - required for step 3.3
 *
 * Pseudocode: 1. as for/read string 2. print output message 3. for each char in
 * string 3.1 if char is space - display 3.2 if char is upper - display 3.3 if
 * char is lower - display upper version(-32) 3.4 if char is digit - display '*'
 * 4. print new line
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // step 1
    System.out.print("Enter an alpha numeric string: ");
    String strIn = input.readLine();

    // step 2
    System.out.print("Processed string: ");

    // step 3
    for(char c : strIn.toCharArray()) {
      if(c == ' ' || (c >= 'A' && c <= 'Z')) {// step 3.1 and 3.2
        System.out.print(c);
      }
      else if(c >= 'a' && c <= 'z') {// step 3.3
        System.out.print((char) (c - 32));
      }
      else if(c >= '0' && c <= '9') {// step 3.4
        System.out.print('*');
      }
    }

    System.out.println();

    // close stream
    input.close();

    System.exit(0);
  }
}
