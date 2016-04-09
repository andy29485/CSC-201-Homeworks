package Unit_03.Problem_02;

// Name: Andriy Zasypkin
// Date: 2016-02-10
// Unit: 03
// Problem: 02

import java.io.BufferedReader;

public class Locker {
  private int             nNum;
  private int             nBooks;
  private String          strName;
  private CombinationLock lock;

  public Locker() {
    this.lock = new CombinationLock();
    this.nNum = 0;
    this.nBooks = 0;
    this.strName = "";
  }

  public Locker(int num1, int num2, int num3, int nNum, int nBooks,
                String strName) {
    this.lock = new CombinationLock(num1, num2, num3);
    this.nNum = nNum;
    this.nBooks = nBooks;
    this.strName = strName;
  }

  public void openLocker(BufferedReader input) throws java.io.IOException {
    System.out.printf("Attempting to open %s's Locker\n", this.strName);
    System.out.print("Enter first number: ");
    int num1 = Integer.valueOf(input.readLine());

    System.out.print("Enter second number: ");
    int num2 = Integer.valueOf(input.readLine());

    System.out.print("Enter third number: ");
    int num3 = Integer.valueOf(input.readLine());

    if(this.lock.openLock(num1, num2, num3))
      System.out.println("The locker has oppened");
    else // thou shall not pass
      System.out.println("The locker remains closed");
  }

  public void putBookInLocker() {
    nBooks++;
  }

  public boolean removeBookFromLocker() {
    if(nBooks > 0) {
      nBooks--;
      return true;
    }
    return false;
  }

  public void setBooks(int nBooks) {
    this.nBooks = nBooks;
  }

  public int getBooks() {
    return this.nBooks;
  }

  public void setName(String strName) {
    this.strName = strName;
  }

  public String getName() {
    return this.strName;
  }

  public void setNumber(int nNum) {
    this.nNum = nNum;
  }

  public int getNumber() {
    return this.nNum;
  }

  public CombinationLock getLock() {
    return this.lock;
  }

  @Override
  public String toString() {
    return String.format("Locker %d: belongs to %s, has %d book%s in it",
        this.nNum, this.strName, this.nBooks, (this.nBooks == 1 ? "" : "s"));
  }
}
