package fa.training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherWithFind {

  public static void main(String[] args) {
    String content = "ZZZ AA PP AA QQQ AAA ZZ";

    String string = "AA";
    Pattern pattern = Pattern.compile(string);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println("Found at: " + matcher.start() + " - "
          + matcher.end());
    }
  }

}
