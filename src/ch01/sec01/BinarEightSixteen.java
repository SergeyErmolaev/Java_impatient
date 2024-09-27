package ch01.sec01;

public class BinarEightSixteen {
	
	public static String toBinaryString(int value) {
		String bin = "";
		while (value > 0) {
			bin = (value % 2) + bin;
			value /= 2;
		}
		
		return bin;
	}
	
	public static String toOctalString(int value) {
		String oct = "";
		while (value > 0) {
			oct = (value % 8) + oct;
			value /= 8;
		}

		return oct;
	}
	
	public static String toHexString(int value) {
		String hex = "";
		while (value > 0) {
			int digit = value % 16;
			if (digit < 10) {
				hex = digit + hex;
			} else {
				hex = (char) ('A' + digit - 10) + hex;
			}
			value /= 16;
		}

		return hex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toBinaryString(5));
		System.out.println(toOctalString(50));
		System.out.println((char) ('A' + 14 - 10));
		System.out.println(toHexString(1000));
	}

}
