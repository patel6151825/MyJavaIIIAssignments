package employeeserviceinjection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import employeeserviceinjection.service.EmployeeService;

@Component
public class Employee {
	final String qualifier = "manager";
	private Double basicSalary;

//	Inject EmployeeService Into Employee
	@Autowired
	@Qualifier(qualifier)
	EmployeeService service;

	public Employee() {
		super();
	}

//	getter to get basic salary
	public Double getBasicSalary() {
		return basicSalary;
	}
//	setter to set basic salary
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

//	method to print salary of manager or clerk
	public void showSalary() {
		System.out.println("Salary of " + qualifier + " is " + service.calculateSalary(getBasicSalary()) + " $");
	}
}