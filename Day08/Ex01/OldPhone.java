package ex01;

/**
 * An implementation of the phone interface which can only make calls.
 */
public class OldPhone implements Phone {

  @Override
  public void call(String number) {
    System.out.println("Calling: " + number);
  }
}
