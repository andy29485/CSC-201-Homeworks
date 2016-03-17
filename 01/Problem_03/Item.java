//Name:    Andriy Zasypkin
//Date:    2016-01-15
//Unit:    01
//Problem: 03

public class Item {
  //Prices and names of items should not change, so they are final.
  //  and since they are final, I can make them public, since no-one can change
  //  them anyway. This way there is no need to use accesor method.
  public final String strName;//name of item
  public final int nPrice;    //cost(in cents) of item

  public Item(String strName, int nPrice) {
    this.strName = strName;
    this.nPrice  = nPrice;
  }

  //simifies adding items to the list
  public static Item add(String strName, int nPrice) {
    return new Item(strName, nPrice);
  }
}
