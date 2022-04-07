
public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e = new Employee("XYZ", 60000, 2000,"abc0203");
		System.out.println("Person name is :"+e.getName());
		System.out.println("Annual Salary is: "+ e.getAnnualSalary());
		System.out.println("The year the employee started to work is: "+e.getYear());
		System.out.println("The national insurance number is: "+e.getInsuranceNum());
	}
}
