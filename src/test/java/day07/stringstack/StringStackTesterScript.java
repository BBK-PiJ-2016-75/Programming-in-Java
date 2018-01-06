package day07.stringstack;

public class StringStackTesterScript {

  public static void main(String[] args) {
    StringStackTesterScript script = new StringStackTesterScript();
    script.launch();
  }

  /**
   * Launches two string stacks and tests them.
   */
  public void launch() {
    StringStack firstStack = new PointerStringStack();
    testStack(firstStack);
    StringStack secondStack = new ArrayStringStack();
    testStack(secondStack);
  }

  private void testStack(StringStack stack) {
    System.out.println("Testing the stack...");
    stack.push("First string");
    stack.push("Second string");
    stack.push("Third string...");
    System.out.println("Visible element in the stack: '" + stack.peek() + "'");
    stack.push("Fourth string...");
    stack.push("Fifth string...");
    stack.push("Sixth string...");
    stack.push("Seventh string...");
    System.out.println("Visible element in the stack: '" + stack.peek() + "'");
    stack.pop();
    stack.pop();
    stack.push("String number 6.");
    stack.push("String number 7.");
    stack.push("String number 8.");
    stack.push("String number 9.");
    stack.push("String number 10.");
    stack.push("String number 11.");
    System.out.println("Now let's see all the elements in the stack: ");
    while (!stack.isEmpty()) {
      System.out.println("Next element: '" + stack.pop() + "'");
    }
  }
}
