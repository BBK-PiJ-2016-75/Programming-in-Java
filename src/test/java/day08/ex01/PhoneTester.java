package day08.ex01;

/**
 * A simple launcher program to test the methods of the Phone interface and
 * its various subclasses.
 */
public class PhoneTester {
  public static void main(String[] args) {
    PhoneTester tester = new PhoneTester();
    tester.launch();
  }

  private void launch() {

    // Test old phone.
    OldPhone rotary = new OldPhone("BT Rotary");
    System.out.println("Old phone brand: " + rotary.getBrand());
    String number = "777-5311";
    rotary.call(number);

    // Test mobile phone.
    MobilePhone nokia = new MobilePhone("Nokia");
    System.out.println("Mobile phone brand: " + nokia.getBrand());
    String alarm = "Wake up";
    nokia.ringAlarm(alarm);
    String game = "Snake";
    nokia.playGame(game);
    nokia.printLastNumbers();
    for (int i = 0; i < 10; i++) {
      nokia.call("number" + i);
    }
    nokia.call(number);
    nokia.printLastNumbers();

    // Test smart phone.
    SmartPhone android = new SmartPhone("OnePlus");
    System.out.println("Smart phone brand: " + android.getBrand());
    String web = "google";
    android.browseWeb(web);
    android.findPosition();
    android.call(number);
    String internetNumber = "00447814-736527";
    android.call(internetNumber);
    android.ringAlarm(alarm);
    android.playGame(game);
    android.printLastNumbers();
  }
}
