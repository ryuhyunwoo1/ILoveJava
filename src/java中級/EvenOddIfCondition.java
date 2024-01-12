package java中級;

public class EvenOddIfCondition {
	public static void main(String[] args) {
		int temp = 99;
		
		if (temp % 2 == 1) {
			temp = temp*3+1;
		} else {
			temp = temp / 2;
		}
		
		System.out.printf("計算結果＝%d \n", temp);
	}
}
