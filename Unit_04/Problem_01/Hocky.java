package Unit_04.Problem_01;

// Name: Andriy Zasypkin
// Date: 2016-03-16
// Unit: 04
// Problem: 01

public class Hocky extends Soccer {
  private int nPenaltyShotsMissed;
  private int nPenaltyShotsMade;

  public Hocky(String strTeamName) {
    super("Hockey", strTeamName);
    nPenaltyShotsMissed = 0;
    nPenaltyShotsMade = 0;
  }

  public void setPenaltyShotsMade(int nPenaltyShotsMade) {
    this.nPenaltyShotsMade = nPenaltyShotsMade;
  }

  public int getPenaltyShotsMade() {
    return this.nPenaltyShotsMade;
  }

  public void setPenaltyShotsMissed(int nPenaltyShotsMissed) {
    this.nPenaltyShotsMissed = nPenaltyShotsMissed;
  }

  public int getPenaltyShotsMissed() {
    return this.nPenaltyShotsMissed;
  }
}
