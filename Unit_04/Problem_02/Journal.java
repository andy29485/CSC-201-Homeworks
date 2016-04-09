package Unit_04.Problem_02;

// Name: Andriy Zasypkin
// Date: 2016-03-18
// Unit: 04
// Problem: 02

public class Journal extends ReadingMaterial {
  private String strPublisher;

  public Journal() {
    super();
    this.strPublisher = "Something inc.";
  }

  public void setPublisher(String strPublisher) {
    this.strPublisher = strPublisher;
  }

  public String getPublisher() {
    return this.strPublisher;
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
    return String.format("Journal: (%d pages) by: %s - pub. %s",
        this.getPages(), aut, this.getPublisher());
  }
}
