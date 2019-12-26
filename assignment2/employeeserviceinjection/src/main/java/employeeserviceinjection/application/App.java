package employeeserviceinjection.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import employeeserviceinjection.model.Employee;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//		Scan beans
		context.scan("employeeserviceinjection.service");
		context.scan("employeeserviceinjection.model");
		context.refresh();

		Employee e = context.getBean(Employee.class);
//		setting basic salary
		e.setBasicSalary(10000.0);
		
//		calling method of Employee Class to print salary
		e.showSalary();

		context.close();
	}

}
