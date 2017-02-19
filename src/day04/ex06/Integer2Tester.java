package com.github.bbkpij201675.programminginjava.day04.ex06;

/**
 * Simple program to test the methods of the Integer2 class.
 */
public class Integer2Tester {

  public static void main(String[] args) {
    Integer2Tester tester = new Integer2Tester();
    tester.run();
  }

  private void run() {
    Integer2 i2 = new Integer2();
    System.out.print("Enter a number: ");
    String str = System.console().readLine();
    int number = Integer.parseInt(str);
    i2.setValue(number);
    System.out.print("The number you entered is ");
    if (i2.isEven()) {
      System.out.println("even.");
    } else if (i2.isOdd()) {
      System.out.println("odd.");
    } else {
      System.out.println("Undefined!! Your code is buggy!");
    }
    int parsedInt = Integer.parseInt(i2.toString());
    if (parsedInt == i2.getValue()) {
      System.out.println("Your toString() method seems to work fine.");
    }
  }
}
