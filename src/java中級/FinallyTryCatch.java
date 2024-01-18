package java中級;

public class FinallyTryCatch {
	public static void main(String[] args) {
		
		try {
			int x= 5;
			int y = 20 / (5 - x);
			System.out.println(y);
		} catch (ArithmeticException ee) {
			System.out.println("--> 0으로 나눴나 확인");
		} finally {
			System.out.println("수행되어야만 한다.");
		}
		
	}
}
