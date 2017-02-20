package com.github.bbkpij201675.programminginjava.day15;

import java.time.Duration;
import java.time.Instant;

/**
 * asdasd
 */
public class Two {
  private int[] precalculated = null;

  /**
   * sadsad
   * @param n
   * @return
   */
  public static int fib(int n) {
    if ((n == 1) || (n == 2)) {
      return 1;
    } else {
      int result = fib(n - 1) + fib(n - 2);
      return result;
    }
  }

  /**
   * ADd
   * @param n
   * @return
   */
  public int fibM(int n) {
    if (precalculated == null) {
      initPrecalculatedArray(n);
    }
    if (precalculated[n - 1] != -1) {
      return precalculated[n - 1];
    } else {
      int result = fibM(n - 1) + fibM(n - 2);
      precalculated[n - 1] = result;
      return result;
    }
  }

  private void initPrecalculatedArray(int size) {
    precalculated = new int[size];
    for (int i = 0; i < precalculated.length; i++) {
      precalculated[i] = -1; // to indicate "not calculated yet"
    }
    precalculated[0] = 1; // F(1)
    precalculated[1] = 1; // F(2)
  }

  public static void main(String[] args) {
    Two test = new Two();

    Instant start = Instant.now();
    System.out.println(test.fib(50));
    Instant end = Instant.now();
    Duration runtime = Duration.between(start, end);
    System.out.println(runtime.getSeconds() + "s " + (runtime.getNano()
        / 1000000) + "ns");
    Instant start2 = Instant.now();
    System.out.println(test.fibM(50));
    Instant end2 = Instant.now();
    runtime = Duration.between(start2, end2);
    System.out.println(runtime.getSeconds() + "s " + (runtime.getNano()
        / 1000000) + "ns");
  }
}
