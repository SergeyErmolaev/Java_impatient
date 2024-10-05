package ch01.sec01;

import java.math.BigInteger;

public class Factorial {
	public static BigInteger Factorial(int n) {
        // TODO Auto-generated constructor stub
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i)); 
		}
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		BigInteger factorial = Factorial(n);
		System.out.println(factorial);
	}

}
