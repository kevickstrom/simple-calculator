package basic;

import java.util.Arrays;
import java.util.Scanner;

public class littleMore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		/*System.out.println("Enter numbers to be evaluated seperated by whitespace");
		String m = input.nextLine();
		String[] math = m.split(" ");
		System.out.println(math.length);
		//System.out.println(Arrays.toString(math));
		input.close();
		for (int i=0; i < math.length; i++) {
			System.out.println("math["+i+"]:"+math[i]);
			}
		
		System.out.println(math[0] + math[1]);
		*/
		int exit = 0;
while(exit < 1) {		

		System.out.println("enter a number");
		double num1 = input.nextDouble();
		System.out.println("enter an operation");
		String operation = input.next();
		System.out.println("enter another number");
		double num2 = input.nextDouble();
		double output;
		switch(operation)
		{
		case "+":
			output = num1 + num2;
			break;
			
		case "-":
			output = num1 - num2;
			break;
			
		case "*":
			output = num1 * num2;
			break;	
		
		case "/":
			output = num1 / num2;
			break;	
			
		default:
			System.out.println("you fucked up");
			return;	
		}
		
		System.out.println(output);
		
		
		System.out.println("exit? Y/N");
		String askexit = input.next();
		if (askexit.contentEquals("Y")) {
			exit = 1;
			}
		if (askexit.contentEquals("y")) {
			exit = 1;
			}
}
	if (exit == 1) {
	System.exit(0);
	
	
	input.close();	
	}
	}
	
	}
	
		
	



	   
	