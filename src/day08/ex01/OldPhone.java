package com.github.bbkpij201675.programminginjava.day08.ex01;

/**
 * An implementation of the phone interface which can only make calls.
 */
public class OldPhone implements Phone {
  private String brand = null;

  public OldPhone(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  // ... there is no setter for brand

  @Override
  public void call(String number) {
    System.out.println("Calling: " + number);
  }
}
