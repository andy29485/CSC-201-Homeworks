package unit_01.problem_03;

import java.util.ArrayList;
// Name: Andriy Zasypkin
// Date: 2016-01-15
// Unit: 01
// Problem: 03
import java.util.List;

public class VendingMachine {
  private List<Item> items; // list of item pairs: prduct name->price
  private int        nMoney;// mony user put into machine(# of cents)

  public VendingMachine() {
    items = new ArrayList<Item>();// create an empy list of items
    nMoney = 0;// Set amount of mony put into machine to 0 cents
    // fill machine with items and their prices
    items.add(Item.add("Soda", 75));
    items.add(Item.add("Water", 32));
    items.add(Item.add("Candy Bar", 55));
    items.add(Item.add("Trail Mix", 155));
    items.add(Item.add("Chips", 100));
    items.add(Item.add("Crackers", 81));
  }

  // print out a list of products
  public void listItems() {
    System.out.println("Prices:");// header
    for(int i = 0; i < items.size(); i++) {// for each item print id, name and
                                           // price
      System.out.printf("%02d: %-20s - $%4.2f\n", i + 1, items.get(i).strName,
          items.get(i).nPrice / 100.);
    }
  }

  // adds mony to machine(input cents)
  public void add(int nMoney) {
    this.nMoney += nMoney;
  }

  // returns true if there is money in machine
  public boolean hasChange() {
    return nMoney > 0;
  }

  // print out change, by coin type
  public void giveChange() {
    int quarters = nMoney / 25;// calculate number of quarter that fit in change
    nMoney %= 25; // set money to remainder of change
    int dimes = nMoney / 10;// calculate number of dimes that fit in change
    nMoney %= 10; // set money to remainder of change
    int nickles = nMoney / 5; // calculate number of nickles that fit in change
    nMoney %= 5; // set money to remainder of change

    // money should now only contain the number of pennies left over

    // print change table
    System.out.println("Change");
    System.out.printf("Quarters: %d\n", quarters);
    System.out.printf("Dimes:    %d\n", dimes);
    System.out.printf("Nickles:  %d\n", nickles);
    System.out.printf("Pennies:  %d\n", nMoney);

    nMoney = 0;// reset money back to zero as change has been returned
  }

  // return 0 if transaction ok, no change
  // return 1 if transaction ok, change available
  // return 2 if product id does not exist
  // return 3 if there is not enough money
  public int buy(int id) {
    if(id < 1 || id > items.size())// check if item exists
      return 2;

    int price = items.get(id - 1).nPrice;

    if(price > nMoney)// check there is enough money for item
      return 3;

    nMoney -= price;// remove money for product

    if(nMoney == 0)
      return 0; // no change, transaction ok
    else
      return 1; // change, transaction ok
  }
}
