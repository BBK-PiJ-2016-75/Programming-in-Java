package day10.ex01;

/**
 * Simple program to be used as an example of recursion.
 */
public class NumbersRecursion {

  /**
   * Prints out numbers with recursive operations called on them.
   *
   * @param n the starting number
   */
  private static void printNumbers(int n) {
    if (n <= 0) {
      return;
    }
    System.out.println(n);
    printNumbers(n - 2);
    printNumbers(n - 3);
    System.out.println(n);
  }

  public static void main(String[] args) {
    printNumbers(6);
  }
}
