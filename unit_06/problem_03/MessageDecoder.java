package unit_06.problem_03;

@FunctionalInterface
public interface MessageDecoder {
  public abstract String decode(String cipherText);
}
