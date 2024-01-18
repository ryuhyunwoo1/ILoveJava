package java中級;

import java.util.Date;

public class SystemTest {
	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println((ltime));
		for (int i = 0; i < 100000; i ++) {
			System.out.print("");
		}
		
		long ltime2 = System.currentTimeMillis();
		System.out.println((ltime2 - ltime));
		System.out.println(ltime2 / 1000 / 60 / 60 / 24 / 365 + "년");
		
		
	}
}
