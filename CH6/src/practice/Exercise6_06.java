package practice;

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
}

class Exercise6_06 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
}
