package ex05;

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
    boolean symmetrical = true;
    if (array.length != array[0].length) {
      symmetrical = false;
    }
    for (int i = 0; symmetrical && i < array.length; i++) {
      for (int j = 0; symmetrical && j < array[0].length; j++) {
        if (array[i][j] != array[j][i]) {
          symmetrical = false;
        }
      }
    }
    return symmetrical;
  }
  
  public boolean isTriangular(int[][] array) {
    boolean triangular = true;
    for (int i = 1; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (i > j && array[i][j] != 0) {
          triangular = false;
        }
      }
    }
    return triangular;
  }
}