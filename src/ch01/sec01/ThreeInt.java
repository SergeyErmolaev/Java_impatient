package ch01.sec01;

public class ThreeInt {
	int a;
	int b;
	int c;
	
	public int ThreeInt(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}
	
	public static int ThreeIntD(int a, int b, int c) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		
		int max;
		
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeInt ti = new ThreeInt();
		System.out.println(ti.ThreeInt(20, 10, 30));
		
		System.out.println(ThreeIntD(20, 10, 30));
	}

}
