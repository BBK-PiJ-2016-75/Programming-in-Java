package com.github.bbkpij201675.programminginjava.day10.ex02;

/**
 * A program to compare a recursive factorial function to an iterative one.
 */
public class Factorials {

  /**
   * Computes a recursive factorial function.
   *
   * @param n the number to calculate the factorial of
   * @return the factorial of n
   */
  private static int factorialRecursive(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorialRecursive(n - 1);
    }
  }

  /**
   * Computes an iterative factorial function.
   *
   * @param n the integer to calculate the factorial of
   * @return the factorial of n
   */
  private static int factorialIterative(int n) {
    int result = n;
    for (int i = n - 1; i > 0; i--) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    int recursive = factorialRecursive(5);
    System.out.println(recursive);
    System.out.println("Expected: 120");
    int iterative = factorialIterative(5);
    System.out.println(iterative);
    System.out.println("Expected: 120");
  }
}
