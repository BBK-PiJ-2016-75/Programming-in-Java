package ex05;

/**
 * Simple program to test the methods of the SimpleMapImpl class.
 */
public class SimpleMapImplTester {

  public static void main(String[] args) {
    SimpleMapImplTester tester = new SimpleMapImplTester();
    tester.run();
  }

  private void run() {
    SimpleMapImpl myMap = new SimpleMapImpl();
    System.out.println("My map is empty: " + myMap.isEmpty());
    myMap.put(-1, "Bob");
    myMap.put(2, "Homer");
    myMap.put(4, "Marge");
    myMap.put(6, "Bart");
    myMap.put(8, "Lisa");
    myMap.put(10, "Maggie");
    myMap.put(4, "Selma");
    myMap.put(500, "Mel");
    System.out.println("The name in location 6 is : " + myMap.get(6));
    myMap.remove(6);
    System.out.println("The name in location 6 is : " + myMap.get(6));
    System.out.println("My map is empty: " + myMap.isEmpty());
  }
}
