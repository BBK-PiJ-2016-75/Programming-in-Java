package com.github.bbkpij201675.programminginjava.day06.ex10;

/**
 * A list of integer nodes, which is constructed so that all nodes are sorted
 * according to their values.
 */
public class SortedLinkedList {
  private SortedListNode firstNode = null;

  public SortedListNode getFirst() {
    return firstNode;
  }

  public void setFirst(SortedListNode firstNode) {
    this.firstNode = firstNode;
  }

  /**
   * Adds a node to the sorted list in order of its value.
   *
   * @param nodeToAdd the node to be added to the list.
   */
  public void addNode(SortedListNode nodeToAdd) {
    if (firstNode == null) {
      firstNode = nodeToAdd;
    } else {
      if (nodeToAdd.getValue() < firstNode.getValue()) {
        nodeToAdd.setNextNode(firstNode);
        firstNode = nodeToAdd;
      } else {
        SortedListNode currentNode = firstNode;
        boolean finished = false;
        while (!finished && currentNode.getNextNode() != null) {
          if (nodeToAdd.getValue() <= currentNode.getNextNode().getValue()
              && nodeToAdd.getValue() >= currentNode.getValue()) {
            nodeToAdd.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(nodeToAdd);
            finished = true;
          } else {
            currentNode = currentNode.getNextNode();
          }
        }
        if (!finished) {
          currentNode.setNextNode(nodeToAdd);
        }
      }
    }
  }

  /**
   * Prints the value of each node in the sorted list to the console.
   */
  public void printList() {
    if (firstNode == null) {
      System.out.println("List empty. Nothing to print.");
    } else {
      SortedListNode currentNode = firstNode;
      while (currentNode.getNextNode() != null) {
        System.out.print(currentNode.getValue() + ", ");
        currentNode = currentNode.getNextNode();
      }
      System.out.println(currentNode.getValue() + ".");
    }
  }
}
