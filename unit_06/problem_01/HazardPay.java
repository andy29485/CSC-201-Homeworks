package unit_06.problem_01;

public class HazardPay extends PayCalculator {

  public HazardPay() {}

  public HazardPay(double payRate) {
    super(payRate);
  }

  @Override
  public double computePay(double hours) {
    return super.computePay(hours) * 1.5;
  }
}
