public class MatrixChecker {
  
  public boolean isSymmetrical(int[] array) {
    boolean symmetrical = true;
    for (int i = 0; symmetrical && i < array.length / 2; i++) {
      if (array[i] != array[array.length - 1 - i]) {
        symmetrical = false;
      }
    }
    return symmetrical;
  }
  
  public boolean isSymmetrical(int[][] array) {
    return true;
  }
  
  public boolean isTriangular(int[][] array) {
    return true;
  }
}