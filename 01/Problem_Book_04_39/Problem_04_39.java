//Name:    Andriy Zasypkin
//Date:    2016-01-13
//Unit:    01
//Problem: 4.13

/* Description:
 *   - Program told me to do problem 39(ch 4), my book shows 26 problems...
 *       therefore I'll do 13 (39%26).
 *   - (Vowel or consonant?) Write a program that prompts the user to enter a
 *       letter and check whether the letter is a vowel or consonant
 *
 * Assumptions
 *   - Only a single character will be entered
 *   - Letter will be in range A-Z or a-z
 *     - other things are invalid inputs
 *   - Letter can be upper or lower case(see above)
 *   - only one input per run
 *
 * Pseudocode:
 *   1. Ask for input/take in inputs
 *   2. Check if letter is in list "AEIOUaeiou"
 *      then print vowel
 *   3. Check if letter is b <= <letter> <= z or B <= <letter> <= Z
 *      then print consonant
 *   4. else print invalid
 */

import java.io.*;

public class Problem_04_39 {
  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter a letter: ");
    String in = input.readLine();
    if(in.length() != 1) {
      System.out.printf("Please enter 1 char, not %d\n", in.length());
      System.exit(-1);
    }
    char letter = in.charAt(0);

    if("AEIOUaeiou".indexOf(letter) != -1) {
      System.out.printf("%c is a vowel\n", letter);
    }
    else if(('b' <= letter && letter <= 'z')
         || ('B' <= letter && letter <= 'Z')) {
      System.out.printf("%c is a consonant\n", letter);
    }
    else {
      System.out.printf("%c is an invalid input\n", letter);
    }

    //close stream
    input.close();
    System.exit(0);
  }
}
