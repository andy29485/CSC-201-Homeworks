package unit_06.problem_03;

public class ShuffleCipher implements MessageDecoder, MessageEncoder {
  private int n;

  public ShuffleCipher(int n) {
    this.n = n;
  }

  @Override
  public String decode(String cipherText) {
    for(int i = 0; i < this.n; i++)
      cipherText = this.unShuffle(cipherText);
    return cipherText;
  }

  @Override
  public String encode(String plainText) {
    for(int i = 0; i < this.n; i++)
      plainText = this.shuffle(plainText);
    return plainText;
  }

  private String shuffle(String s) {
    String out = "";
    String left = s.substring(0, s.length() / 2);
    String right = s.substring(s.length() / 2);
    int i = 0;

    while(out.length() < s.length()) {
      if(left.length() > i)
        out += left.charAt(i);
      if(right.length() > i)
        out += right.charAt(i);
      i++;
    }
    return out;
  }

  private String unShuffle(String s) {
    String left = "";
    String right = "";
    for(int i = 0; i < s.length() / 2; i++) {
      left += s.charAt(2 * i);
      right += s.charAt(2 * i + 1);
    }
    if(s.length() % 2 == 0)
      return left + right;
    else
      return left + right + s.charAt(s.length() - 1);
  }
}
