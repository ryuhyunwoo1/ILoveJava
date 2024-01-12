package java中級;

public class Contraction {
	
	public static int sumEach(int n) {
		int tot = 0;
		while (n != 0) {
			tot = tot + n % 10;
			n = n / 10;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		int number = 1234567;
		int value = sumEach(number);
		System.out.printf("%dに対するそれぞれの数字の足し算は%dです。", number, value);
	}
}
