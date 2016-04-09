package Unit_04.Problem_04;

// Name: Andriy Zasypkin
// Date: 2016-03-16
// Unit: 04
// Problem: 04

public class Computer extends Electronics {
  private String strProcessor;

  public Computer() {
    super("Computer", "RPi");
    this.getManufacturers().add("South Wales");
    this.getManufacturers().add("Element14");
    this.getManufacturers().add("Premier Farnell");
    this.strProcessor = "ARMv7";
  }

  public Computer(String strName, String strProcessor) {
    super("Computer", strName);
    this.strProcessor = strProcessor;
  }

  public void setProcessor(String strProcessor) {
    this.strProcessor = strProcessor;
  }

  public String getProcessor() {
    return this.strProcessor;
  }

  @Override
  public String toString() {
    String strOut = String.format("\n  Processor:        %s\n", strProcessor);
    return super.toString().replaceFirst("\n", strOut);
  }
}
