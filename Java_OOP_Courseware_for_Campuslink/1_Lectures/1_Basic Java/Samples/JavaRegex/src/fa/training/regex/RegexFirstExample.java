package fa.training.regex;

import java.util.regex.Pattern;

public class RegexFirstExample {
  public static void main(String[] args) {
    String content = "This is a java regex example";
    String pattern = ".*regex.*";

    boolean isMatch = Pattern.matches(pattern, content);

    System.out.println("The text contains 'regex'?: " + isMatch);

  }
}
