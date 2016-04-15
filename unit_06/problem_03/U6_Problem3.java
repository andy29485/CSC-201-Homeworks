package unit_06.problem_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 03

/*-
 * Description:
 *   Create an interface MessageDecoder that has a single abstract method
 *     decode(cipherText), where cipherText is the message to be decoded.
 *     The method will return the decoded message. Modify the classes
 *     SubstitutionCipher and ShuffleCipher, as described in Programming
 *     Problem 2, above, so that they implement MessageDecoder as well as
 *     the interface MessageEncoder described above. Finally, write a program
 *     that allows a user to encode and decode messages
 *     entered on the keyboard.
 *
 * Assumptions:
 *   - Both the encoded and decoded versions of the string will be printed
 *
 * Pseudocode:
 *   1. TODO
 */

public class U6_Problem3 {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    SubstitutionCipher sub = new SubstitutionCipher(3);
    ShuffleCipher shuf = new ShuffleCipher(5);

    System.out.print("Enter a string: ");
    String strPlain = input.readLine();

    System.out.printf("SubstitutionCipher encode: %s\n", sub.encode(strPlain));
    System.out.printf("SubstitutionCipher decode: %s\n",
        sub.decode(sub.encode(strPlain)));

    System.out.printf("ShuffleCipher encode: %s\n", shuf.encode(strPlain));
    System.out.printf("ShuffleCipher decode: %s\n",
        shuf.decode(shuf.encode(strPlain)));

    System.exit(0);
  }
}
