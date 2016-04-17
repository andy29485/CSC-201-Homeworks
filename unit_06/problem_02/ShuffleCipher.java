package unit_06.problem_02;

public class ShuffleCipher implements MessageEncoder {
  private int n;

  public ShuffleCipher(int n) {
    this.n = n;
  }

  @Override
  public String encode(String plainText) {
    // 2.1
    for(int i = 0; i < this.n; i++)
      // 2.1.5
      plainText = this.shuffle(plainText);
    // 2.2
    return plainText;
  }

  private String shuffle(String s) {
    // 2.1.1
    String out = "";
    // 2.1.2
    String left = s.substring(0, s.length() / 2);
    String right = s.substring(s.length() / 2);
    // 2.1.3
    int i = 0;

    // 2.1.4
    while(out.length() < s.length()) {
      // 2.1.4.1
      if(left.length() > i)
        // 2.1.4.1.1
        out += left.charAt(i);
      // 2.1.4.2
      if(right.length() > i)
        // 2.1.4.2.1
        out += right.charAt(i);
      // 2.1.4.3
      i++;
    }
    return out;
  }
}
