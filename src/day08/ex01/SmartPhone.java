package com.github.bbkpij201675.programminginjava.day08.ex01;

/**
 * A subclass of the MobilePhone class, which can now browse the web and
 * find its gps position, as well as overriding calling.
 */
public class SmartPhone extends MobilePhone {

  public SmartPhone(String brand) {
    super(brand);
  }

  public void browseWeb(String site) {
    System.out.println("Connecting to www." + site + ".com");
  }

  public void findPosition() {
    System.out.println("You are at 51.521975,-0.1326507.");
  }

  @Override
  public void call(String number) {
    if (number.charAt(0) == '0' && number.charAt(1) == '0') {
      System.out.println("Calling " + number
          + " through the internet to save money!");
    } else {
      super.call(number);
    }
  }
}
