package day11.ex02;

/**
 * An implementation of IntSet, as a binary search tree set.
 */
public class TreeIntSet implements IntSet {
  private int value;
  private TreeIntSet left;
  private TreeIntSet right;

  /**
   * Constructs a new tree set, starting with the given value as the root node.
   *
   * @param value the value of the root
   */
  public TreeIntSet(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /**
   * Adds a new int to the set; if it is there already, nothing happens.
   *
   * @param value the value to add to the set
   */
  @Override
  public void add(int value) {
    if (!contains(value)) {
      if (value < this.value) {
        if (this.left == null) {
          left = new TreeIntSet(value);
        } else {
          left.add(value);
        }
      } else {
        if (this.right == null) {
          right = new TreeIntSet(value);
        } else {
          right.add(value);
        }
      }
    } else {
      System.out.println("The tree set already contains " + value);
    }
  }

  /**
   * Returns true if the number is in the set, false otherwise.
   *
   * @param value the value to search the set for
   * @return whether or not the set contains the given value
   */
  @Override
  public boolean contains(int value) {
    if (value == this.value) {
      return true;
    } else if (value < this.value) {
      if (this.left == null) {
        return false;
      } else {
        return left.contains(value);
      }
    } else {
      if (this.right == null) {
        return false;
      } else {
        return right.contains(value);
      }
    }
  }

  /**
   * Returns the same values as the former method, but for every element that
   * is checked prints its value on screen.
   *
   * @param value the value to search the set for
   * @return whether or not the set contains the given value
   */
  @Override
  public boolean containsVerbose(int value) {
    System.out.println("Searching for " + value + ": checking " + this.value);
    if (value == this.value) {
      return true;
    } else if (value < this.value) {
      if (this.left == null) {
        return false;
      } else {
        return left.containsVerbose(value);
      }
    } else {
      if (this.right == null) {
        return false;
      } else {
        return right.containsVerbose(value);
      }
    }
  }

  /**
   * Returns a string with the values of the elements in the set separated by
   * commas.
   *
   * @return the string of all the current values in the set
   */
  @Override
  public String toString() {
    String treeSet = "";
    if (this.left != null) {
      treeSet += left.toString();
    }
    treeSet += this.value + ", ";
    if (this.right != null) {
      treeSet += right.toString();
    }
    return treeSet;
  }
}
