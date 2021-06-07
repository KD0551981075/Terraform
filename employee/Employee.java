package employee;


//employee salary
//employee name
//group city
public class Employee {
	
	String name;
	String city;
	int salary;

	
	//constructor
	public Employee(String name, String city, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
