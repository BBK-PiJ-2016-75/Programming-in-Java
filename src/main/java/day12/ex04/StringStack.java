package day12.ex04;

/**
 * A basic Stack of Strings.
 */
public interface StringStack {

  /**
   * Pushes a new string onto the stack.
   *
   * @param newText the string to push onto the stack
   */
  void push(String newText);

  /**
   * Retrieves the last element from the stack and returns it.
   * If the stack is empty, returns null.
   *
   * @return the top element of the stack
   */
  String pop();

  /**
   * Returns the last element from the stack (does not remove it).
   * If the stack is empty, returns null.
   *
   * @return the top element of the stack
   */
  String peek();

  /**
   * Returns true if the stack contains no elements, false otherwise.
   *
   * @return whether the stack is empty
   */
  boolean isEmpty();
}
