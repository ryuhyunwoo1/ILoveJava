package java中級;

public class BitNShiftMain2 {
	
	public static int BITMASK = 1;
	
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for (int i = 0; i <= 31; i ++) {
			s = (a & BITMASK) + s;    // if a is 1, then (a & BITMASK(1)) is also 1.
			a >>= 1;    // a = a / 2;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}
}
