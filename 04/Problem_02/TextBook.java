//Name:    Andriy Zasypkin
//Date:    2016-03-18
//Unit:    04
//Problem: 02

public class TextBook extends Book {
  private String strSubject;

  public TextBook() {
    super();
    this.strSubject = "Computer Science";
  }

  public void setSubject(String strSubject) {
    this.strSubject = strSubject;
  }

  public String getSubject() {
    return this.strSubject;
  }

  public String toString() {
    String aut = "";
    for(int i=0; i<this.getAuthors().length; i++) {
      if(i!=0) {
        aut += ", ";
      }
      aut += this.getAuthors()[i];
    }
    return String.format("%s Text Book: %s(%d pages) by: %s", this.getSubject(),
                                        this.getTitle(), this.getPages(), aut);
  }
}
