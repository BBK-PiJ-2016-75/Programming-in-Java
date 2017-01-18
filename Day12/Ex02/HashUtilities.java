public class HashUtilities {
  
  public static int shortHash(int inputInt) {
    int result = Math.abs(inputInt % 1000);
    return result;
  }
}