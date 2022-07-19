/*Print the following pattern : 
	*
	+++
	*****
	+++++++
	*********
	+++++++++++
*/

public class Question_2 {

	public static void main(String[] args) {
		int tem = 1;
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= tem; j++) {
				if (i % 2 == 0)
					System.out.print("*");
				else
					System.out.print("+");
			}
			tem += 2;
			System.out.println();
		}

	}

}