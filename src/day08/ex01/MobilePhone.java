package com.github.bbkpij201675.programminginjava.day08.ex01;

/**
 * A subclass of the OldPhone implementation, which can now ring an alarm,
 * play a game, and print out called numbers on top of overriding calling.
 */
public class MobilePhone extends OldPhone {
  private String[] history = new String[10];
  private int callCount = 0;

  public MobilePhone(String brand) {
    super(brand);
  }

  public void ringAlarm(String alarm) {
    System.out.println(alarm + ": BEEP BEEP BEEP BEEP!");
  }

  //cannot make private, as that makes access from other classes impossible
  public void playGame(String game) {
    System.out.println("So, you'd like to play a little game of " + game + "?");
  }

  @Override
  public void call(String number) {
    super.call(number);
    if (callCount < history.length) {
      history[callCount] = number;
      callCount++;
    } else {
      history[0] = null;
      for (int i = 0; i < (history.length - 1); i++) {
        history[i] = history[i + 1];
      }
      history[history.length - 1] = number;
      System.out.println("Error: Memory Full!");
    }
  }

  /**
   * Prints to the console all of the numbers which are in the history array.
   */
  public void printLastNumbers() {
    for (int i = 0; i < history.length; i++) {
      System.out.println("Call history " + (i + 1) + ": " + history[i]);
    }
  }
}
