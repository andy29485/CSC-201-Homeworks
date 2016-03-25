//Name:    Andriy Zasypkin
//Date:    2016-03-17
//Unit:    04
//Problem: 03

public class Course {
  private String strCourseName;
  private String strDepartment;
  private int    nCourseNumber;

  public Course(String strCourseName, String strDepartment, int nCourseNumber) {
    this.strCourseName = strCourseName;
    this.strDepartment = strDepartment;
    this.nCourseNumber = nCourseNumber;
  }

  public void setName(String strCourseName) {
    this.strCourseName = strCourseName;
  }

  public String getName() {
    return this.strCourseName;
  }

  public void setDepartment(String strDepartment) {
    this.strDepartment = strDepartment;
  }

  public String getDepartment() {
    return this.strDepartment;
  }

  public void setNumber(int nCourseNumber) {
    this.nCourseNumber = nCourseNumber;
  }

  public int getNumber() {
    return this.nCourseNumber;
  }

  public String toString() {
    return String.format("%s %d (dep. %s)",
                         strCourseName, nCourseNumber, strDepartment);
  }
}
