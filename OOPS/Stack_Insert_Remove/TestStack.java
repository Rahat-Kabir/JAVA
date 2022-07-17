
public class TestStack {
	public static void main(String[] abc) {
		Stack s = new Stack();
		s.insert(1);
		s.insert(5);
		s.insert(8);
		s.insert(80);
		s.insert(2);
		s.remove();
		s.remove();
		s.displayStack();
		System.out.println("\n" + "The size of the stack:" + s.getStackSize());
	}

}