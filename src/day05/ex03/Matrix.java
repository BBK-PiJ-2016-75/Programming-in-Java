package com.github.bbkpij201675.programminginjava.day05.ex03;

/**
 * Creates a 2-D array.
 */
public class Matrix {
  private int[][] matrix = null;

  /**
   * Constructs a new 2-D array.
   * @param rows the number of rows in the matrix array.
   * @param columns the number of columns in the matrix array.
   */
  public Matrix(int rows, int columns) {
    this.matrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = 1;
      }
    }
  }

  /**
   * Sets a specific element within the matrix array.
   * @param row the element's row position.
   * @param column the element's column position.
   * @param value the element's desired value.
   */
  public void setElement(int row, int column, int value) {
    if (row <= this.matrix.length - 1 && column <= this.matrix[0].length - 1) {
      this.matrix[row][column] = value;
    }
  }

  /**
   * Sets the values of an entire row in the matrix array.
   * @param row the target row number.
   * @param values the desired values of the elements in the target row.
   */
  public void setRow(int row, String values) {
    int numberOfValues = countString(values);
    if (numberOfValues == this.matrix[0].length
        && row <= this.matrix.length - 1) {
      int[] array = convertString(numberOfValues, values);
      for (int i = 0; i < this.matrix.length; i++) {
        this.matrix[row][i] = array[i];
      }
    }
  }

  /**
   * Sets the values of an entire column in the matrix array.
   * @param column the target column number.
   * @param values the desired values of the elements in the target column.
   */
  public void setColumn(int column, String values) {
    int numberOfValues = countString(values);
    if (numberOfValues == this.matrix.length
        && column <= this.matrix[0].length - 1) {
      int[] array = convertString(numberOfValues, values);
      for (int i = 0; i < this.matrix[0].length; i++) {
        this.matrix[i][column] = array[i];
      }
    }
  }

  /**
   * Creates a string comprised of the all the values held by the matrix array.
   * @return the string of the array's values.
   */
  public String toString() {
    String matrixString = "[";
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrixString += matrix[i][j];
        if (j < matrix[0].length - 1) {
          matrixString += ",";
        }
      }
      if (i < matrix.length - 1) {
        matrixString += ";";
      }
    }
    matrixString += "]";
    return matrixString;
  }

  /**
   * Prints to the console all the values held by the matrix array.
   */
  public void prettyPrint() {
    for (int i = 0; i < matrix.length; i++) {
      System.out.print("[");
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j]);
        if (j < matrix[0].length - 1) {
          System.out.print("\t");
        }
      }
      if (i < matrix.length) {
        System.out.println("]");
      }
    }
    System.out.println("");
  }

  //Count how many numbers are present in string before entering values.
  private int countString(String toCount) {
    int count = 1; //To count the last number in the string.
    for (int i = 0; i < toCount.length(); i++) {
      if (toCount.charAt(i) == ',') {
        count++;
      }
    }
    return count;
  }

  //Convert string to an array of integers.
  private int[] convertString(int size, String toConvert) {
    int[] converted = new int[size];
    int position = 0;
    for (int i = 0; i < size; i++) {
      String toParse = "";
      while (position < toConvert.length() && toConvert.charAt(position) != ',') {
        toParse += toConvert.charAt(position);
        position++;
      }
      converted[i] = Integer.parseInt(toParse);
      position++;
    }
    return converted;
  }
}
