package unit_06.problem_03;

@FunctionalInterface
public interface MessageEncoder {
  public String encode(String plainText);
}
