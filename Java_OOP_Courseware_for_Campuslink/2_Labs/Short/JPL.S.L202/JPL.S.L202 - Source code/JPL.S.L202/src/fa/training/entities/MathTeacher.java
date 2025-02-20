package fa.training.entities;

/**
 * 
 * @author DieuNT1
 *
 */
public class MathTeacher extends Teacher implements Actionable {
  private String mainSubject;

  public MathTeacher() {
  }

  public MathTeacher(String designation, String collegename,
      String mainSubject) {
    super(designation, collegename);

    this.mainSubject = mainSubject;
  }

  public String getMainSubject() {
    return mainSubject;
  }

  public void setMainSubject(String mainSubject) {
    this.mainSubject = mainSubject;
  }

  /**
   * return sum of all two numbers
   * 
   * @param number1
   * @param number2
   * @return
   */
  public int sum(int number1, int number2) {
    return (number1 + number2);
  }

  @Override
  public void teach() {
    System.out.print("Teaching math subject!");
  }

  @Override
  public void toSchool() {
    System.out.println("Math teacher go to school by car!");

  }

  @Override
  public String toString() {
    return "MathTeacher [mainSubject=" + mainSubject + ", getDesignation()="
        + getDesignation() + ", getCollegename()=" + getCollegename() + "]";
  }

}
