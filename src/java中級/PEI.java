package java中級;

public enum PEI {
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	
	//常数にvalueも指定
	private final int peiValue;
	PEI(int pie){
		this.peiValue = pie;
	}
	
	public int getPei() {
		return peiValue;
	}
}
