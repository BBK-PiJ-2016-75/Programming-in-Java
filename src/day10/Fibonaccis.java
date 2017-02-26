package com.github.bbkpij201675.programminginjava.day10;

public class Fibonaccis {

  public static int fibRecursive(int n) {
    if ((n == 1) || (n == 2)) {
      return 1;
    } else {
      int result = fibRecursive(n - 1) + fibRecursive(n - 2);
      return result;
    }
  }

  public static int fibIterative(int n) {
    int x = 1;
    int y = 1;
    for (int i = 1; i < n; i++) {
      int temp = y;
      y += x;
      x = temp;
    }
    return x;
  }

  public static void main(String[] args) {
    int recursive = fibRecursive(9);
    System.out.println(recursive);
    int iterative = fibIterative(9);
    System.out.println(iterative);
  }
}