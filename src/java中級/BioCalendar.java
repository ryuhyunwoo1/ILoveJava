package java中級;

public class BioCalendar {
	
	public static final int PHYSICAL = 23;
	
	public static void main(String[] args) {
		int index	= PHYSICAL;
		int days	= 1200;
		double phyval = 100 * Math.sin((days % index) * 2 * Math.PI / index);
		
		System.out.printf("自分の身体指数は %1$.2fです。\n", phyval);	
	}
}
