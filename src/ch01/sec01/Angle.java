package ch01.sec01;

public class Angle {
	
	private int normalazeDegree(int degree) {
        return degree % 360;
    }
	
	public int normalizeDegFl(int degree) {
		return Math.floorMod(degree, 360);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Angle().normalazeDegree(-365));
		System.out.println(new Angle().normalizeDegFl(-365));
	}

}
