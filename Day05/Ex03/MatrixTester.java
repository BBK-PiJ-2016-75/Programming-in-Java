public class MatrixTester {
  
  public static void main(String[] args) {
    Matrix myMatrix = new Matrix(3, 3);
    myMatrix.prettyPrint();
    myMatrix.setElement(1, 1, 999);
    myMatrix.prettyPrint();
    String set = "11,22,33";
    myMatrix.setRow(1, set);
    myMatrix.prettyPrint();
    myMatrix.setColumn(1, set);
    myMatrix.prettyPrint();
    String str = myMatrix.toString();
    System.out.println(str);
  }
}