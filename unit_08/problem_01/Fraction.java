package unit_08.problem_01;

import java.io.Serializable;

public class Fraction implements Serializable {
  private static final long serialVersionUID = -7054306473604804021L;

  private int               numerator;
  private int               denominator;
  private static final char slash            = '/';

  public Fraction() {
    this.numerator = 0;
    this.denominator = 1;
  }

  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public void setDenominator(int denominator) {
    this.denominator = denominator;
  }

  public static char getSlash() {
    return slash;
  }
}
