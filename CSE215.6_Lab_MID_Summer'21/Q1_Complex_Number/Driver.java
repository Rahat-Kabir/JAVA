
public class Driver {
	public static void main(String[] args) {

		Complex C1 = new Complex();
		C1.setReal(2);
		C1.setImaginary(3);
		
		
		Complex C2 = new Complex(5,6);
		
		Complex C3= C1.add(C2);
		Complex C4=C1.multiply(C2);
		System.out.println(C1.toString() );
		System.out.println();
		System.out.println(C1.getReal() + " i"+ C1.getImaginary());
		System.out.println(C2.getReal()+" i"+C2.getImaginary());
		System.out.println("Summation of two Complex Number :");
		System.out.println(C3.getReal()+" i"+C3.getImaginary());
		System.out.println("Multiplication of two Complex Number :");
		System.out.println(C4.getReal()+" i"+C4.getImaginary());
		
	}
}
