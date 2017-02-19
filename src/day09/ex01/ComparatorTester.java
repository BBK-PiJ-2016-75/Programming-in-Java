package com.github.bbkpij201675.programminginjava.day09.ex01;

/**
 * Simple program to test the method of the Comparator class.
 */
public class ComparatorTester {

  public static void main(String[] args) {
    ComparatorTester tester = new ComparatorTester();
    tester.run();
  }

  private void run() {
    Comparator compare = new Comparator();
    System.out.println("Max of 7 & 11: " + compare.getMax(7, 11));
    System.out.println("Max of 9.3 & 1.4: " + compare.getMax(9.3, 1.4));
    System.out.println("Max of \"12\" & \"35\": " + compare.getMax("12", "35"));
  }
}
