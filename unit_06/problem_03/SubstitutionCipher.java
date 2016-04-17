package unit_06.problem_03;

public class SubstitutionCipher implements MessageDecoder, MessageEncoder {
  private int shift;

  public SubstitutionCipher(int shift) {
    this.shift = shift;
  }

  @Override
  public String decode(String cipherText) {
    String out = "";
    for(char c : cipherText.toCharArray())
      out += shiftCharBack(c);
    return out;
  }

  @Override
  public String encode(String plainText) {
    String out = "";
    for(char c : plainText.toCharArray())
      out += shiftChar(c);
    return out;
  }

  private char shiftChar(char c) {
    if('A' <= c && 'Z' >= c)
      return (char) ('A' + (c - 'A' + this.shift) % 26);
    else if('a' <= c && 'z' >= c)
      return (char) ('a' + (c - 'a' + this.shift) % 26);
    else
      return c;
  }

  private char shiftCharBack(char c) {
    if('A' <= c && 'Z' >= c)
      return (char) ('A' + (c - 'A' - this.shift + 26) % 26);
    else if('a' <= c && 'z' >= c)
      return (char) ('a' + (c - 'a' - this.shift + 26) % 26);
    else
      return c;
  }
}
