package java活用;

public class Card {
	
	private String cardVal; //データ保護-隠匿-接近制限
	
	public String getCardVal() {
		return cardVal;
	}
	
	public Card() {			//基本生成
		this.cardVal = "H2";
	}
	
	public Card(String s) {
		this.cardVal = s;
	}
	
	public Card(Card c) {	//コピ
		this(c.getCardVal());
	}
	
	
	// cardValの内容をOverride
	@Override
	public String toString() {
		return "[" + cardVal + "]";
	}
}
