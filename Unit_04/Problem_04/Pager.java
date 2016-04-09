package Unit_04.Problem_04;

// Name: Andriy Zasypkin
// Date: 2016-03-16
// Unit: 04
// Problem: 04

public class Pager extends Electronics {
  private int nNumber;

  public Pager() {
    super("Pager", "Generic Brand");
    this.getManufacturers().add("Everyone");
    this.nNumber = 0;
  }

  public Pager(String strName, int nNumber) {
    super("Pager", strName);
    this.nNumber = nNumber;
  }

  public void setPagerNumber(int nNumber) {
    this.nNumber = nNumber;
  }

  public int getPagerNumber() {
    return this.nNumber;
  }

  @Override
  public String toString() {
    String strOut = String.format("\n  Pager Number:     %6d\n", nNumber);
    return super.toString().replaceFirst("\n", strOut);
  }
}
