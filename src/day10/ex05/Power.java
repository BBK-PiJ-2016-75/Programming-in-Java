package com.github.bbkpij201675.programminginjava.day10.ex05;

/**
 * Program which calculates the power of a given base and exponent.
 */
public class Power {

  public static void main(String[] args) {
    Power myPower = new Power();
    myPower.launch();
  }

  /**
   * Recursive method to calculate the power of a the base and exponent.
   *
   * @param base the provided base
   * @param exponent the provided exponent
   * @return the calculated power
   */
  private int pow(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else if (exponent == 1) {
      return base;
    } else {
      return base * pow(base, exponent - 1);
    }
  }

  private void launch() {
    System.out.println(pow(3, 3));
  }
}
