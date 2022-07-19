
public class Question_03 {

	public static void printInfo(int n, char ch) {
		
		System.out.println("Int : " + n);
		System.out.println("Character : " + ch);
	}

	public static void printInfo(char ch, int n) {
		System.out.println("Character : " + ch);
		System.out.println("Int : " + n);
	}

	public static void main(String[] args) {
		printInfo(5, 'a');
		System.out.println();
		printInfo('a',5);
	}
}
