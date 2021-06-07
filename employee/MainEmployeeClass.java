package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainEmployeeClass {
	
	public static void main(String args[])
	{
		//setting up values
		Employee sravan = new Employee("sravan", "bangalore", 100000);
		Employee datta = new Employee("datta", "chennai", 100000);
		Employee kalyan = new Employee("kalyan", "houston", 200000);
		Employee karthick = new Employee("karthick", "uruguay", 200000);
		
		//sort by name
		//filter: by city
		//sort by salary
		
		//creating a list
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(sravan);
		employeeList.add(datta);
		employeeList.add(karthick);
		employeeList.add(kalyan);
		
		
		//List result = names.stream().sorted().collect(Collectors.toList());
		
		//employeeList.stream().filter(x->x.getSalary()>100000).forEach(System.out::println);
		//sort by name
		employeeList.stream().map(Employee::getName).sorted().forEach(System.out::println);
		
		System.out.println("------city-----");
		
		//filter: by city
		employeeList.stream().map(Employee::getCity).sorted().forEach(System.out::println);
		
		System.out.println("------salary-----");
        
		employeeList.stream().filter(Employee -> Employee.getSalary()>100000).map(Employee::getName).forEach(System.out::println);
      
	
		
	}

}
