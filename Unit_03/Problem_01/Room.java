package Unit_03.Problem_01;

// Name: Andriy Zasypkin
// Date: 2016-02-15
// Unit: 03
// Problem: 01

public class Room {
  private int    nWindows;
  private String strColour;
  private String strFloorType;

  public Room() {
    this.nWindows = 0;
    this.strColour = "white";
    this.strFloorType = "hard wood";
  }

  public Room(String strColour, String strFloorType, int nWindows) {
    this.nWindows = nWindows;
    this.strColour = strColour;
    this.strFloorType = strFloorType;
  }

  public void setWindows(int nWindows) {
    this.nWindows = nWindows;
  }

  public int getWindows() {
    return this.nWindows;
  }

  public void setColour(String strColour) {
    this.strColour = strColour;
  }

  public String getColour() {
    return this.strColour;
  }

  public void setFloorType(String strFloorType) {
    this.strFloorType = strFloorType;
  }

  public String getFloorType() {
    return this.strFloorType;
  }

  @Override
  public String toString() {
    return String.format("%s room with a %s floor and %d windows",
        this.strColour, this.strFloorType, this.nWindows);
  }
}
