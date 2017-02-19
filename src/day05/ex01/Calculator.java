package com.github.bbkpij201675.programminginjava.day05.ex01;

/**
 * A class which performs basic calculations.
 */
public class Calculator {

  /**
   * Performs an addition operation and prints the sum.
   * @param x the first summand.
   * @param y the second summand.
   */
  public static void add(int x, int y) {
    int result = x + y;
    System.out.println(result);
  }

  /**
   * Performs a subtraction operation and prints the difference.
   * @param x the minuend.
   * @param y the subtrahend.
   */
  public static void subtract(int x, int y) {
    int result = x - y;
    System.out.println(result);
  }

  /**
   * Performs a multiplication operation and prints the product.
   * @param x the first factor.
   * @param y the second factor.
   */
  public static void multiply(int x, int y) {
    int result = x * y;
    System.out.println(result);
  }

  /**
   * Performs a division operation and prints the quotient.
   * @param x the numerator.
   * @param y the denominator.
   */
  public static void divide(int x, int y) {
    double result = (double) x / y;
    System.out.println(result);
  }

  /**
   * Performs a modulo operation and prints the remainder.
   * @param x the dividend.
   * @param y the divisor.
   */
  public static void modulus(int x, int y) {
    int result = x % y;
    System.out.println(result);
  }
}
