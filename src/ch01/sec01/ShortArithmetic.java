package ch01.sec01;

import java.util.Scanner;

public class ShortArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (0-65535): ");
//        short num1 = (short) (scanner.nextInt() & 0xFFFF);
        short num1 = (short) Short.toUnsignedInt((short) scanner.nextInt());

        System.out.print("Введите второе число (0-65535): ");
//        short num2 = (short) (scanner.nextInt() & 0xFFFF);
        short num2 = (short) Short.toUnsignedInt((short) scanner.nextInt());

        scanner.close();
        
        int unsignedNum1 = num1 & 0xFFFF;
        int unsignedNum2 = num2 & 0xFFFF;
        
        int sum = unsignedNum1 + unsignedNum2;
        int difference = unsignedNum1 - unsignedNum2;
        int product = unsignedNum1 * unsignedNum2;
        int quotient = unsignedNum1 / unsignedNum2;
        int remainder = unsignedNum1 % unsignedNum2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
        System.out.println("Остаток: " + remainder);
	}

}
