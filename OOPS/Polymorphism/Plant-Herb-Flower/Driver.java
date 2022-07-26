
public class Driver {
	private static int index = 0;
	final static int size = 500;
 
	public static void add(Plant[] plants, Plant p) { 
		if (index >= size) {
			System.out.println("Array size exceeds!");
			return;
		}

		plants[index] = p;
		index++;
	}

	public static void remove(Plant[] plants, String n) { 
		if (index > size)
			return;
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				for (int j = i; j < index - 1; j++)
					plants[j] = plants[j + 1];
				index--;
			}
		}
		
	}

	public static Plant search(Plant[] plants, String n) { 
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				return plants[i];
			}
		}
		return null;
	}

	public static void display(Plant[] plants) { 
		for (int i = 0; i < index; i++)
			System.out.println(plants[i]);
	}

	public static void main(String[] args) { 
		Plant[] plants = new Plant[size];
		Plant p;
		p = new Flower("Rose", "Red", true, true);
		add(plants, p);
		System.out.println(p.toString());
		p = new Herb("Mint", "Green", true, "spring");
		add(plants, p);
		System.out.println(p.toString());
		p = new Flower("Daffodil", "Yellow", true, false);
		add(plants, p);
		System.out.println(p.toString());
		p = new Herb("Oregano", "Green", true, "Summer");
		add(plants, p);
		System.out.println(p.toString());
		
		//display(plants);

		System.out.println("\nSearch....");
		
		Plant p1 = search(plants, "Rose");
		if (p1 != null) {
			System.out.println();
			System.out.println("Found!");
			System.out.println();
			
		} else {
			System.out.println("Not Found!");
		}

		remove(plants, "Rose");
		System.out.println("After remove....\n");
		display(plants);
		

	}
}