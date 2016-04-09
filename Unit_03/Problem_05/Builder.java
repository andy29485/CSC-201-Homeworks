package Unit_03.Problem_05;

// Name: Andriy Zasypkin
// Date: 2016-02-08
// Unit: 03
// Problem: 05

public class Builder {
  private StringBuilder builder;// string that shall change
  private int           loc;    // length of original string - for inserting

  public Builder(String str) {
    builder = new StringBuilder(str);
    loc = str.length();
  }

  public void append(String str) {
    builder.insert(loc, str);
  }

  @Override
  public String toString() {
    return builder.toString();
  }
}
