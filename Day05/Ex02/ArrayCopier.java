public class ArrayCopier {
  
  public void copy(int[] src, int[] dst) {
    if (dst.length < src.length) {
      for (int i = 0; i < dst.length; i++) {
        dst[i] = src[i];
      }
    } else {
      for (int i = 0; i < src.length; i++) {
        dst[i] = src [i];
      }
    }
    if (dst.length > src.length) {
      for (int i = src.length; i < dst.length; i++) {
        dst[i] = 0;
      }
    }
  }
}