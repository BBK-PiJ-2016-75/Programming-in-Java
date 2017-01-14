public class Matrix {
  
  private int[][] matrix = null;
  
  public Matrix(int rows,int columns) {
    this.matrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = 1;
      }
    }
  }
  
  public void setElement(int row,int column,int value) {
    if (row <= this.matrix.length - 1 && column <= this.matrix[0].length - 1) {
      this.matrix[row][column] = value;
    }
  }
  
  public void setRow(int row, String values) {
    int numberOfValues = countString(values);
    if (numberOfValues == this.matrix[0].length && row <= this.matrix.length - 1) {
      int[] array = convertString(numberOfValues, values);
      for (int i = 0; i < this.matrix.length; i++) {
        this.matrix[row][i] = array[i];
      }
    } 
  }
  
  public void setColumn(int column, String values) {
    int numberOfValues = countString(values);
    if (numberOfValues == this.matrix.length && column <= this.matrix[0].length - 1) {
      int[] array = convertString(numberOfValues, values);
      for (int i = 0; i < this.matrix[0].length; i++) {
        this.matrix[i][column] = array[i];
      }
    }
  }
  
  public String toString() {
    String matrixString = "[";
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrixString += matrix[i][j];
        if (j < matrix[0].length -1) {
          matrixString += ",";
        }
      }
      if (i < matrix.length -1) {
        matrixString += ";";
      }
    }
    matrixString += "]";
    return matrixString;
  }
  
  public void prettyPrint() {
    for (int i = 0; i < matrix.length; i++) {
      System.out.print("[");
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j]);
        if (j < matrix[0].length -1) {
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