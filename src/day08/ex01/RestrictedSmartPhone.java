package com.github.bbkpij201675.programminginjava.day08.ex01;

/**
 * A subclass of the MobilePhone class, which attempts to make playing games
 * restricted.
 */
public class RestrictedSmartPhone extends SmartPhone {

  public RestrictedSmartPhone(String brand) {
    super(brand);
  }

  //cannot make private, as it will not compile when weaker access is assigned
  @Override
  public void playGame(String game) {
    super.playGame(game);
  }
}
