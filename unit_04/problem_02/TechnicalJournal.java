package unit_04.problem_02;

// Name: Andriy Zasypkin
// Date: 2016-03-18
// Unit: 04
// Problem: 02

public class TechnicalJournal extends Journal {
  private String strSubject;

  public TechnicalJournal() {
    super();
    this.strSubject = "Bell System";
    this.setAuthors(new String[] {"Bell Labs"});
  }

  public void setSubject(String strSubject) {
    this.strSubject = strSubject;
  }

  public String getSubject() {
    return this.strSubject;
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
    return String.format("%s Journal: (%d pages) by: %s - pub. %s",
        this.getSubject(), this.getPages(), aut, this.getPublisher());
  }
}
