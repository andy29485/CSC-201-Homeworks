package Unit_04.Problem_04;

// Name: Andriy Zasypkin
// Date: 2016-03-16
// Unit: 04
// Problem: 04
import java.util.ArrayList;
import java.util.List;

public abstract class Electronics {
  private double       dMass;
  private double       dCost;
  private double       dPowerUsage;
  private List<String> lstrManufacturers;
  private String       strName;
  private String       strType;

  protected Electronics(String strType) {
    this.dMass = 0;
    this.dCost = 0;
    this.dPowerUsage = 0;
    this.lstrManufacturers = new ArrayList<String>();
    this.strType = strType;
    this.strName = "";
  }

  protected Electronics(String strType, String strName) {
    this.dMass = 0;
    this.dCost = 0;
    this.dPowerUsage = 0;
    this.lstrManufacturers = new ArrayList<String>();
    this.strType = strType;
    this.strName = strName;
  }

  protected Electronics(String strType, String strName, double dMass,
                        double dCost, double dPowerUsage,
                        String... astrManufacturers) {
    this.dMass = dMass;
    this.dCost = dCost;
    this.dPowerUsage = dPowerUsage;
    this.lstrManufacturers = new ArrayList<String>();
    this.strType = strType;
    this.strName = strName;
    for(String manufacturer : astrManufacturers) {
      lstrManufacturers.add(manufacturer);
    }
  }

  public void setMass(double dMass) {
    this.dMass = dMass;
  }

  public double getMass() {
    return this.dMass;
  }

  public void setPrice(double dCost) {
    this.dCost = dCost;
  }

  public double getPrice() {
    return this.dCost;
  }

  public void setPowerUsage(double dPowerUsage) {
    this.dPowerUsage = dPowerUsage;
  }

  public double getPowerUsage() {
    return this.dPowerUsage;
  }

  public String getType() {
    return this.strType;
  }

  public List<String> getManufacturers() {
    return this.lstrManufacturers;
  }

  public void setName(String strName) {
    this.strName = strName;
  }

  public String getName() {
    return this.strName;
  }

  @Override
  public String toString() {
    String out = "%s(%s):\n" + "  Cost:            $%6.2f\n" +
                 "  Mass:             %6.2f\n" +
                 "  Power Usage:      %8.4f kW h\n" + "  Manufacturers:\n";

    for(String manufacturer : lstrManufacturers) {
      out += "    " + manufacturer + "\n";
    }
    return String.format(out, this.strName, this.strType, this.dCost,
        this.dMass, this.dPowerUsage);
  }
}
