package java中級;

public class BioSwitch {
	
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
		case 23 : result = "身体指数:"; break;
		case 28 : result = "感情指数:"; break;
		case 33 : result = "知性指数:"; break;
		}
		return result + (value * 100);
	}
	
	public static void main(String[] args) {
		int index = 23;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}
	
}
