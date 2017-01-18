public class Factorials {
  
  public static int factorialRecursive(int n) {
    if (n == 1) {
      return 1;
    } else {
      int result = n * factorialRecursive(n -1);
      return result;
    }
  }
  
  public static int factorialIterative(int n) {
    int result = n;
    for (int i = n - 1; i > 0; i--) {
      result *= i;
    }
    return result;
  }
  
  public static void main(String[] args) {
    int recursive = factorialRecursive(5);
    System.out.println(recursive);
    System.out.println("Expected: 120");
    int iterative = factorialIterative(5);
    System.out.println(iterative);
    System.out.println("Expected: 120");
  }
}