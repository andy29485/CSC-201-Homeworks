//Name:    Andriy Zasypkin
//Date:    2016-03-16
//Unit:    04
//Problem: 01

public class Soccer extends Sport {
  private int nGoalShotsMissed;
  private int nGoalShotsMade;

  public Soccer(String strTeamName) {
    super("Soccer", strTeamName);
    nGoalShotsMissed = 0;
    nGoalShotsMade   = 0;
  }

  protected Soccer(String strSportName, String strTeamName) {
    super(strSportName, strTeamName);
    nGoalShotsMissed = 0;
    nGoalShotsMade   = 0;
  }

  public void setShotsMissed(int nGoalShotsMissed) {
    this.nGoalShotsMissed = nGoalShotsMissed;
  }

  public int getShotsMissed() {
    return this.nGoalShotsMissed;
  }

  public void setShotsMade(int nGoalShotsMade) {
    this.nGoalShotsMade = nGoalShotsMade;
  }

  public int getShotsMade() {
    return this.nGoalShotsMade;
  }

  public double getShotRatio() {
    return this.nGoalShotsMade/(0.0+this.nGoalShotsMade+this.nGoalShotsMissed);
  }
}
