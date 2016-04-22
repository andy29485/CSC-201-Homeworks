package unit_07.problem_02;

// Name: Andriy Zasypkin
// Date: 2016-04-19
// Unit: 07
// Problem: 02

public class Cycle {
  private double numberOfWheels;
  private double weight;

  public Cycle() {
    this(100, 1000);
  }

  public Cycle(double numberOfWheels, double weight) {
    if(numberOfWheels <= 0 || weight <= 0)
      throw new IllegalArgumentException(
          "Values cannot be less than or equal to zero");
    this.numberOfWheels = numberOfWheels;
    this.weight = weight;
  }

  public double getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(double numberOfWheels) {
    // step 4
    if(numberOfWheels <= 0)
      throw new IllegalArgumentException(
          "Values cannot be less than or equal to zero");
    this.numberOfWheels = numberOfWheels;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    // step 4
    if(weight <= 0)
      throw new IllegalArgumentException(
          "Values cannot be less than or equal to zero");
    this.weight = weight;
  }

  @Override
  public String toString() {
    return String.format("%f kg cycle with %f wheels", weight, numberOfWheels);
  }
}
