package practice;

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck2() {
		for(int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle() {
		for(int i = 0; i < cards.length ; i++) {
			SutdaCard tmp;
			int j = (int)(Math.random()*cards.length);
			tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		// 유효성 검사 ! - 중요 !
		if(index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		int j = (int)(Math.random()*cards.length);
//		return pick(j); // pick(int index)를 호출 !
		return cards[j];
	}
}


class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2(){
		this(1, true);
	}
	
	SutdaCard2(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object 클래스의 toString()을 오버라이딩헀다
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ", ");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
