import java.util.Arrays;
import java.util.Scanner;

public class secondlargestNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many number you want to input : ");
		int size = input.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Input element : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Array which you inputed ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\n");
		
		Arrays.sort(arr);

		System.out.println("This array after sorting \n "+Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr));
		
		int index = arr.length-2;
		System.out.println("Second Largest number : "+arr[index]);
		

	}

}
