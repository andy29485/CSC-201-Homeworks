package Unit_04.Problem_02;

// Name: Andriy Zasypkin
// Date: 2016-03-18
// Unit: 04
// Problem: 02

public class Magazine extends Journal {
  private int nIssue;

  public Magazine() {
    super();
    this.nIssue = 30;
    this.setPublisher("DC Comics");
  }

  public void setIssue(int nIssue) {
    this.nIssue = nIssue;
  }

  public int getIssue() {
    return this.nIssue;
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
    return String.format("Magazine: (%d pages) by: %s - pub. %s - Issue %d",
        this.getPages(), aut, this.getPublisher(), this.getIssue());
  }
}
