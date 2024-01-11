package java初級;

public class Grad {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int math = 89;
		int tot = kor + eng + math;
		
		int average1 = tot / 3;
		double average2 = ((double) tot / 3);
		
		System.out.printf("国語 %d点, 英語 %d点, 数学 %d点 => ", kor, eng, math);
		System.out.printf("総点 %d点, 平均点数は %d点　\n", tot, average1);
		
		System.out.println(average2);
	}
}
