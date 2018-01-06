package day08.ex06;

/**
 * Simple program to test the methods of the Lecturer class.
 */
public class LecturerTester {

  public static void main(String[] args) {
    LecturerTester tester = new LecturerTester();
    tester.launch();
  }

  private void launch() {
    Lecturer mrThackeray = new Lecturer("Mr. Thackeray");
    System.out.println("Lecturer's name: " + mrThackeray.getName());
    mrThackeray.teach("20th Century History");
    mrThackeray.doResearch("The Second World War");
  }
}
