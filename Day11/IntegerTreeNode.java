public class IntegerTreeNode {
  
  private int value;
  private IntegerTreeNode left;
  private IntegerTreeNode right;
  
  public IntegerTreeNode(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
  
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
  
  public int getMax() {
    if (right == null) {
      return value;
    } else {
      return right.getMax();
    }
  }
  
  public int getMin() {
    if (left == null) {
      return value;
    } else {
      return left.getMin();
    }
  }
  
  public String toString() {
    String treeString = "[" + value;
    if (left == null) {
      treeString += " L[]";
    } else {
      treeString += " L[" + left.toString() + "]";
    }
    if (right == null) {
      treeString += " R[]]";
    } else {
      treeString += " R[" + right.toString() + "]]";
    }
    return treeString;
  }
}