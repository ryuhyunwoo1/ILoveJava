package java中級;

public class BioSwitch3 {
	
	public static String textInfor(PEI index, double value) {
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
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println("身体指数増加値: " + index.getPei());
		
		String st = textInfor(index, value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
}
