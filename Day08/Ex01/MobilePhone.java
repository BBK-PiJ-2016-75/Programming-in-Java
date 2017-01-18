public class MobilePhone extends OldPhone {
  
  private String[] history = new String[10];
  private int callCount = 0;
  
  public void ringAlarm(String alarm) {
    System.out.println(alarm + ": BEEP BEEP BEEP BEEP!");
  }
  
  public void playGame(String game){
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
      for (int i = 0; i < (history.length -1); i++) {
        history[i] = history[i + 1]; 
      }
      history[history.length -1] = number;
      System.out.println("Error: Memory Full!");
    }
  }
  
  public void printLastNumbers() {
    for (int i = 0; i < history.length; i++) {
      System.out.println("Call history " + (i + 1) + ": " + history[i]);
    }
  }
}