package ex01;

/**
 * A phone makes calls.
 */
public interface Phone {

  /**
   * Just print on the screen: "Calling (number)...".
   * @param number the phone number to call.
   */
  void call(String number);
}