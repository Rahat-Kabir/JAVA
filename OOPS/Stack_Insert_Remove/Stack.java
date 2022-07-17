class Stack {
	private int top;
	private int arr[];

	public Stack() {
		arr = new int[1000];
		top = -1;
	}

	public void insert(int a) {
		top++;
		arr[top] = a;
	}

	int remove() {
		int element = arr[top];
		top--;
		return element;
	}

	int search(int a) {
		for (int i = 0; i <= top; i++) {
			if (arr[i] == a) {
				return i;
			}
		}
		return -1;
	}

	int getStackSize() {
		return top + 1;
	}

	void displayStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void deleteStack() {
		arr = null;
	}
}