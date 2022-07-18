
public class Driver {

	public static void main(String[] args) {
		
		PartTimeEmployee e1 = new PartTimeEmployee();
		e1.setHours(5);
		e1.setRate(300.0);
		System.out.println(e1.toString());

		
		
		FullTimeEmployee fe1 = new FullTimeEmployee();
		fe1.setBasic(15000);
		fe1.setAllowance(25);
		System.out.println(fe1.toString());
	}

}
