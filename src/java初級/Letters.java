package java初級;

public class Letters {
	public static void main(String[] args) {
		char a = '月';
		String letter = "今日は月が美しい夜です。";
		
		int letterNumber = letter.length();
		int loc			 = letter.indexOf(a);
		System.out.printf("\"%s\" => %d文字で、'%c'は%d番目でおります。\n", letter, letterNumber, a, loc);
		
		char b = letter.charAt(loc);
		System.out.printf("\"%s\"の%d番目の文字は'%c'です。", letter, loc, b);
	}
}
