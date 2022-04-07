
public class Employee extends Person {
	private double annualSalary;
	private int year;
	private String insuranceNum;
	
	Employee(String name, double annualSalary, int year, String insuranceNum){
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		this.insuranceNum = insuranceNum;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public int getYear() {
		return year;
	}
	public String getInsuranceNum() {
		return insuranceNum;
	}
}
