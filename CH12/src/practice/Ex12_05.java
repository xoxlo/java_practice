package practice;
//				  0   	1	  2		3
enum Direction {EAST, SOUTH, WEST, NORTH} // EAST,, ... 하나 하나가 기본형이 아니라 객체이다.

public class Ex12_05 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;	// 열거형타입.상수이름
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		System.out.println("d1 == d2 ? " + (d1 == d2)); // false
		System.out.println("d1 == d3 ? " + (d1 == d3));	// true
		System.out.println("d1.equals(d3) ? " + d1.equals(d3)); // 열거형 상수가 객체. equals 사용 가능
//		System.out.println("d2 > d3 ? " + (d1 > d3));	// 에러
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3))); // 왼.compareTo(오) 왼 > 오 -> 양수
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); // 왼.compareTo(오) 왼 < 오 -> 음수
		
		switch(d1) {
		case EAST:	// Direction.EAST라고 쓸 수 없다.
			System.out.println("The direction is EAST."); break;
		case SOUTH:
			System.out.println("The direction is SOUTH."); break;
		case WEST:
			System.out.println("The direction is WEST."); break;
		case NORTH:
			System.out.println("The directi on is NORTH."); break;
		default:
			System.out.println("Invalid dircetion."); break;
		}
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) // for(DIrection d : Direction.values())
			System.out.printf("%s = %s \n", d.name(), d.ordinal()); // 순서
	}
}
