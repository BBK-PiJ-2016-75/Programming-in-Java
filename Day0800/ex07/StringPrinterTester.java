package ex07;

/**
 * Simple program to test the method of the StringPrinter class.
 */
public class StringPrinterTester {

  public static void main(String[] args) {
    StringPrinterTester tester = new StringPrinterTester();
    tester.run();
  }

  private void run() {
    String example = "The quick brown fox jumps over the lazy dog";
    System.out.print(example + ": ");
    StringPrinter.printEven(example);
  }
}
