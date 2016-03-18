//Name:    Andriy Zasypkin
//Date:    2016-03-18
//Unit:    04
//Problem: 02

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
}
