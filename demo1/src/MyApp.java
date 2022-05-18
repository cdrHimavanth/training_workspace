//import java.util.Scanner;
public class MyApp {

	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
		Employee employee1 = new Employee(110,"asdf1",1002);
		Employee employee2 = new Employee(111,"asdf2",1001);
		Employee employee3 = new Employee();
		if(employee1.salary>employee2.salary) {
			System.out.println(employee1.empName);
		}else if(employee1.salary<employee2.salary) {
			System.out.println(employee2.empName);
		}else {
			System.out.println("Both have equal salary");
		}
		System.out.println(employee3.empId+" "+employee3.empName+" "+employee3.salary);
	}

}