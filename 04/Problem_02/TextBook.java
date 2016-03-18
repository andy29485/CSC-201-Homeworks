//Name:    Andriy Zasypkin
//Date:    2016-03-18
//Unit:    04
//Problem: 02

public class TextBook extends Book {
  private String strSubject;

  public TextBook() {
    super();
    this.strSubject("Computer Science");
  }

  public void setSubject(String strSubject) {
    this.strSubject = strSubject;
  }

  public String getSubject() {
    return this.strSubject;
  }
}
