package java中級;

public class ForCondition {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 100; i ++) {
			s += i;
		}
		System.out.println("1-100の足し算: " + s);
		
		s = 0;
		for (int i = 1; i <= 100; i ++) {
			if (i % 2 == 1) {
				s += i;
			}
		}
		System.out.println("1-100での奇数の足し算: " + s);
	}
}
