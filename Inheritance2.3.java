package myproject;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1=new Person("Raghual");
		System.out.println(obj1.getNam());
		EmployeeDetails obj2=new EmployeeDetails(96, 2000, 350000, "seetharavi");
		System.out.println(obj2.getId());
		System.out.println(obj2.getInsuranceno());
		System.out.println(obj2.getSalary());
		System.out.println(obj2.getYear());
		
		

	}

}
