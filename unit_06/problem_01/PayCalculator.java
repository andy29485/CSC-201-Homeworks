package unit_06.problem_01;

public abstract class PayCalculator {
  private double payRate;

  public PayCalculator() {
    this.payRate = 0;
  }

  public PayCalculator(double payRate) {
    this.payRate = payRate;
  }

  public double computePay(double hours) {
    return hours * this.payRate;
  }
}
