package com.github.bbkpij201675.programminginjava.day14;

/**
 * Created by Dennis on 23/01/2017.
 */
public class GoesWrong {
  public static void main(String[] args) {
    try {
      System.out.println(3 / 0);
    } catch (Exception ex) {
      System.err.println("Ouch");
      throw new RuntimeException();
    } finally {
      System.err.println("Something else");
    }
  }
}
