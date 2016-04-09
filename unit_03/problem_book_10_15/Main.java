package unit_03.problem_book_10_15;

// Name: Andriy Zasypkin
// Date: 2016-01-26
// Unit: 03
// Problem: 10.15

/*
 * Description: (Geometry: the bounding rectangle) A bounding rectangle is the
 * minimum rectangle that encloses a set of points in a two-dimensional plane,
 * as shown in Figure 10.24d. Write a method that returns a bounding rectangle
 * for a set of points in a two-dimensional plane, as follows: `public static
 * MyRectangle2D getRectangle(double[][] points)` The Rectangle2D class is
 * defined in Programming Exercise 10.13. Write a test program that prompts the
 * user to enter five points and displays the bounding rectangle’s center,
 * width, and height. Here is a sample run: ``` Enter five points: 1.0 2.5 3 4 5
 * 6 7 8 9 10 The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5
 * ```
 *
 * Assumptions: - I guess I'll have to do problem 10.13 as well - However, don't
 * expect me to type that up as well - Both classes(tester and rectagle2d) will
 * be in the same file - For [my] convenience - People may not follow direcions:
 * there may be more than 5 points
 *
 * Pseudocode: 1. Find min and max x/y values 2. COnstruct rect using: (minx,
 * miny, maxx-minx, maxy-miny)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyRectangle2D {
  private double x;
  private double y;
  private double width;
  private double height;

  public MyRectangle2D() {
    this.x = 0;
    this.y = 0;
    this.width = 1;
    this.height = 1;
  }

  public MyRectangle2D(double x, double y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public static MyRectangle2D getRectangle(double[][] points) {
    double minX = points[0][0];
    double minY = points[0][1];
    double maxX = points[0][0];
    double maxY = points[0][1];
    // step 1
    for(double[] point : points) {
      minX = minX < point[0] ? minX : point[0];
      minY = minY < point[1] ? minY : point[1];
      maxX = maxX > point[0] ? maxX : point[0];
      maxY = maxY > point[1] ? maxY : point[1];
    }
    // step 2
    return new MyRectangle2D(minX, minY, maxX - minX, maxY - minY);
  }

  // mutator/accesor methods - see 10.13
  public void setX(double x) {
    this.x = x;
  }

  public double getX() {
    return this.x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getY() {
    return this.y;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getWidth() {
    return this.width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

  // some more required methods - see 10.13
  public double getArea() {
    return this.width * this.height;
  }

  public double getPerimeter() {
    return this.width * 2 + this.height * 2;
  }

  public boolean contains(double x, double y) {
    return x >= this.x && x <= this.x + this.width && y >= this.y &&
           y <= this.y + this.height;
  }

  public boolean contains(MyRectangle2D rect) {
    return this.contains(rect.getX(), rect.getY()) && this.contains(
        rect.getX() + rect.getWidth(), rect.getY() + rect.getHeight());
  }

  public boolean overlaps(MyRectangle2D rect) {
    return this.contains(rect.getX(), rect.getY()) || this.contains(
        rect.getX() + rect.getWidth(), rect.getY() + rect.getHeight());
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter five points: ");// ask for points
    String[] nums = input.readLine().split("[^\\.\\d]+");// split line of input
                                                         // into strs containing
                                                         // numbers

    double[][] points = new double[nums.length / 2][2];// create array of
                                                       // points...
                                                       // see assumptions

    // fill in array right to left, top to bottom with input read earlier
    // assuming structure:
    // {{00, 01},
    // {10, 11},
    // {20, 21}}
    for(int i = 0; i < nums.length; i++) {
      points[i / 2][i % 2] = Double.valueOf(nums[i]);// convert string to double
    }

    MyRectangle2D rect = MyRectangle2D.getRectangle(points);// generate rect

    // print rect info
    System.out.printf("The bounding rectangle's center (%.2f, %.2f)",
        rect.getX() + rect.getWidth() / 2, rect.getY() + rect.getHeight() / 2);
    System.out.printf(", width %.2f, height %.2f\n", rect.getWidth(),
        rect.getHeight());
  }
}
