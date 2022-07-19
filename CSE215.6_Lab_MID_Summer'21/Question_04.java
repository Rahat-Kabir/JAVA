
import java.util.Scanner;

public class Question_04 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number to find factorial : ");
		int num = input.nextInt();
		Factorial(num);
	}

	public static void Factorial(int num) {
		int i;
		int fact = 1;
		
		for (i = 1; i <= num; i++) {
			fact = fact * i;
			
			//System.out.print(+fact+"*");
		}
		System.out.print(" Factorial of  " + num + " is : " + fact);

	}
}
