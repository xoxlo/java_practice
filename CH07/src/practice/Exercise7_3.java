package practice;

class Product3
{
	int price;				// 제품의 가격
	int bonusPoint;			// 제품구매 시 제공하는 보너스 점수
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv4 extends Product3 {
	
	Tv4(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}
public class Exercise7_3 {
	public static void main(String[] args) {
		Tv4 t = new Tv4();
	}
}
