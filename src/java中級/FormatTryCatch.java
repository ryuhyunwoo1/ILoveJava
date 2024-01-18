package java中級;

public class FormatTryCatch {
	public static void main(String[] args) {
		String sNum = "123";
		String nNum = "h";
		
		try {
			int a = Integer.parseInt(nNum);
			System.out.println(a);
		} catch (NumberFormatException ee) {
			System.out.println("int인지 확인요망");
			System.out.println(ee.getMessage());
		} catch (Exception ee) {
			System.out.println("??");
		} finally {
			System.out.println("수행되어야만 한다.");
		}
		
		
	}
}
