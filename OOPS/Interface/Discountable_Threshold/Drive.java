import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double price = sc.nextDouble();
		double discount = sc.nextDouble();
		
		PercentageDiscount PD = new PercentageDiscount(discount);
		ThresholdDiscount TD = new ThresholdDiscount(100,10);
		
		System.out.println(PD.discountedPrice(price));
		System.out.println(TD.discountedPrice(price));
		
	}

}
