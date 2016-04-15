package unit_06.problem_02;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 02

/*-
 * Description:
 *   Create an interface MessageEncoder that has a single abstract method
 *     encode(plainText), where plainText is the message to be encoded.
 *     The method will return the encoded message.
 *
 *   Create a class SubstitutionCipher that implements the interface
 *     MessageEncoder, as described above. The constructor should have one
 *     parameter called shift. Define the method encode so that each letter is
 *     shifted by the value in shift. Define the method encode so that each
 *     letter is shifted by the value in shift. For example, if shift is 3,
 *     a will be replaced by d, b will be replaced by e, c will be replaced
 *     by f, and so on. (Hint: You may wish to define a private method that
 *     shifts a single character.)
 *
 *   Create a class ShuffleCipher that implements the interface MessageEncoder,
 *     as described above. The constructor should have one parameter called n.
 *     Define the method encode so that the message is shuffled n times. To
 *     perform one shuffle, split the message in half and then take characters
 *     from each half alternately. For example, if the message is "abcdefghi",
 *     the halves are abcde and fghi. The shuffled message is afbgchdie.
 *     Hint: You may wish to define a private method that performs one shuffle.
 *
 * Assumptions:
 *   - accessor/mutator methods are not needed for the classes
 *   - there is no method do decode a message
 *   - for the SubstitutionCipher only letter will be decoded
 *
 * Pseudocode:
 *   1. SubstitutionCipher
 *     1.1 create empty string for output
 *     1.2 for each char
 *       1.2.1 if char is a letter
 *         1.2.1.1 convert char to range [0-25] from [A-Z] or [a-z]
 *         1.2.1.2 add shift
 *         1.2.1.3 mod back to range [0-25]
 *         1.2.1.4 shift back to range [A-Z] or [a-z]
 *       1.2.3 add char to output
 *     1.3 return output
 *   2. ShuffleCipher
 *     2.1 for n times
 *       2.1.1 create empty temp string
 *       2.1.2 split string in half(2 new strings)
 *       2.1.3 create counter start at zero
 *       2.1.4 while temp len < original len
 *         2.1.4.1 if left len < counter
 *           2.1.4.1.1 add left char at counter to temp
 *         2.1.4.2 if right len < counter
 *           2.1.4.2.1 add right char at counter to temp
 *         2.1.4.3 increase counter
 *       2.1.5 set original string to temp
 *     2.2 return the original(which was modified)
 *
 */

public class U6_Problem2 {
  public static void main(String[] args) {
    MessageEncoder sub = new SubstitutionCipher(3);
    MessageEncoder shuf = new ShuffleCipher(2);

    System.out.println("SubstitutionCipher: " + sub.encode("abcdefghi"));
    System.out.println("ShuffleCipher: " + shuf.encode("abcdefghi"));

    System.exit(0);
  }
}
