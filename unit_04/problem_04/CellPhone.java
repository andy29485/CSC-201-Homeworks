package unit_04.problem_04;

// Name: Andriy Zasypkin
// Date: 2016-03-16
// Unit: 04
// Problem: 04

public class CellPhone extends Electronics {
  private int nPhoneNumber;

  public CellPhone() {
    super("Cell Phone", "Nexus");
    this.getManufacturers().add("Samsung");
    this.nPhoneNumber = 1234567890;
  }

  public CellPhone(String strName, int nPhoneNumber) {
    super("Cell Phone", strName);
    this.nPhoneNumber = nPhoneNumber;
  }

  public void setPhoneNumber(int nPhoneNumber) {
    this.nPhoneNumber = nPhoneNumber;
  }

  public int getPhoneNumber() {
    return this.nPhoneNumber;
  }

  @Override
  public String toString() {
    String strOut = String.format("\n  Phone Number:     %10d\n", nPhoneNumber);
    return super.toString().replaceFirst("\n", strOut);
  }
}
