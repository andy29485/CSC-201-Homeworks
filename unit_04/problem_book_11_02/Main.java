package unit_04.problem_book_11_02;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 11.02

/*
 * Description: (The Person, Student, Employee, Faculty, and Staff classes)
 * Design a class named Person and its two subclasses named Student and
 * Employee. Make Faculty and Staff subclasses of Employee. A person has a name,
 * address, phone number, and email address. A student has a class status
 * (freshman, sophomore, junior, or senior). Define the status as a constant. An
 * employee has an office, salary, and date hired. Use the MyDate class defined
 * in Programming Exercise 10.14 to create an object for date hired. A faculty
 * member has office hours and a rank. A staff member has a title. Override the
 * toString method in each class to display the class name and the person’s
 * name. Draw the UML diagram for the classes and implement them. Write a test
 * program that creates a Person, Student, Employee, Faculty, and Staff, and
 * invokes their toString() methods.
 *
 * Assumptions: - Things will be hard-coded
 *
 * Pseudocode: 1. gets and set nothing intresting
 */

class MyDate {
  private int nYear;
  private int nMonth;
  private int nDay;

  public MyDate(int nYear, int nMonth, int nDay) {
    this.nYear = nYear;
    this.nMonth = nMonth;
    this.nDay = nDay;
  }

  public void setYear(int nYear) {
    this.nYear = nYear;
  }

  public int getYear() {
    return this.nYear;
  }

  public void setMonth(int nMonth) {
    this.nMonth = nMonth;
  }

  public int getMonth() {
    return this.nMonth;
  }

  public void setDay(int nDay) {
    this.nDay = nDay;
  }

  public int getDay() {
    return this.nDay;
  }

  @Override
  public String toString() {
    return String.format("%04d-%02d-%02d", nYear, nMonth, nDay);
  }
}

class Person {
  private String strName;
  private String strStreetAddress;
  private String strEmailAddress;
  private int    nPhoneNumber;

  public Person(String strName) {
    this.strName = strName;
    this.strStreetAddress = "";
    this.strEmailAddress = "";
    this.nPhoneNumber = 0;
  }

  public Person(String strName, String strStreetAddress, String strEmailAddress,
                int nPhoneNumber) {
    this.strName = strName;
    this.strStreetAddress = strStreetAddress;
    this.strEmailAddress = strEmailAddress;
    this.nPhoneNumber = nPhoneNumber;
  }

  public void setName(String strName) {
    this.strName = strName;
  }

  public String getName() {
    return this.strName;
  }

  public void setStreetAddress(String strStreetAddress) {
    this.strStreetAddress = strStreetAddress;
  }

  public String getStreetAddress() {
    return this.strStreetAddress;
  }

  public void setEmail(String strEmailAddress) {
    this.strEmailAddress = strEmailAddress;
  }

  public String getEmail() {
    return this.strEmailAddress;
  }

  public void setPhone(int nPhoneNumber) {
    this.nPhoneNumber = nPhoneNumber;
  }

  public int getPhone() {
    return this.nPhoneNumber;
  }

  @Override
  public String toString() {
    return "Person: " + this.getName();
  }
}

class Student extends Person {
  private String strStatus;

  public Student(String strName) {
    super(strName);
    this.strStatus = "freshman";
  }

  public Student(String strName, String strStatus) {
    super(strName);
    this.strStatus = strStatus;
  }

  public Student(String strName, String strStreetAddress,
                 String strEmailAddress, int nPhoneNumber, String strStatus) {
    super(strName, strStreetAddress, strEmailAddress, nPhoneNumber);
    this.strStatus = strStatus;
  }

  public void setStatus(String strStatus) {
    this.strStatus = strStatus;
  }

  public String getStatus() {
    return this.strStatus;
  }

  @Override
  public String toString() {
    return "Student: " + this.getName();
  }
}

class Employee extends Person {
  private String strOffice;
  private double dSalary;
  private MyDate dateHired;

  public Employee(String strName) {
    super(strName);
    this.strOffice = "";
    this.dSalary = 0;
    this.dateHired = new MyDate(0, 0, 0);
  }

  public void setOffice(String strOffice) {
    this.strOffice = strOffice;
  }

  public String getOffice() {
    return this.strOffice;
  }

  public void setSalary(double dSalary) {
    this.dSalary = dSalary;
  }

  public double getSalary() {
    return this.dSalary;
  }

  public MyDate getDateHired() {
    return this.dateHired;
  }

  @Override
  public String toString() {
    return "Employee: " + this.getName();
  }
}

class Faculty extends Employee {
  private String strOfficeHours;
  private String strRank;

  public Faculty(String strName) {
    super(strName);
    this.strOfficeHours = "00:00-23:59";
    this.strRank = "Instructor";
  }

  public Faculty(String strName, String strRank) {
    super(strName);
    this.strOfficeHours = "00:00-23:59";
    this.strRank = strRank;
  }

  public void setRank(String strRank) {
    this.strRank = strRank;
  }

  public String getRank() {
    return this.strRank;
  }

  public void setOfficeHours(String strOfficeHours) {
    this.strOfficeHours = strOfficeHours;
  }

  public String getOfficeHours() {
    return this.strOfficeHours;
  }

  @Override
  public String toString() {
    return "Faculty: " + this.getName();
  }
}

class Staff extends Person {
  private String strTitle;

  public Staff(String strName) {
    super(strName);
    this.strTitle = "";
  }

  public Staff(String strName, String strTitle) {
    super(strName);
    this.strTitle = strTitle;
  }

  public void setTitle(String strTitle) {
    this.strTitle = strTitle;
  }

  public String getTitle() {
    return this.strTitle;
  }

  @Override
  public String toString() {
    return "Staff: " + this.getName();
  }
}

public class Main {
  public static void main(String[] args) {
    Person a = new Person("test person");
    Student b = new Student("test student");
    Employee c = new Employee("test employee");
    Faculty d = new Faculty("test faculty");
    Staff e = new Staff("test staff");

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}
