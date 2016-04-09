package unit_06.problem_02;

@FunctionalInterface
public interface MessageEncoder {
  public String encode(String plainText);
}
