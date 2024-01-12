package java中級;

public class BioSwitch2 {
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL = 33;
	
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
		case PHYSICAL : result = "身体指数:"; break;
		case EMOTIONAL : result = "感情指数:"; break;
		case INTELLECTUAL : result = "知性指数:"; break;
		default : result = "未決定:"; break;
		}
		
		return result + (value * 100);
	}
	
	public static void main(String[] args) {
		int index = PHYSICAL;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}
}
