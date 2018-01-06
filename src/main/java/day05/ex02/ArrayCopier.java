package day05.ex02;

/**
 * Copies the contents of one array to another. If the source array is
 * shorter or equal than the destination array, then all of its contents
 * are copied. If it is longer, then as many items as can fill the destination
 * array are copied.
 */
public class ArrayCopier {

  /**
   * Compares the lengths of the source and destination arrays and copies the
   * content from the source accordingly.
   *
   * @param src the source array.
   * @param dst the destination array.
   */
  public void copy(int[] src, int[] dst) {
    if (dst.length < src.length) {
      for (int i = 0; i < dst.length; i++) {
        dst[i] = src[i];
      }
    } else {
      for (int i = 0; i < src.length; i++) {
        dst[i] = src[i];
      }
    }
    if (dst.length > src.length) {
      for (int i = src.length; i < dst.length; i++) {
        dst[i] = 0;
      }
    }
  }
}
