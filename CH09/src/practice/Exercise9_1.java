package practice;

public class Exercise9_1 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c1.eqauls(c2) = " + c1.equals(c2));
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) // obj의 num과 obj의 isKwang, 그리고 멤버변수(this)의 num, isKwang이 서로 같다면 true
			return (this.num == ((SutdaCard)obj).num) && (this.isKwang == ((SutdaCard)obj).isKwang);
		else
			return false;			// 다르면 false
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
