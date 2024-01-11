package java初級;

import java.util.*;

public class JavaObjectType {
	public static void main(String[] args) {
		int[] m = {1,2,3};
		int[] n = new int[] {1,2,3};
		
		String card = "H8";
		Date d		= new Date();
		Calendar cal = Calendar.getInstance(); // 今日
		
		System.out.println(card);
		System.out.println();
		System.out.println(d);
		System.out.println();
		System.out.println(cal);
	}
}
