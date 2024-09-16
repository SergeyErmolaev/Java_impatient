package ch01.sec01;

import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {
	
	static String location = "Java";
	static String greeting = "Hello " + location;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		System.out.println(generator.nextInt());
		System.out.println(generator.nextInt());
		
		System.out.println(greeting);
		
		String names = String.join(", ", "Peter", "Paul", "Mary");
		System.out.println(names);
		
		String greeting = "Hello, World!";
		String location = greeting.substring(7, 12);
		System.out.println(location);
		
		String[] results = names.split(", ");
		System.out.println(Arrays.toString(results));
		
		if ("World".equals(location)) {
			System.out.println("The world is not enough");
		} else {
			System.out.println("Hello, " + location);
		}
		
		int n = 42;
		String str = Integer.toString(n);
		System.out.println(str);
		
		str = Integer.toString(n, 2);
		System.out.println(str);
		
		n = Integer.parseInt(str);
		System.out.println(n);
		
		n = Integer.parseInt(str, 2);
		System.out.println(n);
	}

}
