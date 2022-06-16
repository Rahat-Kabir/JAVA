import java.util.Scanner;

public class EvenOdd {
	//1. Write a program that takes an integer and determines if it’s odd or even. Use switch cases 
	//to produce result.
	public static void main(String[] args) {
	
          Scanner input = new Scanner(System.in);
          
          System.out.println("Enter a integer number : ");
          int num = input.nextInt();
          
          switch(num%2) {
          
          case 0:
        	  System.out.println("This is an even number and it is "+num);
        	  break;
          case 1:
        	  System.out.println("This is Odd number and it is "+num);
        	  
          
          }
		
	}

}
