package ex01;

/**
 * Simple program to test the methods of the Calculator class.
 */
public class CalculatorTester {

  public static void main(String[] args) {
    CalculatorTester tester = new CalculatorTester();
    tester.run();
  }

  private void run() {
    System.out.print("5 + 7 is ");
    Calculator.add(5, 7);
    System.out.print("42 - 18 is ");
    Calculator.subtract(42, 18);
    System.out.print("-12 x 56 is ");
    Calculator.multiply(-12, 56);
    System.out.print("73 / 24 is ");
    Calculator.divide(73, 24);
    System.out.print("7 remainder 5 is ");
    Calculator.modulus(7, 5);
    System.out.println("Testing complete!");
  }
}
