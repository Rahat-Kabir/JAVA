
public class TestStac {
	public static void main(String[] abc) {
		Stack s = new Stack();
		s.push(1);
		s.push(5);
		s.push(8);
		s.push(80);
		s.push(2);
		s.pop();
		s.pop();
		s.displayStack();
		System.out.println("\n" + "The size of the stack:" + s.getStackSize());
	}

}