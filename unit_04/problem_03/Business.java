package unit_04.problem_03;

// Name: Andriy Zasypkin
// Date: 2016-03-17
// Unit: 04
// Problem: 03

public class Business extends Course {
  public Business() {
    super("CSC", "Business and Public Services", 201);
  }

  public Business(String strCourseName, int nCourseNumber) {
    super(strCourseName, "Business and Public Services", nCourseNumber);
  }
}
