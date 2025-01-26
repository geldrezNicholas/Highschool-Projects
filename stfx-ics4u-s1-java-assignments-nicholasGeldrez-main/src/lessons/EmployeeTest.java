package lessons;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variable Declaration
		
		// short-cut to create common String object
		String mystring = "ohio gyatt rizz";
		
		// how to create an instance of an object
		String myString2 = new String("some text");
		
		// create new Employee object	
		Employee employee1 = new Employee();
		
		employee1.setName("John Curley");
		employee1.setBirthDate("September 13, 2006");
		employee1.setPosition("french fry guy");

		System.out.println(employee1.getName());
		System.out.println(employee1.getBirthDate());
		System.out.println(employee1.getPosition());

		// Create another Employee Object
		Employee employee2 = new Employee();
		
		// get data from second Employee
		
		System.out.println(employee2.getName());
		System.out.println(employee2.getBirthDate());
		System.out.println(employee2.getPosition());
		
		// Create a third Employee Object
		Employee employee3 = new Employee("Adam Peever","July 28, 2006", "French Fry Guy");
		
		// get data from third Employee
		System.out.println(employee3.getName());
		System.out.println(employee3.getBirthDate());
		System.out.println(employee3.getPosition());
		
		System.out.println("\n\n\n");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println("\n\n\n");
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());

	}

}
