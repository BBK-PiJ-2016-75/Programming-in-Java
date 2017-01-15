public class SortedLinkedListTester {
  
  public static void main(String[] args) {
    SortedLinkedListTester tester = new SortedLinkedListTester();
    tester.run();
  }
  
  private void run() {
    SortedLinkedList myList = new SortedLinkedList();
    for (int i = 0; i < 15; i++){
      int random = (int) Math.abs(1000 * Math.random());
      System.out.println(random + ", ");
      myList.addNode(new SortedListNode(random));
    }
    myList.printList();
  }
}