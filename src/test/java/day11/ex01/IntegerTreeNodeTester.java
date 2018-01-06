package day11.ex01;

/**
 * Simple program to test the methods of the IntegerTreeNode class.
 */
public class IntegerTreeNodeTester {

  public static void main(String[] args) {
    IntegerTreeNodeTester myIntegerTreeNodeTester = new IntegerTreeNodeTester();
    myIntegerTreeNodeTester.launch();
  }

  private void launch() {
    IntegerTreeNode tree = new IntegerTreeNode(4);
    tree.add(6);
    tree.add(2);
    tree.add(1);
    tree.add(7);
    tree.add(3);
    tree.add(5);
    System.out.println("Max value in tree: " + tree.getMax());
    System.out.println("Expected result: 7");
    System.out.println("Min value in tree: " + tree.getMin());
    System.out.println("Expected result: 1");
    System.out.println(tree.toString());
    System.out.println(tree.toSimplifiedString());
    System.out.println("Tree contains value 10: " + tree.contains(10));
    System.out.println("Tree contains value 5: " + tree.contains(5));
    System.out.println("Tree depth: " + tree.depth());
    System.out.println("Expected result: 2");
  }
}
