package java中級;

public class SwitchStringCondition {
	
	public static double toMoney(String c) {
		double tot = 0.0;
		switch(c) {
		case "USD": tot = 1126.5; break;
		case "JPY": tot = 10.6; break;
		case "CNY": tot = 190.5; break;
		default : tot = 1; break;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		String money = "USD";
		double result = toMoney(money);
		System.out.printf("%s => %f \n", money, result);
	}
}
