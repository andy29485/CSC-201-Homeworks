package Unit_04.Problem_02;

// Name: Andriy Zasypkin
// Date: 2016-03-18
// Unit: 04
// Problem: 02

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

  @Override
  public String toString() {
    String aut = "";
    for(int i = 0; i < this.getAuthors().length; i++) {
      if(i != 0) {
        aut += ", ";
      }
      aut += this.getAuthors()[i];
    }
    return String.format("Book: %s(%d pages) by: %s", this.getTitle(),
        this.getPages(), aut);
  }
}
