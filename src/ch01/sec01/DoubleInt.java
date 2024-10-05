package ch01.sec01;

public class DoubleInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double largeDouble = 3.0e10; // Max int 2,147,483,647 is less than this double
        int convertedInt = (int) largeDouble;
        System.out.println("Double: " + largeDouble);
        System.out.println("Converted to int: " + convertedInt);
	}

}
