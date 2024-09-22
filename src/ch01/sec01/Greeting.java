// java -classpath ./bin ch01.sec01.Greeting -g cruel world
package ch01.sec01;

import java.util.Arrays;

public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			if (arg.equals("-h")) {
				System.out.print("Hello, ");
			} else if (arg.equals("-g")) {
				System.out.print("Goodbye, ");
			} 
			System.out.println(Arrays.toString(args));
		}
	}

}
