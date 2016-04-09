package unit_03.problem_02;

// Name: Andriy Zasypkin
// Date: 2016-02-08
// Unit: 03
// Problem: 02

/*
 * Description: A locker for a high school student has a locker number, a
 * student name assigned to it, a number of books stored inside the locker, and
 * also a combination lock. The lock is constructed with a combination that has
 * 3 numbers between 0 and 39. The lock is opened if the user turns the lock to
 * the right to the first combination number, and then left to the second
 * combination number, and then right to third combination number. When the dial
 * is reset it will then be pointing to 0. Create a class to represent the
 * locker and another class to represent the combination lock. The Locker class
 * will include an attribute that is of type CombinationLock. Each class must
 * include a constructor with no input argument and also a constructor that
 * requires input arguments for all attributes. Each class must include the
 * appropriate set and get methods. Each class must include a method to print
 * out all attributes.
 *
 * CombinationLock must include the following problem specific methods: - A
 * method named resetDial that resets the dial to position 0. - A method named
 * turnLeft that will turn the dial to the left a certain number of ticks from
 * the current position. The number of ticks to turn will be passed as an input
 * argument to this method. - A method named turnRight that will turn the dial
 * to the right a certain number of ticks from the current position. The number
 * of ticks to turn will be passed as an input argument to this method. - A
 * method named openLock that will try to open the lock with a combination. The
 * combination that is tried will be passed as three input arguments to this
 * method. This method will return true if the lock opens successfully and will
 * return false if the lock is not opened successfully.
 *
 * Locker must include the following problem specific methods: - A method named
 * putBookInLocker that puts one additional book into the locker. This method
 * does not take any input arguments and does not return a value. - A method
 * named removeBookFromLocker that tries to remove one book from the locker.
 * This method does not take an input argument, but does return a value. The
 * book returns true if the book is removed successfully and returns false if
 * the book is not removed successfully. - A method named openLocker that will
 * try to open the locker. This method will prompt the user to input the three
 * numbers in the combination to try. This method will print out the success or
 * failure of opening the locker.
 *
 * This main method must complete the following: - Creates locker number 100 for
 * Mickey Mouse. The combination for this locker is 28, 17, 39. This locker will
 * include 3 books. - Create locker number 275 for Donald Duck. The combination
 * for this locker is 35, 16, 27. This locker will include 0 books. - Try to
 * open the locker for Mickey Mouse using 15, 18, 18. - Add three books to
 * Mickey Mouse’s locker. - Remove one book from Donald Duck’s locker. - After
 * all of these actions have been completed, print out the current state of both
 * lockers to the console.
 *
 * Assumptions: - CombinationLock's second constructor will not include *all* -
 * they can't dictate how much has already been entered when the lock is first
 * created - if the dial is turned incorectly then the dial is reset - openLock
 * DOES reste dial at begining - openLock does NOT reset dial at END - As I do
 * not believe in reating readers in methods, the openLocker method will take
 * one argument of BufferedReader - add/remove book does not need locker to be
 * open(good locker)
 *
 * Pseudocode: turnLeft / right: 0. see the README comment in that file but
 * essentualy 1. check if correct attemp(if not reset) 2. turn lock(for now
 * assume correct and say that turn was successful) 3. now check if actually
 * corret - reset if not
 *
 * openLock: 1. reset dial 2. turn using given numbers 3. check if attemp 3 was
 * successful - return true if true, false otherwise
 *
 * openLocker: 1. ask for numbers 2. use openLock() to test 2.1 print open if
 * true, closed otherwise
 *
 * putBookInLocker: 1. add 1 to book
 *
 * removeBookFromLocker: 0. could not think of a fun way to do this... 1. if
 * books > 0 books-- return true - or just return false.
 *
 * main: 0. see description
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    Locker locker1 = new Locker(28, 17, 39, 100, 3, "Mickey Mouse");
    Locker locker2 = new Locker(35, 16, 27, 275, 0, "Donald Duck");

    locker1.openLocker(input);
    for(int i = 0; i < 3; i++)
      locker1.putBookInLocker();
    locker2.removeBookFromLocker();

    System.out.println(locker1);
    System.out.println(locker2);

    // close stream
    input.close();

    System.exit(0);
  }
}
