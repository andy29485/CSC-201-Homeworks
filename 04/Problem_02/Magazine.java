//Name:    Andriy Zasypkin
//Date:    2016-03-18
//Unit:    04
//Problem: 02

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
}
