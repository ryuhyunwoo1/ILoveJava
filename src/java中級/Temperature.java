package java中級;

public class Temperature {
	public static void main(String[] args) {
		for (int i = -20; i < 50; i ++) {
			double fahrenheit = 9.0/5*i+32;
			System.out.printf("celcius %d = fahrenheit %.2f \n", i, fahrenheit);
		}
	}
}
