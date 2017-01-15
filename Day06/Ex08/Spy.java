public class Spy {
  
  private static int spyCount = 0;
  private int id = 0;
  
  public Spy (int id) {
    this.id = id;
    spyCount++;
    System.out.println("Welcome, Agent number " + id + ".");
    System.out.println("There are " + spyCount + " spies hiding out there.");
  }
  
  public static int getNumberOfSpies() {
    return spyCount;
  }
  
  public void die() {
    System.out.println("Spy " + this.id + " has been detected and eliminated!");
    spyCount--;
    System.out.println("There are now " + spyCount + " spies hiding out there.");
  }
}