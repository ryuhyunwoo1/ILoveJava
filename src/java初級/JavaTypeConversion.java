package java初級;

public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat = "37.52127220511242   ";
		
		//空白を消去して、タイプを変換します。
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
	}
}
