package employeeserviceinjection.service;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	public Double calculateSalary(Double basicSalary);
}
