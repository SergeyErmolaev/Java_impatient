package ch01.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> friends = new ArrayList<>();
		friends.add("Peter");
		friends.add("Paul");
//		friends.add("Mary");
		System.out.println(friends);
		friends.remove(1);
		friends.add(0, "Paul");
		System.out.println(friends);
		String first = (String) friends.get(0);
		System.out.println(first);
		friends.set(1, "Mary");
		System.out.println(friends);
		friends.add("Peter");
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		
		int[] primes = new int[10];
		int[] numbers = primes;
//		int[] primes = new int[10];
		numbers[5] = 42;
		System.out.println(numbers[5]);		
		int[] copyOfPrimes = primes.clone();
		System.out.println(copyOfPrimes[5]);
		int[] copyOfPrimes2 = Arrays.copyOf(primes, primes.length);
		System.out.println(Arrays.toString(copyOfPrimes2));
		
		ArrayList<String> people = friends;
		people.set(0, "Mary");
		ArrayList<String> copiedFriends = new ArrayList<>(friends);
		System.out.println(copiedFriends);
		
		String[] names = friends.toArray(new String[0]);
		System.out.println(Arrays.toString(names));
		ArrayList<String> friends2 = new ArrayList<>(Arrays.asList(names));
		System.out.println(friends2);
		
		ArrayList<String> friends3 = new ArrayList<String>(Arrays.asList("Peter", "Paul", "Mary"));
		System.out.println(friends3);
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		Collections.sort(friends3);
		System.out.println(friends3);
		Collections.reverse(friends3);
		System.out.println(friends3);
		Collections.shuffle(friends3);
		System.out.println(friends3);
	}

}
