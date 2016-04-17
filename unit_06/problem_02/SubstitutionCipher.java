package unit_06.problem_02;

public class SubstitutionCipher implements MessageEncoder {
  private int shift;

  public SubstitutionCipher(int shift) {
    this.shift = shift;
  }

  @Override
  public String encode(String plainText) {
    //1.1
    String out = "";
    //1.2
    for(char c : plainText.toCharArray())
      //1.2.3
      out += shiftChar(c);
    //1.3
    return out;
  }

  private char shiftChar(char c) {
    //1.2.1 - a
    if('A' <= c && 'Z' >= c)
      //1.2.1.1          4    1     2             3
      return (char) ('A' + (c - 'A' + this.shift) % 26);
    //1.2.1 - b
    else if('a' <= c && 'z' >= c)
      //1.2.1.1          4    1     2             3
      return (char) ('a' + (c - 'a' + this.shift) % 26);
    else
      return c;
  }
}
