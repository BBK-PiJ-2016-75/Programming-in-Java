public class ArrayUtilities {
  
  public static integerNode arrayToList(int[] array) {
    integerNode integerNodeList = new integerNode(array[0]);
    for (int i = 1; i < array.length; i++) {
      integerNode nodeToAdd = new integerNode(array[i]);
      integerNodeList.addIntegerNode(nodeToAdd);
    }
    return integerNodeList;
  }
  
  public static void printIntegerList(integerNode list) {
    if (list.getNextNode() == null) {
      System.out.println(list.getValue());
    } else {
      System.out.print(list.getValue() + ", ");
      printIntegerList(list.getNextNode());
    }
  }
}