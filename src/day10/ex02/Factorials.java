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
    System.out.println("Recursive result: " + factorialRecursive(5));
    System.out.println("Iterative result: " + factorialIterative(5));
    System.out.println("Expected result: 120");
  }
}
