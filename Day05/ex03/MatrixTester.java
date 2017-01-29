package ex03;

/**
 * Simple program to test the methods of the Matrix class.
 */
public class MatrixTester {

  public static void main(String[] args) {
    MatrixTester tester = new MatrixTester();
    tester.run();
  }

  private void run() {
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
    System.out.println("Testing complete!");
  }
}
