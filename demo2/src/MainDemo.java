
public class MainDemo {

	public static void main(String[] args) {
		Department department1 = new Department(); // instantiation
		
		System.out.println(department1);  // prints memory address
		
		department1.setDeptId(20);
		department1.setDeptName("Hello");
		
		Department department2 =new Department();
		
		department2.setDeptId(30);
		department2.setDeptName("World");
		
		
		if (department1.getDeptId()==department2.getDeptId() && department1.getDeptName()==department2.getDeptName()) {
			System.out.println("yes they are equal");
		} else {
			System.out.println("Nope they are not");
		}
		
		
		
		department1=null;
		department2=null;
		
	}

}
