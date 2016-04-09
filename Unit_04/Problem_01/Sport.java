package Unit_04.Problem_01;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 01

public abstract class Sport {
  private int    nWins;
  private int    nTies;
  private int    nLosses;
  private String strTeamName;
  private String strSportName;

  protected Sport(String strSportName, String strTeamName) {
    this.nWins = 0;
    this.nTies = 0;
    this.nLosses = 0;
    this.strSportName = strSportName;
    this.strTeamName = strTeamName;
  }

  public void setWins(int nWins) {
    this.nWins = nWins;
  }

  public int getWins() {
    return this.nWins;
  }

  public void setTies(int nTies) {
    this.nTies = nTies;
  }

  public int getTies() {
    return this.nTies;
  }

  public void setLosses(int nLosses) {
    this.nLosses = nLosses;
  }

  public int getLosses() {
    return this.nLosses;
  }

  public String getName() {
    return this.strTeamName;
  }

  public String getSportName() {
    return this.strSportName;
  }

  public double getWinRatio() {
    return (nWins + 0.5 * nTies) / (nWins + nTies + nLosses);
  }
}
