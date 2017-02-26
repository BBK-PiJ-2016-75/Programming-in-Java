package com.github.bbkpij201675.programminginjava.day11.ex01;

public class IntegerTreeNodeTester {

  public static void main(String[] args) {

    IntegerTreeNode tree = new IntegerTreeNode(4);
    tree.add(4);
    tree.add(2);
    tree.add(1);
    tree.add(3);
    tree.add(5);
    int max = tree.getMax();
    System.out.println(max);
    int min = tree.getMin();
    System.out.println(min);
    System.out.println(tree.toString());
  }
}