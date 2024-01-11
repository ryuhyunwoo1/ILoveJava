package java初級;

import java.util.*;

public class InOutMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("整数を入力してください");
		int choice = scanner.nextInt();
		System.out.println(choice);
		
		System.out.println("実数を入力してください");
		double rchoice = scanner.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("文字列を入力してください");
		String schoice = scanner.next();
		System.out.println(schoice);
	}
}
