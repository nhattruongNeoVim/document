package fa.training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternWithComplile {
  public static void main(String[] args) {
    String content = "This is a java regex example";
    String patternString = ".*Regex.*";

    Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
    
    Matcher matcher = pattern.matcher(content);

    System.out.println("The text contains 'regex'?: " + matcher.matches());
  }
}
