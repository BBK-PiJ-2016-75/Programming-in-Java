package com.github.bbkpij201675.programminginjava.day05.ex05;

/**
 * A class which checks the organisational structure of both 1-D and 2-D
 * (matrix) arrays.
 */
public class MatrixChecker {

  /**
   * Checks whether or not an array is symmetrically organised.
   * @param array the array to be checked.
   * @return true if the array is symmetrical.
   */
  public boolean isSymmetrical(int[] array) {
    boolean symmetrical = true;
    for (int i = 0; symmetrical && i < array.length / 2; i++) {
      if (array[i] != array[array.length - 1 - i]) {
        symmetrical = false;
      }
    }
    return symmetrical;
  }

  /**
   * Checks whether or not a matrix array is symmetrically organised.
   * @param array the matrix array to be checked.
   * @return true if the matrix array is symmetrical.
   */
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

  /**
   * Checks whether or not a matrix array is triangularly organised.
   * @param array the matrix array to be checked.
   * @return true if the matrix array is triangular.
   */
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
