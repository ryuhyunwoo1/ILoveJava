package java初級;

public class Grad2 {
	public static void main(String[] args) {
		int[] grade = {90, 80, 80};
		int tot 	= grade[0] + grade[1] + grade[2];
		int average = tot / 3;
		
		System.out.printf("国語 %d点, 英語 %d点, 数学 %d点 => ", grade[0], grade[1], grade[2]);
		System.out.printf("総点 %d点, 平均点数は %d点　\n", tot, average);
	}
}
