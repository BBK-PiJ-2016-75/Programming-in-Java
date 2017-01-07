public class Calculator {
	
	public static void add(int x, int y) {
		int result = x + y;
		System.out.println(result);
  }
	
	public static void subtract(int x, int y) {
		int result = x - y;
		System.out.println(result);
	}
	
	public static void multiply(int x, int y) {
		int result = x * y;
		System.out.println(result);
	}
	
	public static void divide(int x, int y) {
		double result = (double) x / y;
		System.out.println(result);
	}
	
	public static void modulus(int x, int y) {
		int result = x % y;
		System.out.println(result);
	}
}