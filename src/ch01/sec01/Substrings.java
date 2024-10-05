package ch01.sec01;

import java.util.Scanner;

public class Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = scanner.nextLine();
        scanner.close();
        
        System.out.println("All non-empty substrings:");
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
	}

}
