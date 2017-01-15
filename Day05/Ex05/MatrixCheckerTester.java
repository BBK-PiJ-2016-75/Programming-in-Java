public class MatrixCheckerTester {
  
  public static void main(String[] args) {
    MatrixCheckerTester tester = new MatrixCheckerTester();
    tester.run();
  }
  
  private void run() {
    MatrixChecker myChecker = new MatrixChecker();
    
    //Check if arrays are symmetrical.
    int[] symmetricalArray = {1, 2, 3, 2, 1};
    int[] nonSymmetricalArray = {1, 2, 3, 4, 5};
    System.out.println("The 1st array is symmetrical: "
        + myChecker.isSymmetrical(symmetricalArray));
    System.out.println("The 2nd array is symmetrical: "
        + myChecker.isSymmetrical(nonSymmetricalArray));
    
    //Check if 2D arrays are symmetrical.
    int[][] symmetrical2D = {
      {1, 2, 3},
      {2, 4, 5},
      {3, 5, 6},
    };
    int[][] nonSymmetrical2D = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9},
    };
    System.out.println("The 1st 2D array is symmetrical: "
        + myChecker.isSymmetrical(symmetrical2D));
    System.out.println("The 2nd 2D array is symmetrical: "
        + myChecker.isSymmetrical(nonSymmetrical2D));
        
    //Check if 2D arrays are triangular.
    int[][] triangular2D = {
      {1, 2, 3},
      {0, 4, 5},
      {0, 0, 6},
    };
    int[][] nonTriangular2D = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9},
    };
    System.out.println("The 1st 2D array is triangular: "
        + myChecker.isTriangular(triangular2D));
    System.out.println("The 2nd 2D array is triangular: "
        + myChecker.isTriangular(nonTriangular2D));
  }
}