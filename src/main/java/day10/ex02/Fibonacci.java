package day10.ex02;

/**
 * A program to compare recursive and iterative one functions to print out
 * the nth number in the Fibonacci sequence.
 */
public class Fibonacci {

  /**
   * Recursively calculates the nth number in the Fibonacci sequence.
   *
   * @param n the number in the sequence
   * @return the value of the nth number in the sequence
   */
  private static int fibRecursive(int n) {
    if ((n == 1) || (n == 2)) {
      return 1;
    } else {
      return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
  }

  /**
   * Iteratively calculates the nth number in the Fibonacci sequence.
   *
   * @param n the number in the sequence
   * @return the value of the nth number in the sequence
   */
  private static int fibIterative(int n) {
    int x = 1;
    int y = 1;
    for (int i = 1; i < n; i++) {
      int temp = y;
      y += x;
      x = temp;
    }
    return x;
  }

  public static void main(String[] args) {
    System.out.println("Recursive result: " + fibRecursive(45));
    System.out.println("Iterative result: " + fibIterative(45));
    System.out.println("Expected result: 1134903170");
  }
}
