package unit_08.problem_book_17_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// Name: Andriy Zasypkin
// Date: 2016-03-25
// Unit: 08
// Problem: 17.15 p.703

/*-
 * Description(17.14): (Encrypt files)
 *   Encode the file by adding 5 to every byte in the file. Write a program
 *   that prompts the user to enter an input file name and an output file name
 *   and saves the encrypted version of the input file to the output file.
 *
 * Description(17.15): (Decrypt files)
 *   Suppose a file is encrypted using the scheme in Programming
 *   Exercise 17.14. Write a program to decode an encrypted file. Your program
 *   should prompt the user to enter an input file name for the encrypted file
 *   and an output file name for the unencrypted version of the input file.
 *
 * Assumptions:
 *  - I can combine the two assignments into one
 *  - I do not simply add 5
 *    - but rather add 5 then mod 255 the result
 *
 * Pseudocode:
 *  1. to encrypt/decrypt
 *    1.1 open both files
 *      1.1.1 catch error - print
 *    1.2 read byte +- 5 % 255 write
 *      1.2.1 catch error - print
 *    1.3 close files
 *  2. create input obj
 *  3. ask if user wants to decrypt of encrypt
 *    3.1 keep looping if invalid input
 *    3.2 unless 1 or 3 args are provided then use first arg as input
 *  4. if 2 or 3 args are provided use them as input/output files
 *    4.1 otherwise ask user for files
 *  5. attempt to encrypt/decrypt
 *    5.1 if success print so
 */

public class Main {
  public static void main(String[] args) {
    // step 2
    Scanner scan = new Scanner(System.in);
    byte action = -1;

    // step 3.2
    args[0] = args[0].toLowerCase().substring(0, 2);
    if((args.length == 1 || args.length == 3) && args[0].matches("^[ed]"))
      action = (byte) (args[0].equals("e") ? 0 : 1);

    // step 3
    while(action < 0) {// step 3.1
      System.out.print("Do you wish to encrypt or decrypt(e/d): ");
      String in = scan.nextLine().toLowerCase().substring(0, 2);
      if(in.matches("^[ed]"))
        action = (byte) (in.equals("e") ? 0 : 1);
    }

    // step 4
    String file1 = null;
    String file2 = null;
    if(args.length == 2) {
      file1 = args[0];
      file2 = args[1];
    }
    else if(args.length == 3) {
      file1 = args[1];
      file2 = args[2];
    }
    else {
      do {// step 4.1
        System.out.printf("Enter file to %s: ",
            action == 0 ? "encrypt" : "decrypt");
        File tmp = new File(scan.nextLine());
        if(tmp.canRead())
          try {
            file1 = tmp.getCanonicalPath();
          }
          catch(IOException e) {} // file cannot be read
      } while(file1 == null);

      do {// step 4.1
        System.out.printf("Enter file to %s: ",
            action == 0 ? "encrypt" : "decrypt");
        File tmp = new File(scan.nextLine());
        if(tmp.getParentFile().exists() && tmp.canWrite())
          try {
            file1 = tmp.getCanonicalPath();
          }
          catch(IOException e) {} // file cannot be read
      } while(file1 == null);

    }

    // step 5
    if(action == 0) {
      if(encrypt(file1, file2))
        System.out.println("encryption successful");// step 5.1
    }
    else {
      if(decrypt(file1, file2))
        System.out.println("decryption successful");// step 5.1
    }

    scan.close();
  }

  /**
   * @param fileIn
   *          is the file to encrypt
   * @param fileOut
   *          is the file to save encrypted copy
   * @return if encryption was a success
   */
  public static boolean encrypt(String fileIn, String fileOut) {
    // step 1.1a
    FileInputStream file_in = null;
    FileOutputStream file_out = null;
    try {
      // step 1.1b
      file_in = new FileInputStream(fileIn);
      file_out = new FileOutputStream(fileIn);

      // step 1.2
      int b = file_in.read();
      while(b != -1) {
        file_out.write((b - 251) % 255);
        b = file_in.read();
      }
    }
    catch(FileNotFoundException e) {// step 1.1.1
      System.out.println(
          "could not encrypt - file not found or location not writable");
      return false;
    }
    catch(IOException e) {// step 1.2.1
      System.out.println("could not encrypt - problems reading/writing");
      return false;
    }
    finally { // step 1.3
      try {
        if(file_in != null)
          file_in.close();
        if(file_out != null)
          file_out.close();
      }
      catch(IOException e) {} // should not happen, if it does, it shouln't
                              // matter
    }
    return true;
  }

  /**
   * @param fileIn
   *          is the file to decrypt
   * @param fileOut
   *          is the file to save decrypted copy
   * @return if encryption was a success
   */
  public static boolean decrypt(String fileIn, String fileOut) {
    // step 1.1a
    FileInputStream file_in = null;
    FileOutputStream file_out = null;
    try {
      // step 1.1b
      file_in = new FileInputStream(fileIn);
      file_out = new FileOutputStream(fileIn);

      // step 1.2
      int b = file_in.read();
      while(b != -1) {
        file_out.write((b - 5) % 255);
        b = file_in.read();
      }
    }
    catch(FileNotFoundException e) {// step 1.1.1
      System.out.println(
          "could not encrypt - file not found or location not writable");
      return false;
    }
    catch(IOException e) {// step 1.2.1
      System.out.println("could not encrypt - problems reading/writing");
      return false;
    }
    finally { // step 1.3
      try {
        if(file_in != null)
          file_in.close();
        if(file_out != null)
          file_out.close();
      }
      catch(IOException e) {} // should not happen, if it does, it shouln't
                              // matter
    }
    return true;
  }
}
