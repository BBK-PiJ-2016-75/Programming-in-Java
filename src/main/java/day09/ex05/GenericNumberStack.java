package day09.ex05;

/**
 * A generic stack, which only accepts Number and its subclass objects.
 *
 * @param <N> the generic number type for the stack
 */
public class GenericNumberStack<N extends Number> {
  private N data;
  private GenericNumberStack previous;

  public GenericNumberStack(N data) {
    this.data = data;
    this.previous = null;
  }

  /**
   * Pushes a new generic number type onto the stack.
   *
   * @param newData the number to push
   */
  public void push(N newData) {
    if (this.isEmpty()) {
      this.previous = new GenericNumberStack<>(newData);
      System.out.println("Pushed: " + newData);
    } else {
      this.previous.push(newData);
    }
  }

  /**
   * Pops the top generic number off of the stack.
   *
   * @return the popped number
   */
  public N pop() {
    if (this.previous.isEmpty()) {
      N toPop = (N) this.previous.data;
      this.previous = null;
      System.out.println("Popped: " + toPop);
      return toPop;
    } else {
      return (N) this.previous.pop();
    }
  }

  /**
   * Checks if the stack is empty or not.
   *
   * @return whether stack is empty
   */
  public boolean isEmpty() {
    return this.previous == null;
  }
}
