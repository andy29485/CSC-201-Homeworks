//Name:    Andriy Zasypkin
//Date:    2016-03-18
//Unit:    04
//Problem: 02

public class TechnicalJournal extends Journal {
  private String strSubject;

  public TechnicalJournal() {
    super();
    this.strSubject = "Physics"
  }

  public void setSubject(String strSubject) {
    this.strSubject = strSubject;
  }

  public String getSubject() {
    return this.strSubject;
  }
}
