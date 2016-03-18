//Name:    Andriy Zasypkin
//Date:    2016-03-18
//Unit:    04
//Problem: 02

public class Book extends ReadingMaterial {
  private String strTitle;

  public Book() {
    super();
    this.strTitle = "None";
  }

  public void setTitle(String strTitle) {
    this.strTitle = strTitle;
  }

  public String getTitle() {
    return this.strTitle;
  }
}
