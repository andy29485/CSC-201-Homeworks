package Unit_01.Problem_03;

// Name: Andriy Zasypkin
// Date: 2016-01-13
// Unit: 01
// Problem: 03

/*
 * Description: - Write a program that simulates the functionality of a vending
 * machine having the following characteristics: - The vending machine offers 5
 * products - The vending machine accepts coins, 1 dollar bills, and 5 dollar
 * bills - The change is always given in coins, with maximum possible number of
 * coins in each value: 25, 10, 5 or 1 cent. - The selections available for user
 * are numbers from 1 to 5. - The user enters the money – simulate the action
 * through a loop that ends when the user enters 0. Each coin, or paper bill
 * will be read individually. - The user makes the selection, and the machine
 * allows a maximum 4 other selections if the amount entered doesn’t cover the
 * price of the item. - Once an item is delivered, the machine gives the change
 * in coins. - There is no increment for the money during one selection. - The
 * user can stop the selection at any time by entering 0 for the product
 * selection. - If the user chooses to cancel the selection, the machine returns
 * the initial amount in coins. - Display the outcome of the operation for each
 * alternative you consider possible for the vending machine. - Make sure that
 * the machine returns the correct change at all times. - Use appropriate
 * selection and repetition loops to solve the problem - Write a test program
 * that would take at least 3 combinations of amounts entered and choices of
 * products, and displays the results of all three trials. You can include the
 * vending machine program as a method in the testing program.
 *
 * Assumptions - Products can be hard-coded - Machine contains an infinite
 * number of all coin types(25,10,5,1)
 *
 * Pseudocode: 1. for 3 times: - print item list - get money in, until zero is
 * Inputed - if invalid, do not accept - print invalid - ask for product and
 * Attempt a vend - invalid id or insufficient funds: error try again - up to 4
 * trys - return change as needed
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader input;
  private static VendingMachine vm;

  public static void vend() throws IOException {
    // list items and prices
    vm.listItems();

    // take money int
    int nMoney;
    do {
      System.out.print("Put money in machine: ");// ask for money
      nMoney = (int) (Double.valueOf(input.readLine()) * 100);// convert to
                                                              // cents
      if(nMoney == 0 || nMoney == 1 || nMoney == 5 || nMoney == 10 ||
         nMoney == 25 || nMoney == 100 || nMoney == 500) {// check valid amount
        vm.add(nMoney);// add mony if valid
      }
      else {// print invalid - if invalid amount
        System.out.println("Vending Machine cannot accept this money");
      }
    } while(nMoney != 0);// if zero - exit loop

    int id = -1;
    int trials = 0;
    do {
      System.out.print("Enter id of product: ");
      id = Integer.valueOf(input.readLine());
      int return_code = vm.buy(id);
      if(return_code == 0) {
        System.out.println("Product vended, no change");
      }
      else if(return_code == 1) {
        System.out.println("Product vended");
        vm.giveChange();
      }
      else if(return_code == 2) {
        System.out.println("Product id does not exits");
        id = -1;
      }
      else {
        System.out.println("Insufficient money");
        id = -1;
      }
      trials++;
    } while(id == -1 && trials < 4);

    // return change if # of chances runs out or user cancels vend
    if(vm.hasChange()) {
      vm.giveChange();
    }
  }

  public static void main(String[] args) throws IOException {
    // create an input reader and vending machine objects
    input = new BufferedReader(new InputStreamReader(System.in));
    vm = new VendingMachine();

    for(int i = 0; i < 3; i++) {// vend 3 times
      vend();
    }
    System.exit(0);

    // close stream
    input.close();
  }
}
