package com.github.bbkpij201675.programminginjava.day10.ex05;

/**
 * Created by Dennis on 08/03/2017
 */
public class Power {

  public static void main(String[] args) {
    Power myPower = new Power();
    myPower.run();
  }

  /**
   * asa
   *
   * @param base
   * @param exponent
   * @return
   */
  private int pow(int base, int exponent) {
    if (exponent == 1) {
      return base * base;
    } else {
      int newBase = base * base;
      return pow(newBase, exponent - 1);
    }
  }

  private void run() {
    System.out.println(pow(3, 3));
  }
}
