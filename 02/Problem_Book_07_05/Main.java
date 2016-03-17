//Name:    Andriy Zasypkin
//Date:    2016-01-26
//Unit:    02
//Problem: 03


/* Description:
 *   Write a program that reads in ten numbers and displays the number of
 *     distinct numbers and the distinct numbers separated by exactly one space
 *     (i.e., if a number appears multiple times, it is displayed only once).
 *   Hint: Read a number and store it to an array if it is new. If the number
 *     is already in the array, ignore it. After the input, the array contains
 *     the distinct numbers. Here is the sample run of the program:
 *
 * Assumptions:
 *   - Numbers may(or may not) be all on one line
 *   - Numbers may be doubles
 *
 * Pseudocode:
 *   1. ask user for ten numbers
 *   2. create array(doubles), int counter=0
 *   3. read in line
 *   4. while counter < 10
 *     4.1 split line by non-numbers
 *     4.2 for each number(see step 4.1)(also exit if counter >= 10)
 *       4.2.1 add to array(if not there)
 *       4.2.2 increase counter
 *   5. print array space separated
 */

import java.io.*;
import java.util.*;

public class Main {
  public static final int NUMBER_OF_INPUTS = 10;//number of numbers to read
                                                //default - 10
  public static boolean inList(List<String> list, String strValue) {
    for(String strTmp : list) { //Itterate over list
      if(strTmp.equals(strValue)) //if item matches an element,
        return true;              //  say so
    }
    return false;//if no items in list match, then it's not in the list
  }

  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    int nNums = 0;//Number of items entered
    //Why use string? b/c this removes the need for conversion
    List<String> lstrOut = new ArrayList<String>();//list of non-dup. "numbers"

    while(nNums < NUMBER_OF_INPUTS) {//this loop does work per line entered
                                     //in case the user did not type in the
                                     //needed number of numbers in one line
      System.out.printf("Please enter %d numbers: ", NUMBER_OF_INPUTS-nNums);
      String[] astrNums = input.readLine().split("[^0-9\\.]+");//split line into
                                                               //strings of nums
      for(int i=0; i<astrNums.length && nNums < NUMBER_OF_INPUTS; i++) {
        if(!inList(lstrOut, astrNums[i])) //for each num in line, ignoring those
          lstrOut.add(astrNums[i]);       //over the limit, if not already in
                                          //the list, add to list
        nNums++;//add one to the counter to make use no more than the limit of
      }         //numbers are read(default limit - 10)
    }

    //Output
    System.out.printf("The number of distinct number is %d\n", lstrOut.size());
    System.out.print("The distinct numbers are:");
    for(String strDistNum : lstrOut) {//loop to print the "numbers"
      System.out.printf(" %s", strDistNum);
    }
    System.out.println();//allways end with a new line - don't be mean
  }
}
