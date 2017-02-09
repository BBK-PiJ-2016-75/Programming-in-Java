package ex07;

/**
 * A class which attempts to extend the String class. This is not possible,
 * as that class is final, so a compilation error will occur.
 */
public class StringPrinter { // extends String {

  /**
   * Prints to the console the even-numbered characters in a given string.
   * @param toPrint the string to print from.
   */
  public static void printEven(String toPrint) {
    for (int i = 1; i < toPrint.length(); i += 2) {
      System.out.print(toPrint.charAt(i));
    }
  }
}
