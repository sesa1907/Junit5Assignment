package math;

public class Discount {
	
	public int count (int price, int dis) {
		int c = 100 - dis;
		return (c*price) / 100;
	}
	
}