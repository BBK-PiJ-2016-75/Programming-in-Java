package day06.ex09;

/**
 * A program that takes scores one at a time, assigns grades to them, and
 * keeps a count of how many of each grade have been input.
 */
public class MarkGrader {
  //The boundaries between the different grades.
  private static final int MAXIMUM_MARK = 100;
  private static final int DISTINCTION_THRESHOLD = 70;
  private static final int PASS_THRESHOLD = 50;
  private static final int MINIMUM_MARK = 0;
  //Counters for the different grades.
  private static int distinctions = 0;
  private static int passes = 0;
  private static int failures = 0;
  private static int invalid = 0;

  public static void main(String[] args) {
    MarkGrader myGrader = new MarkGrader();
    myGrader.launch();
  }

  private void inputMark() {
    int mark = 0;
    System.out.println("Please enter marks, one by one. Enter -1 to quit.");
    do {
      System.out.print("Input a mark: ");
      mark = Integer.parseInt(System.console().readLine());
      if ((mark < MINIMUM_MARK || mark > MAXIMUM_MARK) && mark != -1) {
        invalid++;
      } else if (mark <= MAXIMUM_MARK && mark >= DISTINCTION_THRESHOLD) {
        distinctions++;
      } else if (mark < DISTINCTION_THRESHOLD && mark >= PASS_THRESHOLD) {
        passes++;
      } else if (mark < PASS_THRESHOLD && mark >= MINIMUM_MARK) {
        failures++;
      }
    } while (mark != -1);
    System.out.print("There are " + (distinctions + passes + failures)
        + " students: " + distinctions + " distinctions, " + passes + " passes, "
        + failures + " fails (plus " + invalid + " invalid entries).");
  }

  private void launch() {
    inputMark();
  }
}
