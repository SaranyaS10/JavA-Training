package SpringBootWebdemoService;

import java.util.Set;

import SpringBootWebdemoModel.Employee;


public interface EmployeeService {

void add(Employee employee);
	
	Set<Employee> employees();
}
