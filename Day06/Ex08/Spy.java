package ex08;

/**
 * Creates spy objects which have id numbers. The class has a static counter
 * field which keeps track of how many spies have been constructed.
 */
public class Spy {
  private static int spyCount = 0;
  private int id = 0;

  /**
   * Constructs a spy object with a given id number.
   * Also, increments the spy counter by one.
   * @param id the new spy object's id number.
   */
  public Spy(int id) {
    this.id = id;
    spyCount++;
    System.out.println("Welcome, Agent number " + id + ".");
    System.out.println("There are " + spyCount + " spies hiding out there.");
  }

  public static int getNumberOfSpies() {
    return spyCount;
  }

  /**
   * Prints the id number of the eliminated spy object to the console.
   * Also, decrements the spy counter by one.
   */
  public void die() {
    System.out.println("Spy " + this.id + " has been detected and eliminated!");
    spyCount--;
    System.out.println("There are now " + spyCount + " spies hiding out there.");
  }
}
