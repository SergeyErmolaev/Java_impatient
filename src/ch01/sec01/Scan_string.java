package ch01.sec01;

import java.util.Scanner;

public class Scan_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name="";
		int age=0;
		if (in.hasNextLine()) {
			name = in.nextLine();
		}
		System.out.print("How old are you? ");
		if (in.hasNextInt()) {
			age = in.nextInt();
		}
		in.close();
		String message = String.format("Hello, %s. Next year, you'll be %d.\n", name, age);
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
		System.out.printf("Hello, %s. Next year, you'll be %d", name, age + 1);
		System.out.println();
		System.out.printf("%8.2f", 1000.0/3.0);
		System.out.println();
		System.out.printf("%+,.2f", 100000.0 / 3.0);
		System.out.println();
		int[] a = new int[] {};
		int[] b = new int[0];
		System.out.println("Массив а имеет длинну " + a.length);
		System.out.println("Массив b имеет длинну " + b.length);
		
	}

}
