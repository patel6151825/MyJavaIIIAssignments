package employeeserviceinjection.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("manager")
public class ManagerService implements EmployeeService {

//	Implementation of method calculateSalary
	@Override
	public Double calculateSalary(Double basicSalary) {

		// return addition of basic salary and some amount for manager
		return basicSalary + 5000.0;
	}
}