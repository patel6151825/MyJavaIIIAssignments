package employeeserviceinjection.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("clerk")
public class ClerkService implements EmployeeService {

//	Implementation of method calculateSalary
	@Override
	public Double calculateSalary(Double basicSalary) {

		// return addition of basic salary and some amount for clerk
		return basicSalary + 2000.0;
	}
}
