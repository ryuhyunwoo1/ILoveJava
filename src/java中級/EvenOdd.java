package java中級;

public class EvenOdd {
	
	public static void showOddnEvenw(int n) {
		int temp = n;
		while (temp != 1) {
			if (temp % 2 == 1) {
				temp = temp * 3 + 1;
			} else {
				temp = temp / 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n---------------");
	}
	
	public static void main(String[] args) {
		showOddnEvenw(122);
	}
}
