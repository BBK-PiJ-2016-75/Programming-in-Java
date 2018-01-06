package day11.ex02;

/**
 * Simple program to test the methods of the TreeIntSet and ListIntSet
 * classes, which both implement the IntSet interface.
 */
public class IntSetTester {

  public static void main(String[] args) {
    IntSetTester myIntSetTester = new IntSetTester();
    myIntSetTester.launch();
  }

  private void launch() {
    TreeIntSet treeSet = new TreeIntSet(4);
    test(treeSet);
    ListIntSet listSet = new ListIntSet(4);
    test(listSet);
  }

  private void test(IntSet testee) {
    testee.add(5);
    testee.add(8);
    testee.add(1);
    testee.add(17);
    testee.add(12);
    testee.add(3);
    testee.add(10);
    testee.add(17);
    System.out.println("Set contains 9: " + testee.contains(9));
    System.out.println("Set contains 10: " + testee.contains(10));
    System.out.println("Set contains 11: " + testee.containsVerbose(11));
    System.out.println("Set contains 12: " + testee.containsVerbose(12));
    System.out.println("Current members of set: " + testee.toString());
  }
}
