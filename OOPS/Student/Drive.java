
public class Drive {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Rahat";
		s1.id = 2122104642;
		s1.cgpa = 3.50;
		s1.semester = 4;
		s1.phone = 3999032;
		s1.DisplayInfo();
		System.out.println();
		Student s2 = new Student("kabir", 212345, 3.00, 4, 46456);
		s2.DisplayInfo();
	}

}
