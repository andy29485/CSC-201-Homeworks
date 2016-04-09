package unit_03.problem_03;

// Name: Andriy Zasypkin
// Date: 2016-02-14
// Unit: 03
// Problem: 03

public class Cycle {
  // [A] 1
  private int numberOfWheels;
  private int weight;

  // [B] 1
  public Cycle() {
    this(100, 1000);
  }

  // [A] 3 and [B] 1.1
  public Cycle(int numberOfWheels, int weight) {
    this.numberOfWheels = numberOfWheels;
    this.weight = weight;
  }

  // [A]
  @Override
  public String toString() {
    return String.format("%d kg cycle with %d wheels", weight, numberOfWheels);
  }
}
