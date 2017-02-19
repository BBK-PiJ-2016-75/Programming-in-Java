package com.github.bbkpij201675.programminginjava.day09.ex02;

/**
 * Simple program to test the methods of the SmartPhone class, practising using
 * both upcasting and downcasting techniques.
 */
public class SmartPhoneTester {
  private String number = "777-5311";
  private String alarm = "Wake up";
  private String game = "Snake";
  private String web = "google";
  private String internetNumber = "00447814-736527";


  public static void main(String[] args) {
    SmartPhoneTester tester = new SmartPhoneTester();
    tester.run();
  }

  private void run() {
    MobilePhone myPhone = new SmartPhone("HTC");
    test((SmartPhone) myPhone);
    testPhone(myPhone);
    //Cannot cast the following MobilePhone into a SmartPhone.
    //MobilePhone myMobile = new MobilePhone("Nokia");
    //testPhone(myMobile);
  }

  private void test(SmartPhone phone) {
    System.out.println("Phone brand: " + phone.getBrand());
    phone.call(number);
    phone.call(internetNumber);
    phone.ringAlarm(alarm);
    phone.playGame(game);
    phone.printLastNumbers();
    phone.browseWeb(web);
    phone.findPosition();
  }

  private void testPhone(Phone phone) {
    test((SmartPhone) phone);
  }
}
