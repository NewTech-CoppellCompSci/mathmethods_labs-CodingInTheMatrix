package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me an integer: ");
		int number = inKey.nextInt();
		System.out.print("Give me another integer: ");
		int number2 = inKey.nextInt();
		
		int num = number;
		double num1Pow = Math.pow(number, number2);
		System.out.println(num1Pow + "\n");
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me an integer: ");
		int number = inKey.nextInt();
		
		double num2 = Math.sqrt(number);
		System.out.println("The square root of " + number + " is " + num2);
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me Side A: ");
		int number = inKey.nextInt();
		System.out.print("Give me Side B: ");
		int number2 = inKey.nextInt();
		
		
		double num1Pow = Math.pow(number, 2);
		double num2Pow = Math.pow(number, 2);
		System.out.println("Hypotenuse = " + (num1Pow + num2Pow) + "\n");
		
		
	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in);
		boolean zero = false;
		int input = 0;
		int total = 0; 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(!zero) {  
			
		System.out.print("Enter and Number: ");
		input = inKey.nextInt();
			
		total += input;
			
		if (input == 0) {
		zero = true;
		}
			
		}
		System.out.println("you entered " + input + " that summed up to " + total);
		
		
		System.out.println(input);
		System.out.println(total + "\n");

		
	}
	
	
	
	
	
	
}
