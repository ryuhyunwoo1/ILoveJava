package javaの基礎;

import java.util.*;
import java.lang.System.*;
import java.text.*;

public class DateTest {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		int days	= (int) (millis / 1000 / 24 / 60 / 60); //1970-1-1からの日数
		
		Date d		= new Date();	// 今日
		Date dd		= new Date(d.getTime() + 24*60*60*1000); // 明日

		System.out.println(millis);
		System.out.println(days);
		System.out.println(d);
		System.out.println(dd);
	}
}
