package practice;

public class Exercise6_04 {
	static double getDistance(int x, int y, int x1, int y1) {
		double result;
		result = Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
