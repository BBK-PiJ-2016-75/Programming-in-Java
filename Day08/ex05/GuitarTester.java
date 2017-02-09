package ex05;

/**
 * Simple program to test the methods of the Guitar class.
 */
public class GuitarTester {

  public static void main(String[] args) {
    GuitarTester tester = new GuitarTester();
    tester.run();
  }

  private void run() {
    Guitar myAxe = new Guitar();
    myAxe.play("Stairway to Heaven");
    myAxe.burn();
  }
}
