public class Integer2 {
  
  private int value;
  
  public int getValue() {
    return value;
  }
  
  public void setValue(int number) {
    value = number;
  }
  
  public boolean isEven() {
    if (value % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  public boolean isOdd() {
    if (value % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }
  
  public void prettyPrint() {
    System.out.println(value);
  }
  
  public String toString() {
    String number = "" + value;
    return number;
  }
}