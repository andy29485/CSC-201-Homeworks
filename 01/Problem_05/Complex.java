//Name:    Andriy Zasypkin
//Date:    2016-01-14
//Unit:    01
//Problem: 05

public class Complex {
  protected double dRealPart;
  protected double dImaginaryPart;

  public Complex(double dRealPart, double dImaginaryPart) {
    this.dRealPart      = dRealPart;
    this.dImaginaryPart = dImaginaryPart;
  }

  //(a1+a2) +  i*(b1+b2)
  public Complex add(Complex num) {
    //compute new real/imaginary parts
    double dRealParts      = this.dRealPart      + num.dRealPart;
    double dImaginaryParts = this.dImaginaryPart + num.dImaginaryPart;

    //create new Complex objcet from computed parts
    return new Complex(dRealParts, dImaginaryParts);
  }

  //(a1-a2) + i*(b1-b2)
  public Complex sub(Complex num) {
    //compute new real/imaginary parts
    double dRealParts      = this.dRealPart      - num.dRealPart;
    double dImaginaryParts = this.dImaginaryPart - num.dImaginaryPart;

    //create new Complex objcet from computed parts
    return new Complex(dRealParts, dImaginaryParts);
  }

  //(a1*a2 – b1*b2) + i*(a1*b2 + b1*a2)
  public Complex mult(Complex num) {
    //Define variables - for easier computation
    double a1 = this.dRealPart;
    double a2 = num.dRealPart;
    double b1 = this.dImaginaryPart;
    double b2 = num.dImaginaryPart;

    //compute new real/imaginary parts
    double dRealParts      = (a1*a2 - b1*b2);
    double dImaginaryParts = (a1*b2 + b1*a2);

    //create new Complex objcet from computed parts
    return new Complex(dRealParts, dImaginaryParts);
  }

  //(a1*a2+b1*b2)/(a2^2+b2^2) + i*(b1*a2–a1*b2)/(a2^2+b2^2)
  public Complex divide(Complex num) {
    //Define variables - for easier computation
    double a1 = this.dRealPart;
    double a2 = num.dRealPart;
    double b1 = this.dImaginaryPart;
    double b2 = num.dImaginaryPart;

    //compute new real/imaginary parts
    double dRealParts      = (a1*a2 + b1*b2)/(a2*b2 + b2*b2);
    double dImaginaryParts = (b1*a2 - a1*b2)/(a2*a2 + b2*b2);

    //create new Complex objcet from computed parts
    return new Complex(dRealParts, dImaginaryParts);
  }

  //return string represination of Complex number object
  public String toString() {
    return dRealPart + "+i*" + dImaginaryPart;
  }
}
