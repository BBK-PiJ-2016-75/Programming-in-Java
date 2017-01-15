public class SpyTester {
  
  public static void main(String[] args) {
    SpyTester tester = new SpyTester();
    tester.run();
  }
  
  private void run() {
    Spy spy01 = new Spy(007);
    Spy spy02 = new Spy(101);
    Spy spy03 = new Spy(700);
    Spy spy04 = new Spy(070);
    Spy spy05 = new Spy(123);
    spy05.die();
    spy01.die();
    spy03.die();
  }
}