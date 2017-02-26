package com.github.bbkpij201675.programminginjava.day15;

/**
 * Created by Dennis on 30/01/2017.
 */
public class RecursionExamples {

  static String doggyMethod(int n) {
    if (n <= 0) {
      return "";
    }
    String result = doggyMethod(n - 3) + n + doggyMethod(n - 2);
    return result;
  }

  static int mcCarthy91(int n) {
    if (n > 100) {
      return n - 10;
    } else {
      return mcCarthy91(mcCarthy91(n + 11));
    }
  }

  public static void main(String[] args) {
    System.out.println(doggyMethod(10));
    System.out.println("----------");
    System.out.println(mcCarthy91(50));
    System.out.println("----------");
    System.out.println(mcCarthy91(73));
    System.out.println("----------");
    System.out.println(mcCarthy91(95));
  }
}
