package day11.ex01;

/**
 * A node class for a binary search tree which contains integer values.
 */
public class IntegerTreeNode {
  private int value;
  private IntegerTreeNode left;
  private IntegerTreeNode right;

  /**
   * Constructor of tree node from given integer value.
   *
   * @param value the value for the node
   */
  public IntegerTreeNode(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /**
   * Recursive method to add a node to the binary search tree.
   *
   * @param newNumber the integer value for the new node
   */
  public void add(int newNumber) {
    if (newNumber > this.value) {
      if (right == null) {
        right = new IntegerTreeNode(newNumber);
      } else {
        right.add(newNumber);
      }
    } else {
      if (left == null) {
        left = new IntegerTreeNode(newNumber);
      } else {
        left.add(newNumber);
      }
    }
  }

  /**
   * Recursive method to find whether a given value is already present in the
   * binary search tree.
   *
   * @param n the value to try to locate
   * @return whether or not the tree already contains the given value
   */
  public boolean contains(int n) {
    if (n == this.value) {
      return true;
    } else if (n > this.value) {
      if (right == null) {
        return false;
      } else {
        return right.contains(n);
      }
    } else {
      if (left == null) {
        return false;
      } else {
        return left.contains(n);
      }
    }
  }

  /**
   * Recursive method which returns the greatest value present in the binary
   * search tree.
   *
   * @return the greatest value currently in the tree
   */
  public int getMax() {
    if (right == null) {
      return value;
    } else {
      return right.getMax();
    }
  }

  /**
   * Recursive method which return the smallest value present in the binary
   * search tree.
   *
   * @return the smallest value currently in the tree
   */
  public int getMin() {
    if (left == null) {
      return value;
    } else {
      return left.getMin();
    }
  }

  /**
   * Recursive method which traverses the binary search tree and returns a
   * string of all values it contains.
   *
   * @return the string of all values currently in the tree
   */
  @Override
  public String toString() {
    String treeString = "[" + value;
    if (left == null) {
      treeString += " L[]";
    } else {
      treeString += " L" + left.toString();
    }
    if (right == null) {
      treeString += " R[]";
    } else {
      treeString += " R" + right.toString();
    }
    return treeString + "]";
  }

  /**
   * Recursive method which traverses the binary search tree and returns a
   * simplified string of all values it contains.
   *
   * @return the simplified string of all values currently in the tree
   */
  public String toSimplifiedString() {
    String treeString = "[" + value;
    if (left != null) {
      treeString += " " + left.toSimplifiedString();
    }
    if (right != null) {
      treeString += right.toSimplifiedString();
    }
    return treeString + "]";
  }

  /**
   * Recursive method which calculates the depth of the binary search tree.
   *
   * @return the depth of the tree
   */
  public int depth() {
    if (left == null && right == null) {
      return 0;
    } else {
      return Math.max(left.depth(), right.depth()) + 1;
    }
  }
}
