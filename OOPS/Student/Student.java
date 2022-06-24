public class Student {
	String name;
	int id;
	double cgpa;
	int semester;
	long phone;

	Student() {

	}

	Student(String name, int id, double cgpa, int semester, long phone) {
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		this.semester = semester;
		this.phone = phone;

	}

	public void DisplayInfo() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("CGPA : " + cgpa);
		System.out.println("Number of Semester : " + semester);
		System.out.println("Phone Number : " + phone);
	}
}
