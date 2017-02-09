package ex01;

public class PhoneLauncher {
  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    // Test old phone.
    OldPhone rotary = new OldPhone();
    String number = "777-5311";
    rotary.call(number);

    // Test mobile phone.
    MobilePhone nokia = new MobilePhone();
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
    SmartPhone android = new SmartPhone();
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
